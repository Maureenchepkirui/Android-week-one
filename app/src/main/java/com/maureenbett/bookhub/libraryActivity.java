package com.maureenbett.bookhub;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class libraryActivity extends AppCompatActivity {

    private ListView mListView;
    public String[] novels = new String[] {"Jane Eyre","Wuthering Heights","Moby Dick","Pride and Prejudice","The Great Gatsby ","Frankenstein","Robison Crusoe","Little Women","Crime and Punishment","The Notebook","The Next Always","The Kiss","The Sweetest Thing ","A Second Chance","Mi Mero Mole", "Mother's Bistro",
            "Life of Pie", "Screen Door", "Luc Lac", "Sweet Basil",
            "Slappy Cakes", "Equinox", "Miss Delta's", "Andina",
            "Lardo", "Portland City Grill", "Fat Head's Brewery",
            "Chipotle", "Subway"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_library);

        mListView = (ListView) findViewById(R.id.listView);

        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, novels);
        mListView.setAdapter(adapter);

        Intent intent = getIntent();



    }
}