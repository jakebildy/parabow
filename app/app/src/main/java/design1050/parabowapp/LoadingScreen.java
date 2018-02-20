package design1050.parabowapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import static java.lang.Thread.sleep;

public class LoadingScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loading_screen);


        final Intent intent = new Intent(this, MainActivity.class);

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
