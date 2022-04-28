package com.example.dot_dac_doe;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.transition.Fade;
import android.transition.Slide;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class winner_page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().requestFeature(Window.FEATURE_ACTIVITY_TRANSITIONS);
        getWindow().setEnterTransition(new Fade());
        getWindow().setExitTransition(new Fade());
        setContentView(R.layout.activity_winner_page);
        Button play_again = findViewById(R.id.play_again);
        Button home_button = findViewById(R.id.home_button);
        String winner = getIntent().getStringExtra("winner");
        TextView winner_text = findViewById(R.id.winner);
        winner_text.setText(winner);

        ImageView winner_circle = findViewById(R.id.winner_circle);
        ImageView winner_icon = findViewById(R.id.winner_icon);

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();

        if (extras != null) {
            if (extras.containsKey("color1")) {
                String color1 = getIntent().getStringExtra("color1");
                if (color1.contains("red")) {
                    winner_circle.setColorFilter(ContextCompat.getColor(getApplicationContext(), R.color.red), PorterDuff.Mode.SCREEN);
                    winner_circle.setTag("red1");
                }
                if (color1.contains("blue")) {
                    winner_circle.setColorFilter(ContextCompat.getColor(getApplicationContext(), R.color.blue), PorterDuff.Mode.SCREEN);
                    winner_circle.setTag("blue1");
                }
                if (color1.contains("orange")) {
                    winner_circle.setColorFilter(ContextCompat.getColor(getApplicationContext(), R.color.orange), PorterDuff.Mode.SCREEN);
                    winner_circle.setTag("orange1");
                }
                if (color1.contains("purple")) {
                    winner_circle.setColorFilter(ContextCompat.getColor(getApplicationContext(), R.color.purple), PorterDuff.Mode.SCREEN);
                    winner_circle.setTag("purple1");
                }
                if (color1.contains("yellow")) {
                    winner_circle.setColorFilter(ContextCompat.getColor(getApplicationContext(), R.color.yellow), PorterDuff.Mode.SCREEN);
                    winner_circle.setTag("yellow1");
                }
                if (color1.contains("pink")) {
                    winner_circle.setColorFilter(ContextCompat.getColor(getApplicationContext(), R.color.pink), PorterDuff.Mode.SCREEN);
                    winner_circle.setTag("pink1");
                }
                if (color1.contains("green")) {
                    winner_circle.setColorFilter(ContextCompat.getColor(getApplicationContext(), R.color.green), PorterDuff.Mode.SCREEN);
                    winner_circle.setTag("green1");
                }
                if (color1.contains("grey")) {
                    winner_circle.setColorFilter(ContextCompat.getColor(getApplicationContext(), R.color.grey), PorterDuff.Mode.SCREEN);
                    winner_circle.setTag("grey1");
                }
            }
            if (extras.containsKey("icon1")) {
                String icon1 = getIntent().getStringExtra("icon1");
                if(icon1.equalsIgnoreCase("tree")) {
                    winner_icon.setImageResource(R.drawable.tree);
                    winner_icon.setTag("tree");
                } else if(icon1.equalsIgnoreCase("egg")) {
                    winner_icon.setImageResource(R.drawable.egg);
                    winner_icon.setTag("egg");
                } else if(icon1.equalsIgnoreCase("umbrella")) {
                    winner_icon.setImageResource(R.drawable.umbrella);
                    winner_icon.setTag("umbrella");
                } else if(icon1.equalsIgnoreCase("fries")) {
                    winner_icon.setImageResource(R.drawable.fries);
                    winner_icon.setTag("fries");
                } else if(icon1.equalsIgnoreCase("wave")) {
                    winner_icon.setImageResource(R.drawable.wave);
                    winner_icon.setTag("wave");
                } else if(icon1.equalsIgnoreCase("peach")) {
                    winner_icon.setImageResource(R.drawable.peach);
                    winner_icon.setTag("peach");
                } else if(icon1.equalsIgnoreCase("planet")) {
                    winner_icon.setImageResource(R.drawable.planet);
                    winner_icon.setTag("planet");
                } else if(icon1.equalsIgnoreCase("rain")) {
                    winner_icon.setImageResource(R.drawable.rain);
                    winner_icon.setTag("rain");
                } else if(icon1.equalsIgnoreCase("cat")) {
                    winner_icon.setImageResource(R.drawable.cat);
                    winner_icon.setTag("cat");
                } else if(icon1.equalsIgnoreCase("flower")) {
                    winner_icon.setImageResource(R.drawable.flower);
                    winner_icon.setTag("flower");
                } else if(icon1.equalsIgnoreCase("goggles")) {
                    winner_icon.setImageResource(R.drawable.goggles);
                    winner_icon.setTag("goggles");
                } else if(icon1.equalsIgnoreCase("paint")) {
                    winner_icon.setImageResource(R.drawable.paint);
                    winner_icon.setTag("paint");
                } else if(icon1.equalsIgnoreCase("lightning")) {
                    winner_icon.setImageResource(R.drawable.lightning);
                    winner_icon.setTag("lightning");
                } else if(icon1.equalsIgnoreCase("smile")) {
                    winner_icon.setImageResource(R.drawable.smile);
                    winner_icon.setTag("smile");
                } else if(icon1.equalsIgnoreCase("fish")) {
                    winner_icon.setImageResource(R.drawable.fish);
                    winner_icon.setTag("fish");
                }
            }
        }

        play_again.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(winner_page.this, UserSelectActivity.class);
                startActivity(i);
            }
        });
        home_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(winner_page.this, HomeActivity.class);
                startActivity(a);
            }
        });
    }

}