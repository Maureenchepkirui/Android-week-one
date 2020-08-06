package com.maureenbett.bookhub;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;

public class libraryActivity extends AppCompatActivity {
    @BindView(R.id.genresButton) Button mGenresButton;
    @BindView(R.id.listView) ListView mListView;

    public String[] novels = new String[] {"Jane Eyre","Wuthering Heights","Moby Dick","Pride and Prejudice","The Great Gatsby ","Frankenstein","Robison Crusoe","Little Women","Crime and Punishment","The Notebook","The Next Always","The Kiss","The Sweetest Thing ","A Second Chance","Mi Mero Mole", "Mother's Bistro",
            "Life of Pie", "Screen Door", "Luc Lac", "Sweet Basil",
            "Slappy Cakes", "Equinox", "Miss Delta's", "Andina",
            "Lardo", "Portland City Grill", "Fat Head's Brewery",
            "Chipotle", "Subway"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_library);

        ButterKnife.bind(this);

        ArrayAdapter adapter = new ArrayAdapter(this, R.layout.row2, novels);
        mListView.setAdapter(adapter);

        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String novel = ((TextView)view).getText().toString();
                Toast.makeText(libraryActivity.this, novel, Toast.LENGTH_LONG).show();
            }
        });


        Intent intent = getIntent();
        mGenresButton = (Button) findViewById(R.id.genresButton);
        mGenresButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(libraryActivity.this, GenresActivity.class);
                startActivity(intent);
            }
        });
    }



    }
