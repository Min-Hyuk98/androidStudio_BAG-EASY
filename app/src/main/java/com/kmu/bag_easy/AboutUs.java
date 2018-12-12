package com.kmu.bag_easy;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.Button;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class AboutUs extends AppCompatActivity {

    private BottomNavigationView bottomNavigationView;
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);

        bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottom_navigation_about_us);

        bottomNavigationView.setOnNavigationItemSelectedListener(
                new BottomNavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                        switch (item.getItemId()) {

                            case R.id.home_menu:
                                startActivity(new Intent(AboutUs.this, Home.class));
                                return true;
                            case R.id.review_menu:
                                startActivity(new Intent(AboutUs.this, Review.class));
                                return true;
                            case R.id.myPage_menu:
                                startActivity(new Intent(AboutUs.this, MyPage.class));
                                return true;
                        }
                        return false;
                    }
                });



    }
}