package com.example.slagalica;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        findViewById(R.id.loginBtn).setOnClickListener(view -> authenticate(view));
        findViewById(R.id.toRegisterBtn).setOnClickListener(view -> toRegister(view));
    }

    private void authenticate(View view) {
        Toast.makeText(LoginActivity.this, "Prijavljeni ste", Toast.LENGTH_SHORT).show();

        toMainActivity(view);
//
    }
    private void toMainActivity(View v){
        startActivity(new Intent(LoginActivity.this, MainActivity.class));
        finish();
    }
    private void toRegister(View v){
        startActivity(new Intent(LoginActivity.this, RegisterActivity.class));
        finish();
    }
}