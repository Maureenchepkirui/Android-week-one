package com.maureenbett.bookhub;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ReadingListActivity extends AppCompatActivity {
    private TextView mNovelTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reading_list);
        mNovelTextView = (TextView) findViewById(R.id.novelTextView);
        Intent intent = getIntent();
        String novel = intent.getStringExtra("novel");
        mNovelTextView.setText(novel +" has been added to your custom reading list");


    }
}