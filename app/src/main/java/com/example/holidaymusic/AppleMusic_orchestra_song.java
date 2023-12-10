package com.example.holidaymusic;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class AppleMusic_orchestra_song extends AppCompatActivity {
    double rating;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apple_music_orchestra_song);
        final EditText rate = (EditText)findViewById(R.id.tvHintOrchestraSong2);
        final TextView result = ((TextView)findViewById(R.id.tvResultOrchestraSong2));
        Button viewLink = (Button)findViewById(R.id.btAppLinkOrchestraSong2);
        viewLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rating = Double.parseDouble(rate.getText().toString());
                result.setText("Thank you for your rating of " + rating + "!");
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://music.apple.com/us/search?term=christmas%20orchestra%20songs")));


            }
        });
    }
}