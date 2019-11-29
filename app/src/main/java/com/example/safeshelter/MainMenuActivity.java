package com.example.safeshelter;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.content.SharedPreferences;
import android.widget.Toast;


public class MainMenuActivity extends AppCompatActivity {
    public ImageView settings_image, youtube_kids_image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        setTitle("SafeShelter");

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        settings_image = findViewById(R.id.Settings_Icon);
        settings_image.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainMenuActivity.this, SettingsActivity.class);
                startActivity(intent);
            }
        });

        youtube_kids_image = (ImageView) findViewById(R.id.imageYoutubeKids);

        youtube_kids_image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (view.getId() == R.id.imageYoutubeKids) {
                    Intent launchIntent = getPackageManager().getLaunchIntentForPackage("com.google.android.apps.youtube.kids");
                    startActivity(launchIntent);
                }
            }
        });
    }
}
