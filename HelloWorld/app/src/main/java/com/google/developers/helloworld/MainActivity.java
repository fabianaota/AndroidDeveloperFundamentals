package com.google.developers.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    public static final String MAIN_ACTIVITY = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(MAIN_ACTIVITY, "DEBUG: Happy New Year!");
        Log.i(MAIN_ACTIVITY, "INFO: Happy New Year!");
        Log.w(MAIN_ACTIVITY, "WARN: Happy New Year!");
        Log.e(MAIN_ACTIVITY, "ERROR: Happy New Year!");
    }

}