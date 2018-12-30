package com.example.gymdw.nuggetcounter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.support.v7.widget.Toolbar;

public class MainActivity3 extends AppCompatActivity {
    String getNum;
    TextView tv1;
    TextView tv2;
    TextView tv3;
    TextView tv4;
    TextView tv5;
    TextView tv6;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Toolbar myToolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(myToolbar);


        getNum = getIntent().getStringExtra("num");
        int value = Integer.parseInt(getNum);
        tv1 = (TextView) findViewById(R.id.textView);
        tv2 = (TextView) findViewById(R.id.textView2);
        tv3 = (TextView) findViewById(R.id.textView3);
        tv4 = (TextView) findViewById(R.id.textView4);
        tv5 = (TextView) findViewById(R.id.textView5);
        tv6 = (TextView) findViewById(R.id.textView6);


        if (value >= 10) {
            tv1.setText("ATE 10 NUGGETS!!");
        }
        if (value >= 20) {
            tv2.setText("ATE 20 NUGGETS!!");
        }
        if (value >= 30) {
            tv3.setText("ATE 30 NUGGETS!!");
        }
        if (value >= 40) {
            tv1.setText("ATE 40 NUGGETS!!");
        }
        if (value >= 50) {
            tv2.setText("ATE 50 NUGGETS!!");
        }
        if (value >= 60) {
            tv3.setText("ATE 60 NUGGETS!!");
        }


    }

    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
      int id = item.getItemId();
      if (id == R.id.achievement){
          Intent i = new Intent(MainActivity3.this, MainActivity3.class);
          startActivity(i);
          return true;
      }
      return super.onOptionsItemSelected(item);
    }
}
