package com.example.holidaymusic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class Pop extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_pop);

            RadioGroup radioGroup = findViewById(R.id.radioGroup);
            final Button suggestion = findViewById(R.id.tvSuggestion);

            suggestion.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int selectedId = radioGroup.getCheckedRadioButtonId();

                    if (selectedId == R.id.tvSong) {
                        startActivity(new Intent(Pop.this, pop_song.class));
                    } else if (selectedId == R.id.tvPlaylist) {
                        startActivity(new Intent(Pop.this, pop_playlist.class));
                    }
                }
            });
        }

    }