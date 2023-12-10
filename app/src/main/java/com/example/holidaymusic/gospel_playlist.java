package com.example.holidaymusic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class gospel_playlist extends AppCompatActivity {
    private MediaPlayer mpGospel_playlist1;
    private MediaPlayer mpGospel_playlist2;
    private Button first_sample;
    private Button second_sample;
    private int playing;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gospel_playlist);
        Button link = (Button) findViewById(R.id.btLink4);
        first_sample = findViewById(R.id.tvGospelSample3);
        second_sample = findViewById(R.id.tvGospelSample4);
        mpGospel_playlist1  = MediaPlayer.create(this, R.raw.gospel_playlist1);
        mpGospel_playlist2 = MediaPlayer.create(this, R.raw.gospel_playlist2);

        first_sample.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (playing) {
                    case 0:
                        mpGospel_playlist1.start();
                        playing = 1;
                        first_sample.setText("Pause Sample 1");
                        second_sample.setVisibility(View.INVISIBLE);
                        break;

                    case 1:
                        mpGospel_playlist1.pause();
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
                        mpGospel_playlist2.start();
                        playing = 1;
                        second_sample.setText("Pause Sample 2");
                        first_sample.setVisibility(View.INVISIBLE);
                        break;

                    case 1:
                        mpGospel_playlist2.pause();
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
                startActivity(new Intent(gospel_playlist.this, gospel_playlist_link.class));
            }
        });
    }
}