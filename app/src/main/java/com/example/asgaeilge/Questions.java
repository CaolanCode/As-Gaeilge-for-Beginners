package com.example.asgaeilge;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Questions extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questions);

        this.setTitle(getString(R.string.ceistanna));
    }
}