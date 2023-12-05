package com.example.holidaymusic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class spotify_pop_song extends AppCompatActivity {

    double rating;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spotify_pop_song);
        final EditText rate = (android.widget.EditText)findViewById(R.id.tvHintPopSong1);
        final TextView result = ((TextView)findViewById(R.id.tvResultPopSong1));
        Button viewLink = (Button)findViewById(R.id.btAppLinkPopSong1);
        viewLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rating = Double.parseDouble(rate.getText().toString());
                result.setText("Thank you for your rating of " + rating + "!");
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.artic.edu")));

            }
        });
    }
}