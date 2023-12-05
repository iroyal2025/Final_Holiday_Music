package com.example.holidaymusic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class Rhythm_and_Blues extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rhythm_and_blues);
        RadioGroup radioGroup = findViewById(R.id.radioGroup6);
        final Button suggestion = findViewById(R.id.tvSuggestion6);

        suggestion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int selectedId = radioGroup.getCheckedRadioButtonId();

                if (selectedId == R.id.tvSong6) {
                    startActivity(new Intent(Rhythm_and_Blues.this, r_and_b_song.class));
                } else if (selectedId == R.id.tvPlaylist6) {
                    startActivity(new Intent(Rhythm_and_Blues.this, r_and_b_playlist.class));
                }
            }
        });
    }
}