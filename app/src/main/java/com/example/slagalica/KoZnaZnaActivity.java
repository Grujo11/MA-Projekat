package com.example.slagalica;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class KoZnaZnaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_ko_zna_zna);

        FragmentTransition.to(IgraFragment.newInstance("param1", "param2"), KoZnaZnaActivity.this,
                false, R.id.headKoZnaZna);

        FloatingActionButton fab = findViewById(R.id.fab1);
        fab.setOnClickListener(view -> fab1());
    }

    protected void fab1() {
        Intent intent = new Intent(KoZnaZnaActivity.this, SpojniceActivity.class);
        startActivity(intent);
    }
}