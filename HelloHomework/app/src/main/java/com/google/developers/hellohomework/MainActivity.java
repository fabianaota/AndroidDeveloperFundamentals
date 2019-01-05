package com.google.developers.hellohomework;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int mCount = 0;
    private TextView mShowCount;
    private Button buttonZero;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = findViewById(R.id.show_count);
        buttonZero = findViewById(R.id.button_zero);
    }

    public void showToast(View view) {
        Toast toast = Toast.makeText(this, R.string.toast_message, Toast.LENGTH_SHORT);
        toast.show();
    }

    public void countUp(View view) {
        mCount++;
        mShowCount.setText(String.valueOf(mCount));
        buttonZero.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
    }

    public void zero(View view) {
        mCount = 0;
        mShowCount.setText(String.valueOf(mCount));
        buttonZero.setBackgroundColor(getResources().getColor(R.color.colorDarkerGray));
    }

}