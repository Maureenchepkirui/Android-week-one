package com.maureenbett.bookhub;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class GenresActivity extends AppCompatActivity {
    private ListView mListView;
    public String[] genres = new String[]{"classic","crime","epic","fable","fairytale","folktale","gothic fiction",
            "historical fiction","horror","thriller","romance","action","humor","legend","magical realism","meta fiction","mythology",
    "mystery","mythopoeia","realistic fiction","romance","satire","science fiction","short story","spy fiction","superhero fiction",
    "travel","biography","essay"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_genres);
        ListView mListView = (ListView) findViewById(R.id.listView);

        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, genres);
        mListView.setAdapter(adapter);

    }
}