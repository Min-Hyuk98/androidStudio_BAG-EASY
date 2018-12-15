package com.kmu.bag_easy;

import android.content.Intent;
import android.content.res.AssetManager;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.Button;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.content.Context;
import java.io.InputStream;

public class Book1 extends AppCompatActivity {

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book1);


        ImageButton.OnClickListener onClickListener = new ImageButton.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()) {
                    case R.id.map1:
                        startActivity(new Intent(Book1.this, MapsActivity.class));
                        break;
                    case R.id.map2:
                        startActivity(new Intent(Book1.this, MapsActivity.class));
                        break;
                    case R.id.map3:
                        startActivity(new Intent(Book1.this, MapsActivity.class));
                        break;
                    case R.id.map4:
                        startActivity(new Intent(Book1.this, MapsActivity.class));
                        break;
                    case R.id.map5:
                        startActivity(new Intent(Book1.this, MapsActivity.class));
                        break;

                    case R.id.button1:
                        startActivity(new Intent(Book1.this, CompleteReservation.class));
                        break;
                    case R.id.button2:
                        startActivity(new Intent(Book1.this, CompleteReservation.class));
                        break;
                    case R.id.button3:
                        startActivity(new Intent(Book1.this, CompleteReservation.class));
                        break;
                    case R.id.button4:
                        startActivity(new Intent(Book1.this, CompleteReservation.class));
                        break;
                    case R.id.button5:
                        startActivity(new Intent(Book1.this, CompleteReservation.class));
                        break;

                }

            }
        };

        Button button_1 = (Button) findViewById(R.id.map1) ;
        button_1.setOnClickListener(onClickListener) ;
        Button button_2 = (Button) findViewById(R.id.map2) ;
        button_2.setOnClickListener(onClickListener) ;
        Button button_3 = (Button) findViewById(R.id.map3) ;
        button_3.setOnClickListener(onClickListener) ;
        Button button_4 = (Button) findViewById(R.id.map4) ;
        button_4.setOnClickListener(onClickListener) ;
        Button button_5 = (Button) findViewById(R.id.map5) ;
        button_5.setOnClickListener(onClickListener) ;


        Button button_11 = (Button) findViewById(R.id.button1) ;
        button_11.setOnClickListener(onClickListener) ;
        Button button_22 = (Button) findViewById(R.id.button2) ;
        button_22.setOnClickListener(onClickListener) ;
        Button button_33 = (Button) findViewById(R.id.button3) ;
        button_33.setOnClickListener(onClickListener) ;
        Button button_44 = (Button) findViewById(R.id.button4) ;
        button_44.setOnClickListener(onClickListener) ;
        Button button_55 = (Button) findViewById(R.id.button5) ;
        button_55.setOnClickListener(onClickListener) ;
    }
}