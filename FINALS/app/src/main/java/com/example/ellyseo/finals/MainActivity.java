package com.example.ellyseo.finals;

import android.content.Intent;
import android.graphics.Color;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button b;
    EditText et;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b = (Button)findViewById(R.id.countDown);
        et = (EditText)findViewById(R.id.editText);
        //int value = Integer.parseInt(et.getText().toString());   THIS IS THE ONE LINE

        b.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                countDown task = new countDown();
                task.execute();
            }
        });


    }

    private class countDown extends AsyncTask<Void, Void, Void> {
        int value = Integer.parseInt(et.getText().toString());
        View v = getWindow().getDecorView();

        @Override
        protected Void doInBackground(Void... voids) {

            Thread timer = new Thread() {
                public void run() {
                    try {
                        while (value > 0) {
                            runOnUiThread(new Runnable() {
                                @Override
                                public void run() {
                                    value--;
                                    Log.d("VALUES", "value: " + value);

                                    if (value % 2 == 1) {
                                        v.setBackgroundColor(Color.YELLOW);

                                    } else {
                                        v.setBackgroundColor(Color.GRAY);

                                    }
                                }
                            });
                            sleep(1000);
                        }
                    } catch(InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            };


            timer.start();

            return null;
        }
    }

}
