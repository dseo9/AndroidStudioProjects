package ca.bcit.speak;

import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import java.util.Locale;

public class MainActivity
    extends AppCompatActivity
{
    private static final String TAG = MainActivity.class.getName();
    private TextToSpeech textToSpeech;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textToSpeech = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status)
            {
                if(status != TextToSpeech.ERROR)
                {
                    textToSpeech.setLanguage(Locale.UK);
                }
            }
        });
    }

    public void speak(final View view)
    {
        Log.v(TAG, "entering speak");
        textToSpeech.speak("Hello, World!",
                            TextToSpeech.QUEUE_FLUSH,
                            null,
                            "8");
        Log.v(TAG, "exiting speak");
    }
}
