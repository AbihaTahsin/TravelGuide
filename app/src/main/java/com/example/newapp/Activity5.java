package com.example.newapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Activity5 extends AppCompatActivity implements View.OnClickListener {

    private ImageView syl1,syl2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_5);

        getSupportActionBar().setTitle("Sylhet");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        syl1 = findViewById(R.id.syl1);
        syl2 = findViewById(R.id.syl2);

        syl1.setOnClickListener(this);
        syl2.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        if(view.getId() == R.id.syl1 )
        {
            syl1.setVisibility(View.GONE);
            syl2.setVisibility(View.VISIBLE);
        }

        else if(view.getId() == R.id.syl2 )
        {
            syl2.setVisibility(View.GONE);
            syl1.setVisibility(View.VISIBLE);
        }
    }
}