package com.example.holidaymusic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class rock_song extends AppCompatActivity {
    private MediaPlayer mpChristmas_eve;
    private MediaPlayer mpRun_rudolph;
    private Button first_sample;
    private Button second_sample;
    private int playing;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rock_song);
        Button link = (Button) findViewById(R.id.btLink5);
        first_sample = findViewById(R.id.tvRockSample1);
        second_sample = findViewById(R.id.tvRockSample2);
        mpChristmas_eve  = MediaPlayer.create(this, R.raw.christmas_eve);
        mpRun_rudolph = MediaPlayer.create(this, R.raw.run_rudolph);

        first_sample.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (playing) {
                    case 0:
                        mpChristmas_eve.start();
                        playing = 1;
                        first_sample.setText("Pause Sample 1");
                        second_sample.setVisibility(View.INVISIBLE);
                        break;

                    case 1:
                        mpChristmas_eve.pause();
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
                        mpRun_rudolph.start();
                        playing = 1;
                        second_sample.setText("Pause Sample 2");
                        first_sample.setVisibility(View.INVISIBLE);
                        break;

                    case 1:
                        mpRun_rudolph.pause();
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
                startActivity(new Intent(rock_song.this, rock_song_link.class));
            }
        });
    }
}