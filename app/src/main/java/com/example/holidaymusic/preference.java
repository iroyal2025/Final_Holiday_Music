package com.example.holidaymusic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class preference extends AppCompatActivity {
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preference);
        String[] genre = new String[]{"Pop", "Gospel", "Rock", "Orchestra", "Jazz", "Rhythm and Blues"};
        listView = findViewById(R.id.tvGenres);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, android.R.id.text1,
                genre);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch(position){
                    case 0:
                        startActivity(new Intent(preference.this, Pop.class));
                        break;

                    case 1:
                        startActivity(new Intent(preference.this, Gospel.class));
                        break;

                    case 2:
                        startActivity(new Intent(preference.this, Rock.class));
                        break;

                    case 3:
                        startActivity(new Intent(preference.this, Orchestra.class));
                        break;

                    case 4:
                        startActivity(new Intent(preference.this, Jazz.class));
                        break;

                    case 5:
                        startActivity(new Intent(preference.this, Rhythm_and_Blues.class));
                        break;

                }
            }
        });
    }
}
