package com.maureenbett.bookhub;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;

public class GenresActivity extends AppCompatActivity {
    public static final String TAG = MainActivity.class.getSimpleName();
    @BindView(R.id.readingListButton) Button mreadingListButton;
    @BindView (R.id.listView) ListView mListView;
    @BindView (R.id.locationEditText) EditText mLocationEditText;
    public String[] genres = new String[]{"classic","crime","epic","fable","fairytale","folktale","gothic fiction",
            "historical fiction","horror","thriller","romance","action","humor","legend","magical realism","meta fiction","mythology",
    "mystery","mythopoeia","realistic fiction","romance","satire","science fiction","short story","spy fiction","superhero fiction",
    "travel","biography","essay"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_genres);
        ButterKnife.bind(this);
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, genres);
        mListView.setAdapter(adapter);
        Intent intent = getIntent();
        mreadingListButton = (Button) findViewById(R.id.readingListButton);
        mreadingListButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    String location = mLocationEditText.getText().toString();
                    Intent intent = new Intent(GenresActivity.this, ReadingListActivity.class);
                    intent.putExtra("location", location);
                    startActivity(intent);
                }
            });
        }
    }