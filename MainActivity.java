package com.example.myapp;

import android.os.Bundle;
import android.util.Log;
import android.app.Activity;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
    public static final String TAG = "LifeActivity";
    private Integer counter = 5;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState != null &&
                savedInstanceState.containsKey("counter")) {
            counter = savedInstanceState.getInt("counter");
        }
        Log.d(TAG, "onCreate");
        Toast.makeText(this, "onCreate()", Toast.LENGTH_LONG).show();
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("counter", counter);
        Log.d(TAG, "onSaveInstanceState");
    }
    @Override
    public void onPause(){
        super.onPause();
        Log.d(TAG, "onPause");
    }
    @Override
    public void onStop(){
        super.onStop();
        Log.d(TAG, "onStop");
    }
    @Override
    public void onDestroy(){
        super.onDestroy();
        Log.d(TAG, "onDestroy");
    }
    @Override
    public void onRestart(){
        super.onRestart();
        Log.d(TAG, "onRestart");
    }
    @Override
    public void onStart(){
        super.onStart();
        Log.d(TAG, "onStart");
        resetUI();
    }

    private void resetUI() {
        ((TextView) findViewById(R.id.txt_counter)).setText(counter.toString());
        Log.d(TAG, "resetUI");
    }

    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        counter = savedInstanceState.getInt("counter");
        Log.d(TAG, "onRestoreInstanceState");
    }
    @Override
    public void onResume(){
        super.onResume();
        Log.d(TAG, "onResume");
    }