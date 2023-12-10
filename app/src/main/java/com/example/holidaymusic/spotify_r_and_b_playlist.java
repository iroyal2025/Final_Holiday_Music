package com.example.holidaymusic;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class spotify_r_and_b_playlist extends AppCompatActivity {

    double rating;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spotify_r_and_b_playlist);
        final EditText rate = (EditText)findViewById(R.id.tvHintRBPlaylist1);
        final TextView result = ((TextView)findViewById(R.id.tvResultRBPlaylist1));
        Button viewLink = (Button)findViewById(R.id.btAppLinkRBPlaylist1);
        viewLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rating = Double.parseDouble(rate.getText().toString());
                result.setText("Thank you for your rating of " + rating + "!");
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://open.spotify.com/search/christmas%20R%26B%20playlist/playlists")));


            }
        });
    }
}