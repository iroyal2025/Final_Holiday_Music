package com.example.holidaymusic;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class AppleMusic_pop_playlist extends AppCompatActivity {
    double rating;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apple_music_pop_playlist);
        final EditText rate = (EditText)findViewById(R.id.tvHintPopPlaylist2);
        final TextView result = ((TextView)findViewById(R.id.tvResultPopPlaylist2));
        Button viewLink = (Button)findViewById(R.id.btAppLinkPopPlaylist2);
        viewLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rating = Double.parseDouble(rate.getText().toString());
                result.setText("Thank you for your rating of " + rating + "!");
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://music.apple.com/us/search?term=christmas%20pop%20songs")));


            }
        });
    }
}