package com.example.holidaymusic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class r_and_b_playlist extends AppCompatActivity {
    private MediaPlayer mpRBPlaylist1;
    private MediaPlayer mpRBPlaylist2;
    private Button first_sample;
    private Button second_sample;
    private int playing;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_r_and_b_playlist);
        Button link = (Button) findViewById(R.id.btLink12);
        first_sample = findViewById(R.id.tvRBSample3);
        second_sample = findViewById(R.id.tvRBSample4);
        mpRBPlaylist1 = MediaPlayer.create(this, R.raw.r_and_b_playlist1);
        mpRBPlaylist2 = MediaPlayer.create(this, R.raw.r_and_b_playlist2);

        first_sample.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (playing) {
                    case 0:
                        mpRBPlaylist1.start();
                        playing = 1;
                        first_sample.setText("Pause Sample 1");
                        second_sample.setVisibility(View.INVISIBLE);
                        break;

                    case 1:
                        mpRBPlaylist1.pause();
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
                        mpRBPlaylist2.start();
                        playing = 1;
                        second_sample.setText("Pause Sample 2");
                        first_sample.setVisibility(View.INVISIBLE);
                        break;

                    case 1:
                        mpRBPlaylist2.pause();
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
                startActivity(new Intent(r_and_b_playlist.this, r_and_b_playlist_link.class));
            }
        });
    }
}