package com.example.holidaymusic;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class spotify_pop_playlist extends AppCompatActivity {

    double rating;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spotify_pop_playlist);
        final EditText rate = (EditText)findViewById(R.id.tvHintPopPlaylist1);
        final TextView result = ((TextView)findViewById(R.id.tvResultPopPlaylist1));
        Button viewLink = (Button)findViewById(R.id.btAppLinkPopPlaylist1);
        viewLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rating = Double.parseDouble(rate.getText().toString());
                result.setText("Thank you for your rating of " + rating + "!");
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("hhttps://open.spotify.com/search/christmas%20pop%20play/playlists")));

            }
        });
    }
}