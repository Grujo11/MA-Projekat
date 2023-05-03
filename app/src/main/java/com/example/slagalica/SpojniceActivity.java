package com.example.slagalica;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class SpojniceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_spojnice);

        FragmentTransition.to(IgraFragment.newInstance("param1", "param2"), SpojniceActivity.this,
                false, R.id.headSpojnice);

        FloatingActionButton fab = findViewById(R.id.fab2);
        fab.setOnClickListener(view -> fab2());
    }

    protected void fab2() {
        Intent intent = new Intent(SpojniceActivity.this, AsocijacijeActivity.class);
        startActivity(intent);
    }
}