package com.example.ho7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Policie extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_policie);
        findViewById(R.id.button).setOnClickListener(view -> {
            finishAffinity();
        });
    }
}