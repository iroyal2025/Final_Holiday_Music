package com.example.holidaymusic;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class youtube_r_and_b_song extends AppCompatActivity {
    double rating;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_youtube_r_and_b_song);
        final EditText rate = (EditText)findViewById(R.id.tvHintRBSong3);
        final TextView result = ((TextView)findViewById(R.id.tvResultRBSong3));
        Button viewLink = (Button)findViewById(R.id.btAppLinkRBSong3);
        viewLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rating = Double.parseDouble(rate.getText().toString());
                result.setText("Thank you for your rating of " + rating + "!");

            }
        });
    }
}