package com.example.myinstagram.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.myinstagram.R;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_login);
    }
}