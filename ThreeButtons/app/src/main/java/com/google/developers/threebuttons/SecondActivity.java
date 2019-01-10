package com.google.developers.threebuttons;

import android.app.ExpandableListActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private TextView textHeader;
    private TextView textContent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        setupViews();
    }

    public void setupViews() {
        textHeader = findViewById(R.id.text_header);
        textContent = findViewById(R.id.text_content);
    }

    public void setupHeader() {
        switch
        textHeader.setText(R.string.button_1);
    }

}