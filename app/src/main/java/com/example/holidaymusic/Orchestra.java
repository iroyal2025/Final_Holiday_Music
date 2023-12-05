package com.example.holidaymusic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class Orchestra extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_orchestra);
        RadioGroup radioGroup = findViewById(R.id.radioGroup4);
        final Button suggestion = findViewById(R.id.tvSuggestion4);

        suggestion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int selectedId = radioGroup.getCheckedRadioButtonId();

                if (selectedId == R.id.tvSong4) {
                    startActivity(new Intent(Orchestra.this, orchestra_song.class));
                } else if (selectedId == R.id.tvPlaylist4) {
                    startActivity(new Intent(Orchestra.this, orchestra_playlist.class));
                }
            }
        });
    }
}