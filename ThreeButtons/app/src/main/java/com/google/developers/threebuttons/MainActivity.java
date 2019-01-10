package com.google.developers.threebuttons;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button button1;
    private Button button2;
    private Button button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       setupViews();
       setupClicks();
    }

    public void setupViews() {
        button1 = findViewById(R.id.text1);
        button2 = findViewById(R.id.text2);
        button3 = findViewById(R.id.text3);
    }

    public void setupClicks() {
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setupIntents();
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setupIntents();
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setupIntents();
            }
        });
    }

    public void setupIntents() {
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
    }

}