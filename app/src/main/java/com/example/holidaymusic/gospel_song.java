package com.example.holidaymusic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class gospel_song extends AppCompatActivity {
    private MediaPlayer mpJoy_to_the_world;
    private MediaPlayer mpFirst_noel;
    private Button first_sample;
    private Button second_sample;
    private int playing;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gospel_song);
        Button link = (Button) findViewById(R.id.btLink3);
        first_sample = findViewById(R.id.tvGospelSample1);
        second_sample = findViewById(R.id.tvGospelSample2);
        mpJoy_to_the_world  = MediaPlayer.create(this, R.raw.joy_to_the_world);
        mpFirst_noel = MediaPlayer.create(this, R.raw.first_noel);

        first_sample.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (playing) {
                    case 0:
                        mpJoy_to_the_world.start();
                        playing = 1;
                        first_sample.setText("Pause Sample 1");
                        second_sample.setVisibility(View.INVISIBLE);
                        break;

                    case 1:
                        mpJoy_to_the_world.pause();
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
                        mpFirst_noel.start();
                        playing = 1;
                        second_sample.setText("Pause Sample 2");
                        first_sample.setVisibility(View.INVISIBLE);
                        break;

                    case 1:
                        mpFirst_noel.pause();
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
                startActivity(new Intent(gospel_song.this, gospel_song_link.class));
            }
        });
    }
}