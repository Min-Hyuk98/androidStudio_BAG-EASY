package com.kmu.bag_easy;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.Button;
import android.view.View;
import android.widget.TextView;


public class Home extends AppCompatActivity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

    }

    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.home_menu:
                Intent i1 = new Intent(this,Home.class);
                this.startActivity(i1);
                return true;
            case R.id.about_us_menu:
                Intent i2 = new Intent(this,AboutUs.class);
                this.startActivity(i2);
                return true;
            case R.id.review_menu:
                Intent i3 = new Intent(this,Review.class);
                this.startActivity(i3);
                return true;
            case R.id.myPage_menu:
                Intent i4 = new Intent(this,MyPage.class);
                this.startActivity(i4);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }



}
