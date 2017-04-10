package com.example.xu.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import java.util.Timer;
import java.util.TimerTask;
public class MainActivity extends AppCompatActivity {
      @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
          Timer timer=new Timer();
          TimerTask task=new TimerTask() {
              @Override
              public void run() {
                  Intent intent=new Intent();
                  intent.setClass(MainActivity.this,LoginActivity.class);
                  startActivity(intent);
                  MainActivity.this.finish();
              }
          };
          timer.schedule(task,500);
      }
}
