package com.example.newapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Activity7 extends AppCompatActivity {

    private Button btn3,btn4;
    private TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);

        getSupportActionBar().setTitle("Climate");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);

        txt = findViewById(R.id.txt1);

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt.setText("Between 25.0°C and 34.0°C");
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt.setText("Cloudy and Rains Often");
            }
        });


    }

}
