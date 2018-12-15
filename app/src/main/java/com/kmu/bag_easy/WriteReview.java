package com.kmu.bag_easy;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.RadioGroup;
import android.widget.Toast;

class ReviewDB extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "myreview.db";

    private static final int DATABASE_VERSION = 2;

    public ReviewDB(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE contacts ( _id INTEGER PRIMARY KEY" +
                " AUTOINCREMENT, name TEXT, point TEXT);");
    }

    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS contacts");
        onCreate(db);
    }
}


public class WriteReview extends AppCompatActivity {
    ReviewDB helper;
    SQLiteDatabase db;
    EditText edit_name, edit_point;

    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_write_review);
        helper = new ReviewDB(this);
        try {
            db = helper.getWritableDatabase();
        } catch (SQLiteException ex) {
            db = helper.getReadableDatabase();
        }
        edit_name = (EditText) findViewById(R.id.reviewText);
        edit_point = (EditText) findViewById(R.id.reviewPoint);

        ImageButton buttonWriteReview = (ImageButton) findViewById(R.id.button_submit_review) ;
        buttonWriteReview.setOnClickListener(new ImageButton.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(WriteReview.this, CompleteReview.class));
            }
        }) ;
    }

    public void insert(View target) {
        String name = edit_name.getText().toString();
        String point = edit_point.getText().toString();
        db.execSQL("INSERT INTO contacts VALUES (null, '" + name + "', '" + point
                + "');");
        Toast.makeText(getApplicationContext(), "성공적으로 추가되었음",
                Toast.LENGTH_SHORT).show();
        edit_name.setText("");
        edit_point.setText("");
    }
/*
    public void search(View target) {
        String name = edit_name.getText().toString();
        Cursor cursor;
        cursor = db.rawQuery("SELECT name, tel FROM contacts WHERE name='"
                + name + "';", null);

        while (cursor.moveToNext()) {
            String tel = cursor.getString(1);
            edit_point.setText(tel);
        }
    }
    */
}

