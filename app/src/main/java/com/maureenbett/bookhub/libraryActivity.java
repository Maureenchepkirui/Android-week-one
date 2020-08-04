package com.maureenbett.bookhub;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class libraryActivity extends AppCompatActivity {
    public String[] novels = new String[] {"Jane Eyre","Wuthering Heights","Moby Dick","Pride and Prejudice","The Great Gatsby ","Frankenstein","Robison Crusoe","Little Women","Crime and Punishment","The Notebook","The Next Always","The Kiss","The Sweetest Thing ","A Second Chance"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_library);
    }
}