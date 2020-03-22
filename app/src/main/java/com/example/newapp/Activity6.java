package com.example.newapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Activity6 extends AppCompatActivity implements View.OnClickListener {

    private ImageView ran1,ran2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_6);

        getSupportActionBar().setTitle("Rangamati");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ran1 = findViewById(R.id.ran1);
        ran2 = findViewById(R.id.ran2);

        ran1.setOnClickListener(this);
        ran2.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        if(view.getId() == R.id.ran1 )
        {
            ran1.setVisibility(View.GONE);
            ran2.setVisibility(View.VISIBLE);
        }

        else if(view.getId() == R.id.ran2 )
        {
            ran2.setVisibility(View.GONE);
            ran1.setVisibility(View.VISIBLE);
        }
    }
}
