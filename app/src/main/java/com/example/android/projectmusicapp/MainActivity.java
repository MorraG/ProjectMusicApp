package com.example.android.projectmusicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState)

    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the View that shows the music category
        TextView music = (TextView) findViewById(R.id.music);

        // Set a click listener on that View
        music.setOnClickListener(new OnClickListener() {

            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the music Activity
                Intent mymusicIntent = new Intent(MainActivity.this, MyMusicActivity.class);

                // Start the new activity
                startActivity(mymusicIntent);
            }
        });

        // Find the View that shows the radio category
        TextView radio = (TextView) findViewById(R.id.album);

        // Set a click listener on that View
        radio.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the numbers category radio
            @Override
            public void onClick(View View) {
                // create new intent to open the radio Activity
                Intent radioIntent = new Intent(MainActivity.this, album.class);

                // Start the new activity
                startActivity(radioIntent);
            }
        });
    }
}