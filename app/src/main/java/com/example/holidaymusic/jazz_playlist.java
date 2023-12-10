package com.example.holidaymusic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class jazz_playlist extends AppCompatActivity {
    private MediaPlayer mpJazz_playlist1;
    private MediaPlayer mpJazz_playlist2;
    private Button first_sample;
    private Button second_sample;
    private int playing;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jazz_playlist);
        Button link = (Button) findViewById(R.id.btLink10);
        first_sample = findViewById(R.id.tvJazzSample3);
        second_sample = findViewById(R.id.tvJazzSample4);
        mpJazz_playlist1 = MediaPlayer.create(this, R.raw.jazz_playlist1);
        mpJazz_playlist2 = MediaPlayer.create(this, R.raw.jazz_playlist2);

        first_sample.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (playing) {
                    case 0:
                        mpJazz_playlist1.start();
                        playing = 1;
                        first_sample.setText("Pause Sample 1");
                        second_sample.setVisibility(View.INVISIBLE);
                        break;

                    case 1:
                        mpJazz_playlist1.pause();
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
                        mpJazz_playlist2.start();
                        playing = 1;
                        second_sample.setText("Pause Sample 2");
                        first_sample.setVisibility(View.INVISIBLE);
                        break;

                    case 1:
                        mpJazz_playlist2.pause();
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
                startActivity(new Intent(jazz_playlist.this, jazz_playlist_link.class));
            }
        });
    }
}