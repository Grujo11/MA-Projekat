package com.example.slagalica;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class AsocijacijeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_asocijacije);

        FragmentTransition.to(IgraFragment.newInstance("param1", "param2"), AsocijacijeActivity.this,
                false, R.id.headAsocijacije);

        FloatingActionButton fab = findViewById(R.id.fab3);
        fab.setOnClickListener(view -> fab3());
    }

    protected void fab3() {
        Intent intent = new Intent(AsocijacijeActivity.this, SkockoActivity.class);
        startActivity(intent);
    }
}