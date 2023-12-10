package com.example.holidaymusic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class r_and_b_song extends AppCompatActivity {
    private MediaPlayer mpChristmas_means;
    private MediaPlayer mpThis_christmas;
    private Button first_sample;
    private Button second_sample;
    private int playing;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_r_and_b_song);
        Button link = (Button) findViewById(R.id.btLink11);
        first_sample = findViewById(R.id.tvRBSample1);
        second_sample = findViewById(R.id.tvRBSample2);
        mpChristmas_means = MediaPlayer.create(this, R.raw.christmas_means);
        mpThis_christmas = MediaPlayer.create(this, R.raw.this_christmas);

        first_sample.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (playing) {
                    case 0:
                        mpChristmas_means.start();
                        playing = 1;
                        first_sample.setText("Pause Sample 1");
                        second_sample.setVisibility(View.INVISIBLE);
                        break;

                    case 1:
                        mpChristmas_means.pause();
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
                        mpThis_christmas.start();
                        playing = 1;
                        second_sample.setText("Pause Sample 2");
                        first_sample.setVisibility(View.INVISIBLE);
                        break;

                    case 1:
                        mpThis_christmas.pause();
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
                startActivity(new Intent(r_and_b_song.this, r_and_b_song_link.class));
            }
        });
    }
}