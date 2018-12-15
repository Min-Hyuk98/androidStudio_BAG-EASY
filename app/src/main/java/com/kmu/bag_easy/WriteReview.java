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
import android.view.inputmethod.InputMethodManager;
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
                " AUTOINCREMENT, name TEXT, text TEXT);");
    }

    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS contacts");
        onCreate(db);
    }
}


public class WriteReview extends AppCompatActivity {
    ReviewDB helper;
    SQLiteDatabase db;
    EditText edit_name, edit_text;

    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_write_review);
        helper = new ReviewDB(this);
        try {
            db = helper.getWritableDatabase();
        } catch (SQLiteException ex) {
            db = helper.getReadableDatabase();
        }
        edit_name = (EditText) findViewById(R.id.reviewName);
        edit_text = (EditText) findViewById(R.id.reviewText);

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
        String text = edit_text.getText().toString();

        db.execSQL("INSERT INTO contacts VALUES (null, '" + name + "', '" + text + "');");
        Toast.makeText(getApplicationContext(), "성공적으로 저장되었습니다. 제출하기 버튼을 누르세요",
                Toast.LENGTH_SHORT).show();
        edit_name.setText("");
        edit_text.setText("");
    }


}

