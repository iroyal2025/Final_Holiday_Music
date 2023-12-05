package com.example.holidaymusic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class gospel_song_link extends AppCompatActivity {
    String platformChoice;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gospel_song_link);
        final Spinner platform = findViewById(R.id.tvPlatform3);
        platform.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                platformChoice = parentView.getItemAtPosition(position).toString();
                showToast("Selected platform: " + platformChoice);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
                // Do nothing if nothing is selected
            }
        });

        Button musicLink = findViewById(R.id.btMusicLink3);
        musicLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (platformChoice) {
                    case "Spotify":
                        startActivity(new Intent(gospel_song_link.this, spotify_gospel_song.class));
                        break;

                    case "AppleMusic":
                        startActivity(new Intent(gospel_song_link.this, AppleMusic_gospel_song.class));
                        break;

                    case "YouTube":
                        startActivity(new Intent(gospel_song_link.this, youtube_gospel_song.class));
                        break;

                    default:
                        break;
                }
            }
        });
    }

    private void showToast(CharSequence message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}