package com.maureenbett.bookhub;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class GenresActivity extends AppCompatActivity {
    private Button mreadingListButton;
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
        Intent intent = getIntent();
        mreadingListButton = (Button) findViewById(R.id.readingListButton);
        mreadingListButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GenresActivity.this, GenresActivity.class);
                startActivity(intent);
            }
        });
    }

}
