package com.example.slagalica;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Timer;
import java.util.TimerTask;

public class NaslovnaActivity extends AppCompatActivity {

    public static final int SPLASH_TIMEOUT = 1000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_naslovna);

        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                startActivity(new Intent(NaslovnaActivity.this, MainActivity.class));
                finish();
            }
        }, SPLASH_TIMEOUT);
    }
}