package com.example.newapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Activity4 extends AppCompatActivity implements View.OnClickListener {

    private ImageView ctg1,ctg2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4);

        getSupportActionBar().setTitle("Chittagong");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ctg1 = findViewById(R.id.ctg1);
        ctg2 = findViewById(R.id.ctg2);

        ctg1.setOnClickListener(this);
        ctg2.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        if(view.getId() == R.id.ctg1 )
        {
            ctg1.setVisibility(View.GONE);
            ctg2.setVisibility(View.VISIBLE);
        }

        else if(view.getId() == R.id.ctg2 )
        {
            ctg2.setVisibility(View.GONE);
            ctg1.setVisibility(View.VISIBLE);
        }
    }
}
