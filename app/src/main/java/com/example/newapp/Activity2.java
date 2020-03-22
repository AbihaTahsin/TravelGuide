package com.example.newapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class Activity2 extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    private Button button2,button3,btnx;
    Spinner spinner1,spinner2;
    String SpinnerValue, SpinnerValue2;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        getSupportActionBar().setTitle("Travel Guide");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        spinner1 = findViewById(R.id.spinner1);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.cityNames, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner1.setAdapter(adapter);
        spinner1.setOnItemSelectedListener(this);

        spinner2 = findViewById(R.id.spinner2);
        ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource(this,
                R.array.monNames, android.R.layout.simple_spinner_item);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner2.setAdapter(adapter2);
        spinner2.setOnItemSelectedListener(this);

        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityn();
            }
        });

        button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity3();
            }
        });

        btnx = (Button) findViewById(R.id.btnx);
        btnx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity8();
            }
        });
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        SpinnerValue = (String)spinner1.getSelectedItem();
        SpinnerValue2 = (String)spinner2.getSelectedItem();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

    public void openActivity8() {
        Intent intent = new Intent(this, Activity8.class);
        startActivity(intent);
    }

    public void openActivity3() {

        switch (SpinnerValue2) {

            case "April 2020":
                intent = new Intent(this, Activity3.class);
                startActivity(intent);
                break;

            case "June 2020":
                intent = new Intent(this, Activity7.class);
                startActivity(intent);
                break;
        }
    }

    public void openActivityn() {
        switch(SpinnerValue){

            case "Chittagong":
                intent = new Intent(this, Activity4.class);
                startActivity(intent);
                break;

            case "Sylhet":
                intent = new Intent(this, Activity5.class);
                startActivity(intent);
                break;

            case "Rangamati":
                intent = new Intent(this, Activity6.class);
                startActivity(intent);
                break;
        }






}}
