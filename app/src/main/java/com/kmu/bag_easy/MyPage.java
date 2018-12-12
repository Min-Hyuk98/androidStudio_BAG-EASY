package com.kmu.bag_easy;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.Button;
import android.view.View;
import android.widget.TextView;

public class MyPage extends AppCompatActivity {
    private BottomNavigationView bottomNavigationView;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_page);

        bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottom_navigation_my_page);

        bottomNavigationView.setOnNavigationItemSelectedListener(
                new BottomNavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                        switch (item.getItemId()) {

                            case R.id.home_menu:
                                startActivity(new Intent(MyPage.this, Home.class));
                                return true;
                            case R.id.review_menu:
                                startActivity(new Intent(MyPage.this, Review.class));
                                return true;
                            case R.id.about_us_menu:
                                startActivity(new Intent(MyPage.this, AboutUs.class));
                                return true;
                        }
                        return false;
                    }
                });
    }
}
