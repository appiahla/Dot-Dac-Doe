package com.example.dot_dac_doe;
//import andoir

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;


public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

//        Button btn = (Button)findViewById(R.id.singlePlayer);
//
//        btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                startActivity(new Intent(HomeActivity.this, UserSelectActivity.class));
//            }
//        });

        Button btn2 = (Button)findViewById(R.id.multiplayerButton);

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomeActivity.this, UserSelectActivity.class));
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
                Intent i = new Intent(HomeActivity.this, GameActivity.class);
                startActivity(i);
            }
        });

    }

}