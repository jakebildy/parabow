package design1050.parabowapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.VideoView;

import static java.lang.Thread.sleep;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final Intent intent = new Intent(this, BluetoothDevices.class);

        Thread thread = new Thread(new Runnable()
        {
            @Override
            public void run()
            {
                try {
                    sleep(3000);

                    startActivity(intent);

                }
                catch (Exception e)
                {}
            }

        });
        thread.start();
    }
}
