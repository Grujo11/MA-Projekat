package com.example.slagalica;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class KorakPoKorakActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_korak_po_korak);

        FragmentTransition.to(IgraFragment.newInstance("param1", "param2"), KorakPoKorakActivity.this,
                false, R.id.headMojBroj);

        FloatingActionButton fab = findViewById(R.id.fab5);
        fab.setOnClickListener(view -> fab5());
    }

    protected void fab5() {
        Intent intent = new Intent(KorakPoKorakActivity.this, MojBrojActivity.class);
        startActivity(intent);
    }
}