package com.google.developers.threebuttons;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private static final String TEXT_1 = "" ;
    private static final String TEXT_2 = "" ;
    private static final String TEXT_3 = "" ;
    private Button button1;
    private Button button2;
    private Button button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = findViewById(R.id.text1);
        button2 = findViewById(R.id.text2);
        button3 = findViewById(R.id.text3);
    }

    public void click1(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        Bundle bundle = new Bundle();
        bundle.putString(TEXT_1, "text 1");
    }

    public void click2(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        Bundle bundle = new Bundle();
        bundle.putString(TEXT_2, "text 2");
    }

    public void click3(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        Bundle bundle = new Bundle();
        bundle.putString(TEXT_3, "text 3");
    }
}