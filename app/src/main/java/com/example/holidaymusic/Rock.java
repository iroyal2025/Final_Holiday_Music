package com.example.holidaymusic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class Rock extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rock);
        RadioGroup radioGroup = findViewById(R.id.radioGroup3);
        final Button suggestion = findViewById(R.id.tvSuggestion3);

        suggestion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int selectedId = radioGroup.getCheckedRadioButtonId();

                if (selectedId == R.id.tvSong3) {
                    startActivity(new Intent(Rock.this, rock_song.class));
                } else if (selectedId == R.id.tvPlaylist3) {
                    startActivity(new Intent(Rock.this, rock_playlist.class));
                }
            }
        });

    }
}
