package com.example.newapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Activity8 extends AppCompatActivity {

    Button button4;
    TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_8);

        getSupportActionBar().setTitle("Happy Vacationing");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        button4 = (Button) findViewById(R.id.button4);

        txt = findViewById(R.id.text2);

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt.setText("Thanks for your review. We are trying to improve everyday. Have a safe and fun journey!");
            }
        });

    }
}
