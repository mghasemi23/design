package com.example.uefi.design;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import static com.example.uefi.design.Start_frgment.charityList;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomNavigationView   bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottom_nav);
        def();
        Charity charity = new Charity("محک" ,"کمک به کودکان سرطانی "  , R.drawable.charit , false);
        charityList.add(charity);
        charityList.add(new Charity("یاوران" , "کمک به کودکان" , R.drawable.char3 , false));
        charityList.add(new Charity("یاوران" , "کمک به یتیمان" , R.drawable.char2 , true));
        charityList.add(new Charity("خاوران" ,  "کمک به کودکان سرطانی ", R.drawable.char3 , false));

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.bottombaritem_home:
                        // TODO
                       def();

                        return true;
                    case R.id.bottombaritem_star:
                       // Toast.makeText(getApplicationContext(),charityList.get(0).toString() , Toast.LENGTH_SHORT).show();
                        android.support.v4.app.FragmentManager fragmentManager = getSupportFragmentManager();
                        android.support.v4.app.FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                        favoritsfragment beginfragment = new favoritsfragment();
                        fragmentTransaction.replace(R.id.fragment_container , beginfragment);
                        fragmentTransaction.commit();
                        // TODO

                        return true;
                    case R.id.bottombaritem_profile:
                        // TODO
                        android.support.v4.app.FragmentManager fragmentManager2 = getSupportFragmentManager();
                        android.support.v4.app.FragmentTransaction fragmentTransaction2 = fragmentManager2.beginTransaction();
                        profileinfoFragment hellofragment = new profileinfoFragment();
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
            Intent intent = new Intent(MainActivity.this, Detail.class);
            startActivity(intent);
            Toast.makeText(getApplicationContext(), " lol ", Toast.LENGTH_SHORT);
            return true;
        }
        switch (item.getItemId()) {
            case android.R.id.home:
                Toast.makeText(getApplicationContext(), " lol ", Toast.LENGTH_SHORT);
                return true;
        }
        return true;
      //  return super.onOptionsItemSelected(item);
    }
    public  void def(){
        android.support.v4.app.FragmentManager fragmentManager = getSupportFragmentManager();
        android.support.v4.app.FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        Homefragment beginfragment = new Homefragment();
        fragmentTransaction.replace(R.id.fragment_container , beginfragment);
        fragmentTransaction.commit();
    }

    @Override
    public void onBackPressed() {
        //super.onBackPressed();
        finish();
    }
}

