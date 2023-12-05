package com.example.holidaymusic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class orchestra_playlist_link extends AppCompatActivity {

    String platformChoice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_orchestra_playlist_link);
        final Spinner platform = findViewById(R.id.tvPlatform8);
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

        Button musicLink = findViewById(R.id.btMusicLink8);
        musicLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (platformChoice) {
                    case "Spotify":
                        startActivity(new Intent(orchestra_playlist_link.this, spotify_orchestra_playlist.class));
                        break;

                    case "AppleMusic":
                        startActivity(new Intent(orchestra_playlist_link.this, AppleMusic_orchestra_playlist.class));
                        break;

                    case "YouTube":
                        startActivity(new Intent(orchestra_playlist_link.this, youtube_orchestra_playlist.class));
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