package com.example.slagalica;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.FragmentTransaction;

import com.google.android.material.navigation.NavigationView;


public class MainActivity extends AppCompatActivity {

    private DrawerLayout mDrawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupToolbarAndActionbar();

        setupNavigationAndDrawer();

        loadMainFragment();
    }
    @SuppressLint("NonConstantResourceId")
    private void setupNavigationAndDrawer(){
        mDrawerLayout = findViewById(R.id.drawer_layout);

        NavigationView navigationView = findViewById(R.id.navigation_view);
        navigationView.setNavigationItemSelectedListener(menuItem -> {
            menuItem.setChecked(true);
            mDrawerLayout.closeDrawers();

            switch (menuItem.getItemId()) {

                case R.id.profil:
                    Toast.makeText(MainActivity.this, "Moj profil", Toast.LENGTH_SHORT).show();
                    toProfil();
                    return true;
                case R.id.nav_login:
                    Toast.makeText(MainActivity.this, "Odjavljeni ste", Toast.LENGTH_SHORT).show();
                    logout();
                    return true;
                case R.id.nav_logout:
                    toLogin();
                    return true;
            }
            return true;
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.meni, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        switch (id) {
            case android.R.id.home:
                mDrawerLayout.openDrawer(GravityCompat.START);
                return true;
            case R.id.action_settings:
                return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private void loadMainFragment(){
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container_main, new TabbedMainFragment() ).commit();
    }

    private void setupToolbarAndActionbar(){
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setHomeAsUpIndicator(R.drawable.ic_menu);
        actionBar.setDisplayHomeAsUpEnabled(true);

        replaceToolbarTextWithIcon(actionBar, toolbar);
    }
    private void replaceToolbarTextWithIcon(ActionBar actionBar, Toolbar toolbar) {
        actionBar.setDisplayShowTitleEnabled(false);
        toolbar.setLogo(R.mipmap.ic_launcher);
    }
    private void toLogin(){
        startActivity(new Intent(MainActivity.this, LoginActivity.class));
        finish();
    }
    private void toProfil(){
        startActivity(new Intent(MainActivity.this, ProfilActivity.class));
        finish();
    }
    private void logout(){

    }
    public void toGameActivity(View v){

        Activity currentParent = MainActivity.this;

        startActivity(new Intent(currentParent, KoZnaZnaActivity.class));
        currentParent.finish();
    }


}