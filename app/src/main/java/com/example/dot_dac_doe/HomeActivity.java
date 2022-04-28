package com.example.dot_dac_doe;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.transition.Slide;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;

import com.example.dot_dac_doe.VerticalLayouts.GameActivity;


public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().requestFeature(Window.FEATURE_ACTIVITY_TRANSITIONS);
        getWindow().setExitTransition(new Slide());
        setContentView(R.layout.activity_home);

        Intent i = new Intent(HomeActivity.this, BackgroundSoundService.class);
        startService(i);

        Button btn2 = findViewById(R.id.multiplayerButton);

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(HomeActivity.this, UserSelectActivity.class);
                i.putExtra("status", "mult");
                startActivity(i, ActivityOptions.makeSceneTransitionAnimation(HomeActivity.this).toBundle());
            }
        });

        ImageView btn3 = findViewById(R.id.imageView6);

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomeActivity.this, tutorial_page.class));
            }
        });

        ImageView btn4 = findViewById(R.id.imageView7);
        btn4.setTag("on");
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(btn4.getTag().toString().equalsIgnoreCase("on")) {
                    Intent i = new Intent(HomeActivity.this, BackgroundSoundService.class);
                    stopService(i);
                    btn4.setImageResource(R.drawable.musicoff);
                    btn4.setTag("off");
                }
                else if(btn4.getTag().toString().equalsIgnoreCase("off")){
                    Intent i = new Intent(HomeActivity.this, BackgroundSoundService.class);
                    startService(i);
                    btn4.setImageResource(R.drawable.musicon);
                    btn4.setTag("on");
                }
            }
        });

        //      interaction for game page
        Button singlePlay = findViewById(R.id.singlePlayer);
        singlePlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(HomeActivity.this, UserSelectActivity.class);
                i.putExtra("status", "single");
                startActivity(i);
            }
        });

    }

}