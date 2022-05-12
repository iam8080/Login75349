package com.example.login75349;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class SignIn extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getSupportActionBar().hide();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
    }
}