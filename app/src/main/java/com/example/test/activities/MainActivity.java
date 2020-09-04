package com.example.test.activities;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.test.R;

public class MainActivity extends AppCompatActivity {
    TextView showCounter;
    Button increaseButton, resetButton;
    int counter = 0;

    private View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.increase_button:
                    increaseCounter();
                    break;
                case R.id.reset_button:
                    resetCounter();
                    break;
            }
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showCounter = findViewById(R.id.show_counter);
        increaseButton = findViewById(R.id.increase_button);
//        increaseButton.setOnClickListener(onClickListener);
        resetButton = findViewById(R.id.reset_button);
//        resetButton.setOnClickListener(onClickListener);

        getData();
    }
    private void getData(){
        increaseButton.setOnClickListener(onClickListener);
        resetButton.setOnClickListener(onClickListener);

    }
    @SuppressLint("SetTextI18n")
    private void increaseCounter(){
        counter++;
        showCounter.setText(counter+"");
    }
    @SuppressLint("SetTextI18n")
    private void resetCounter(){
        counter=0;
        showCounter.setText(counter+"");
    }
}