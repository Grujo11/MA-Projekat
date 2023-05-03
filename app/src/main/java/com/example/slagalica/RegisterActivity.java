package com.example.slagalica;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class RegisterActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        findViewById(R.id.registerBtn).setOnClickListener(view -> register(view));
    }

    private void register(View view) {
//        TODO credential check
//        if( !credentialsExist ){
//                          ...
        Toast.makeText(RegisterActivity.this, "Registrovani ste", Toast.LENGTH_SHORT).show();

        toLoginActivity(view);
//        } else{
//              ...
//        }
    }
    private void toLoginActivity(View v) {
        startActivity(new Intent(RegisterActivity.this, LoginActivity.class));
        finish();
    }

}