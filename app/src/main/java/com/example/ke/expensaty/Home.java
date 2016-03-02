package com.example.ke.expensaty;

import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

public class Home extends AppCompatActivity {


    Toolbar toolbar;
    DrawerLayout drawerlayout;
    ActionBarDrawerToggle actionbardrawertoggle;
    NavigationView navigationview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        drawerlayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        actionbardrawertoggle = new ActionBarDrawerToggle(this, drawerlayout, toolbar, R.string.drawer_open, R.string.drawer_close);
        drawerlayout.setDrawerListener(actionbardrawertoggle);
        navigationview = (NavigationView) findViewById(R.id.navigation_view);
        navigationview.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem item) {

                switch (item.getItemId()) {
/*  this ID found in the menu xml file*/
                    case R.id.home_id:
                      /*  Intent i = new Intent(MainActivity.this, MainActivity.class);
                        startActivity(i);*/
                        break;
                    case R.id.add_expense:
                       /* Intent mmessage = new Intent(MainActivity.this, MMessages.class);
                        startActivity(mmessage);*/
                        break;
                    case R.id.add_income:
                       /* Intent gp = new Intent(MainActivity.this, Grouprr.class);
                        startActivity(gp);*/
                        break;


                }


                return false;
            }
        });


        getSupportActionBar().setTitle(R.string.home);
    }


    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        actionbardrawertoggle.syncState();

    }
}

