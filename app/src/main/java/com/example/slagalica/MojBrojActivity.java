package com.example.slagalica;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class MojBrojActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_moj_broj);

        FragmentTransition.to(IgraFragment.newInstance("param1", "param2"), MojBrojActivity.this,
                false, R.id.headMojBroj);
    }
}