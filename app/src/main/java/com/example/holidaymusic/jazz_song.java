package com.example.holidaymusic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class jazz_song extends AppCompatActivity {
    private MediaPlayer mpSanta_is_coming;
    private MediaPlayer mpFavorite_things;
    private Button first_sample;
    private Button second_sample;
    private int playing;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jazz_song);
        Button link = (Button) findViewById(R.id.btLink9);
        first_sample = findViewById(R.id.tvJazzSample1);
        second_sample = findViewById(R.id.tvJazzSample2);
        mpSanta_is_coming = MediaPlayer.create(this, R.raw.santa_is_coming);
        mpFavorite_things = MediaPlayer.create(this, R.raw.favorite_things);

        first_sample.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (playing) {
                    case 0:
                        mpSanta_is_coming.start();
                        playing = 1;
                        first_sample.setText("Pause Sample 1");
                        second_sample.setVisibility(View.INVISIBLE);
                        break;

                    case 1:
                        mpSanta_is_coming.pause();
                        playing = 0;
                        first_sample.setText("Play Sample 1");
                        second_sample.setVisibility(View.VISIBLE);
                        break;
                }
            }
        });

        second_sample.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (playing) {
                    case 0:
                        mpFavorite_things.start();
                        playing = 1;
                        second_sample.setText("Pause Sample 2");
                        first_sample.setVisibility(View.INVISIBLE);
                        break;

                    case 1:
                        mpFavorite_things.pause();
                        playing = 0;
                        second_sample.setText("Play Sample 2");
                        first_sample.setVisibility(View.VISIBLE);
                        break;
                }
            }
        });



        link.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(jazz_song.this, jazz_song_link.class));
            }
        });
    }
}