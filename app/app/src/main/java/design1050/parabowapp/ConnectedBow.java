package design1050.parabowapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import p
import pocketsphinx.cmu.pocketsphinx.Assets;
import edu.cmu.pocketsphinx.Hypothesis;
import edu.cmu.pocketsphinx.RecognitionListener;
import edu.cmu.pocketsphinx.SpeechRecognizer;
import edu.cmu.pocketsphinx.SpeechRecognizerSetup;

public class ConnectedBow extends AppCompatActivity implements  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_connected_bow);
    }
}
