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

public class CompleteReview extends AppCompatActivity {

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_complete_review);


        ImageButton buttonWriteReview = (ImageButton) findViewById(R.id.button_review_to_home) ;
        buttonWriteReview.setOnClickListener(new ImageButton.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(CompleteReview.this, Home.class));
            }
        }) ;


    }
}