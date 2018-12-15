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


public class Home extends AppCompatActivity {

    private BottomNavigationView bottomNavigationView;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottom_navigation_home);

        bottomNavigationView.setOnNavigationItemSelectedListener(
                new BottomNavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                        switch (item.getItemId()) {

                            case R.id.about_us_menu:
                                startActivity(new Intent(Home.this, AboutUs.class));
                                return true;
                            case R.id.review_menu:
                                startActivity(new Intent(Home.this, Review.class));
                                return true;
                            case R.id.myPage_menu:
                                startActivity(new Intent(Home.this, MyPage.class));
                                return true;
                        }
                        return false;
                    }
                });

        ImageButton.OnClickListener onClickListener = new ImageButton.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()) {
                    case R.id.button_seoul :
                        startActivity(new Intent(Home.this, Book1.class));
                        break ;
                    case R.id.button_busan :
                        startActivity(new Intent(Home.this, Book1.class));
                        break ;
                    case R.id.button_jeonju :
                        startActivity(new Intent(Home.this, Book1.class));
                        break ;
                    case R.id.button_incheon :
                        startActivity(new Intent(Home.this, Book1.class));
                        break ;
                    case R.id.button_jeju :
                        startActivity(new Intent(Home.this, Book1.class));
                        break ;
                    case R.id.button_daegu :
                        startActivity(new Intent(Home.this, Book1.class));
                        break ;
                    case R.id.button_yeosu :
                        startActivity(new Intent(Home.this, Book1.class));
                        break ;
                }
    }
} ;
        ImageButton button_seoul = (ImageButton) findViewById(R.id.button_seoul) ;
                button_seoul.setOnClickListener(onClickListener) ;
                ImageButton button_busan = (ImageButton) findViewById(R.id.button_busan) ;
                button_busan.setOnClickListener(onClickListener) ;
                ImageButton button_jeonju = (ImageButton) findViewById(R.id.button_jeonju) ;
                button_jeonju.setOnClickListener(onClickListener) ;
                ImageButton button_incheon = (ImageButton) findViewById(R.id.button_incheon) ;
                button_incheon.setOnClickListener(onClickListener) ;
                ImageButton button_jeju = (ImageButton) findViewById(R.id.button_jeju) ;
                button_jeju.setOnClickListener(onClickListener) ;
                ImageButton button_daegu = (ImageButton) findViewById(R.id.button_daegu) ;
                button_daegu.setOnClickListener(onClickListener) ;
                ImageButton button_yeosu = (ImageButton) findViewById(R.id.button_yeosu) ;
                button_yeosu.setOnClickListener(onClickListener) ;


    }
}
