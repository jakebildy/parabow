package design1050.parabowapp;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothSocket;
import android.content.Intent;
import android.speech.RecognizerIntent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Set;
import java.util.UUID;


public class ConnectedBow extends AppCompatActivity   {

    BluetoothSocket socket;
    BluetoothDevice device = null;


    public void sendFireMsg(){
        UUID uuid = UUID.fromString("94f39d29-7d6d-437d-973b-fba39e49d4ee"); //Standard SerialPortService ID
        try {

            if (socket == null)
            {
                socket = device.createRfcommSocketToServiceRecord(uuid); 
            }
            if (!socket.isConnected()){
                socket.connect();
            }

            String msg = "fire";
            OutputStream outputStream = socket.getOutputStream();
            outputStream.write(msg.getBytes());
            System.out.println("Fired!!");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_connected_bow);

        Button speechButton = (Button) findViewById(R.id.speechButton);
        speechButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startAudio2Text();
            }
        });

        BluetoothAdapter adapter = BluetoothAdapter.getDefaultAdapter();

        if(adapter.getBondedDevices().size() > 0)
        {
            for(BluetoothDevice x : adapter.getBondedDevices())
            {
                if(x.getName().equals("Parabow v1.0"))
                {
                    device = x;
                    break;
                }
            }
        }
    }

    public void startAudio2Text() {
        Intent i = new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
        i.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL, RecognizerIntent.LANGUAGE_MODEL_FREE_FORM);
        i.putExtra(RecognizerIntent.EXTRA_LANGUAGE, Locale.getDefault());
        i.putExtra(RecognizerIntent.EXTRA_PROMPT, "Say the trigger word to fire the bow");

        try {
            startActivityForResult(i, 100);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }

    public void onActivityResult(int requestCode, int resultCode, Intent i)
    {
        super.onActivityResult(requestCode,resultCode,i);

        switch(requestCode) {

            case 100:
                if (resultCode == RESULT_OK && i != null)
                {
                    ArrayList<String> result = i.getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);
                    TextView s2tText = (TextView) findViewById(R.id.speech2text);
                    s2tText.setText("You said: " + result.get(0));


                    if (result.get(0).equals("fire"))
                    {
                        sendFireMsg();
                    }
                }
                break;

        }
    }
}

