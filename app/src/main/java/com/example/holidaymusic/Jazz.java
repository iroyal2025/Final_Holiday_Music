package com.example.holidaymusic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class Jazz extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jazz);
        RadioGroup radioGroup = findViewById(R.id.radioGroup5);
        final Button suggestion = findViewById(R.id.tvSuggestion5);

        suggestion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int selectedId = radioGroup.getCheckedRadioButtonId();

                if (selectedId == R.id.tvSong5) {
                    startActivity(new Intent(Jazz.this, jazz_song.class));
                } else if (selectedId == R.id.tvPlaylist5) {
                    startActivity(new Intent(Jazz.this, jazz_playlist.class));
                }
            }
        });
    }
}