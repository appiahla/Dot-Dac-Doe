package com.example.dot_dac_doe;
//import andoir

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.dot_dac_doe.VerticalLayouts.GameActivity;


public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Intent i = new Intent(HomeActivity.this, BackgroundSoundService.class);
        startService(i);

        Button btn2 = (Button)findViewById(R.id.multiplayerButton);

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(HomeActivity.this, UserSelectActivity.class);
                i.putExtra("status", "mult");
                startActivity(i);
            }
        });

        ImageView btn3 = (ImageView) findViewById(R.id.imageView6);

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomeActivity.this, tutorial_page.class));
            }
        });

        ImageView btn4 = (ImageView) findViewById(R.id.imageView7);

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomeActivity.this, Settings.class));
            }
        });

        //      interaction for game page
        Button singlePlay = findViewById(R.id.singlePlayer);
        singlePlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Intent i = new Intent(HomeActivity.this, GameActivity.class);
                Intent i = new Intent(HomeActivity.this, UserSelectActivity.class);
                i.putExtra("status", "single");
                startActivity(i);
            }
        });

    }

}