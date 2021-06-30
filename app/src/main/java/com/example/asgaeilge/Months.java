package com.example.asgaeilge;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Months extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_months);

        this.setTitle(getString(R.string.míonna));
    }
}