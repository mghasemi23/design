package com.example.uefi.design;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomNavigationView   bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottom_nav);
        def();

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.bottombaritem_home:
                        // TODO
                       def();

                        return true;
                    case R.id.bottombaritem_star:
                        android.support.v4.app.FragmentManager fragmentManager = getSupportFragmentManager();
                        android.support.v4.app.FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                        frag1 beginfragment = new frag1();
                        fragmentTransaction.replace(R.id.fragment_container , beginfragment);
                        fragmentTransaction.commit();
                        // TODO

                        return true;
                    case R.id.bottombaritem_profile:
                        // TODO
                        android.support.v4.app.FragmentManager fragmentManager2 = getSupportFragmentManager();
                        android.support.v4.app.FragmentTransaction fragmentTransaction2 = fragmentManager2.beginTransaction();
                        Hellofragment hellofragment = new Hellofragment();
                        fragmentTransaction2.replace(R.id.fragment_container , hellofragment);
                        fragmentTransaction2.commit();
                        return true;
                }
                return false;
            }
        });

        Toolbar toolbar = (Toolbar)findViewById(R.id.toolbar) ;

         setSupportActionBar(toolbar);




}



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.edit_exit) {
           // finish();
            Intent intent = new Intent(MainActivity.this, LOgin.class);
            startActivity(intent);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    public  void def(){
        android.support.v4.app.FragmentManager fragmentManager = getSupportFragmentManager();
        android.support.v4.app.FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        beginfragment beginfragment = new beginfragment();
        fragmentTransaction.replace(R.id.fragment_container , beginfragment);
        fragmentTransaction.commit();
    }


    }

