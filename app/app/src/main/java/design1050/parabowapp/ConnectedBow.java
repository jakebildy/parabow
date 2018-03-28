package design1050.parabowapp;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothSocket;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Set;
import java.util.UUID;


public class ConnectedBow extends AppCompatActivity   {

    BluetoothSocket socket;
    BluetoothDevice device = null;


    public void sendFireMsg(){
        UUID uuid = UUID.fromString("94f39d29-7d6d-437d-973b-fba39e49d4ee"); //Standard SerialPortService ID
        try {

            socket = device.createRfcommSocketToServiceRecord(uuid);
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

        sendFireMsg();
    }
}

