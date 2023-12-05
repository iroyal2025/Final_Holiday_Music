package com.example.holidaymusic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class Gospel extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gospel);
        RadioGroup radioGroup = findViewById(R.id.radioGroup2);
        final Button suggestion = findViewById(R.id.tvSuggestion2);

        suggestion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int selectedId = radioGroup.getCheckedRadioButtonId();

                if (selectedId == R.id.tvSong2) {
                    startActivity(new Intent(Gospel.this, gospel_song.class));
                } else if (selectedId == R.id.tvPlaylist2) {
                    startActivity(new Intent(Gospel.this, gospel_playlist.class));
                }
            }
        });

    }
}
