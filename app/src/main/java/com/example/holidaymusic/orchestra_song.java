package com.example.holidaymusic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class orchestra_song extends AppCompatActivity {
    private MediaPlayer mpCarol_of_the_bells;
    private MediaPlayer mpSleigh_ride_leroy;
    private Button first_sample;
    private Button second_sample;
    private int playing;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_orchestra_song);
        Button link = (Button) findViewById(R.id.btLink7);

        first_sample = findViewById(R.id.tvOrchestraSample1);
        second_sample = findViewById(R.id.tvOrchestraSample2);
        mpCarol_of_the_bells  = MediaPlayer.create(this, R.raw.carol_of_the_bells);
        mpSleigh_ride_leroy = MediaPlayer.create(this, R.raw.sleigh_ride_leroy);

        first_sample.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (playing) {
                    case 0:
                        mpCarol_of_the_bells.start();
                        playing = 1;
                        first_sample.setText("Pause Sample 1");
                        second_sample.setVisibility(View.INVISIBLE);
                        break;

                    case 1:
                        mpCarol_of_the_bells.pause();
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
                        mpSleigh_ride_leroy.start();
                        playing = 1;
                        second_sample.setText("Pause Sample 2");
                        first_sample.setVisibility(View.INVISIBLE);
                        break;

                    case 1:
                        mpSleigh_ride_leroy.pause();
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
                startActivity(new Intent(orchestra_song.this, orchestra_song_link.class));
            }
        });
    }
}