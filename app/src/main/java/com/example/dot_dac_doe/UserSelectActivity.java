package com.example.dot_dac_doe;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;


public class UserSelectActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_select);
        ImageView Icon1 = findViewById(R.id.Icon1);
        ImageView Icon2 = findViewById(R.id.Icon2);



//      interaction for orientation page
        Button orientation = findViewById(R.id.orientation_button_user_select);
        orientation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(UserSelectActivity.this, Orientation.class);
                startActivity(i);
            }
        });

        //      interaction for game play
        Button play = findViewById(R.id.play_button_user_select);
        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(UserSelectActivity.this, MultiplayerGame.class);
                startActivity(i);
            }
        });

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        if (extras != null) {
            if (extras.containsKey("icon1")) {
                String icon1 = getIntent().getStringExtra("icon1");
                if(icon1.equalsIgnoreCase("tree")) {
                    Icon1.setImageResource(R.drawable.tree);
                    Icon1.setTag("tree");
                } else if(icon1.equalsIgnoreCase("egg")) {
                    Icon1.setImageResource(R.drawable.egg);
                    Icon1.setTag("egg");
                } else if(icon1.equalsIgnoreCase("umbrella")) {
                    Icon1.setImageResource(R.drawable.umbrella);
                    Icon1.setTag("umbrella");
                } else if(icon1.equalsIgnoreCase("fries")) {
                    Icon1.setImageResource(R.drawable.fries);
                    Icon1.setTag("fries");
                } else if(icon1.equalsIgnoreCase("wave")) {
                    Icon1.setImageResource(R.drawable.wave);
                    Icon1.setTag("wave");
                } else if(icon1.equalsIgnoreCase("peach")) {
                    Icon1.setImageResource(R.drawable.peach);
                    Icon1.setTag("peach");
                } else if(icon1.equalsIgnoreCase("planet")) {
                    Icon1.setImageResource(R.drawable.planet);
                    Icon1.setTag("planet");
                } else if(icon1.equalsIgnoreCase("rain")) {
                    Icon1.setImageResource(R.drawable.rain);
                    Icon1.setTag("rain");
                } else if(icon1.equalsIgnoreCase("cat")) {
                    Icon1.setImageResource(R.drawable.cat);
                    Icon1.setTag("cat");
                } else if(icon1.equalsIgnoreCase("flower")) {
                    Icon1.setImageResource(R.drawable.flower);
                    Icon1.setTag("flower");
                } else if(icon1.equalsIgnoreCase("goggles")) {
                    Icon1.setImageResource(R.drawable.goggles);
                    Icon1.setTag("goggles");
                } else if(icon1.equalsIgnoreCase("paint")) {
                    Icon1.setImageResource(R.drawable.paint);
                    Icon1.setTag("paint");
                } else if(icon1.equalsIgnoreCase("lightning")) {
                    Icon1.setImageResource(R.drawable.lightning);
                    Icon1.setTag("lightning");
                } else if(icon1.equalsIgnoreCase("smile")) {
                    Icon1.setImageResource(R.drawable.smile);
                    Icon1.setTag("smile");
                } else if(icon1.equalsIgnoreCase("fish")) {
                    Icon1.setImageResource(R.drawable.fish);
                    Icon1.setTag("fish");
                }
            }
            if (extras.containsKey("icon2")) {
                String icon2 = getIntent().getStringExtra("icon2");
                if(icon2.equalsIgnoreCase("tree")) {
                    Icon2.setImageResource(R.drawable.tree);
                    Icon2.setTag("tree");
                } else if(icon2.equalsIgnoreCase("egg")) {
                    Icon2.setImageResource(R.drawable.egg);
                    Icon2.setTag("egg");
                } else if(icon2.equalsIgnoreCase("umbrella")) {
                    Icon2.setImageResource(R.drawable.umbrella);
                    Icon2.setTag("umbrella");
                } else if(icon2.equalsIgnoreCase("fries")) {
                    Icon2.setImageResource(R.drawable.fries);
                    Icon2.setTag("fish");
                } else if(icon2.equalsIgnoreCase("wave")) {
                    Icon2.setImageResource(R.drawable.wave);
                    Icon2.setTag("wave");
                } else if(icon2.equalsIgnoreCase("peach")) {
                    Icon2.setImageResource(R.drawable.peach);
                    Icon2.setTag("peach");
                } else if(icon2.equalsIgnoreCase("planet")) {
                    Icon2.setImageResource(R.drawable.planet);
                    Icon2.setTag("planet");
                } else if(icon2.equalsIgnoreCase("rain")) {
                    Icon2.setImageResource(R.drawable.rain);
                    Icon2.setTag("rain");
                } else if(icon2.equalsIgnoreCase("cat")) {
                    Icon2.setImageResource(R.drawable.cat);
                    Icon2.setTag("cat");
                } else if(icon2.equalsIgnoreCase("flower")) {
                    Icon2.setImageResource(R.drawable.flower);
                    Icon2.setTag("flower");
                } else if(icon2.equalsIgnoreCase("goggles")) {
                    Icon2.setImageResource(R.drawable.goggles);
                    Icon2.setTag("goggles");
                } else if(icon2.equalsIgnoreCase("paint")) {
                    Icon2.setImageResource(R.drawable.paint);
                    Icon2.setTag("paint");
                } else if(icon2.equalsIgnoreCase("lightning")) {
                    Icon2.setImageResource(R.drawable.lightning);
                    Icon2.setTag("lightning");
                } else if(icon2.equalsIgnoreCase("smile")) {
                    Icon2.setImageResource(R.drawable.smile);
                    Icon2.setTag("smile");
                } else if(icon2.equalsIgnoreCase("fish")) {
                    Icon2.setImageResource(R.drawable.fish);
                    Icon2.setTag("fish");
                }
            }
        }

//        interaction for player one icon select
        ImageView player1 = findViewById(R.id.Circle1);
        player1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String player = "player1";
                Intent i = new Intent(UserSelectActivity.this, iconPage.class);
                if (!String.valueOf(Icon1.getTag()).isEmpty()) {
                    i.putExtra("icon1", String.valueOf(Icon1.getTag()));
                }

                if (!String.valueOf(Icon2.getTag()).isEmpty()) {
                    i.putExtra("icon2", String.valueOf(Icon2.getTag()));
                }

                if (!String.valueOf(player1.getTag()).isEmpty()) {
                    i.putExtra("player1color", String.valueOf(player1.getTag()));
                }

                i.putExtra("player", player);
                startActivity(i);
            }
        });

//        String icon1 = getIntent().getStringExtra("icon");
//        ImageView Icon1 = findViewById(R.id.Icon1);
//        if(icon1.equalsIgnoreCase("tree")) {
//            Icon1.setImageResource(R.drawable.tree);
//        }



//        interaction for player two icon select
        ImageView player2 = findViewById(R.id.Circle2);
        player2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String player = "player2";
                Intent i = new Intent(UserSelectActivity.this, iconPage.class);
                if (String.valueOf(Icon1.getTag()).isEmpty()) { }
                else {
                    i.putExtra("icon1", String.valueOf(Icon1.getTag()));
                }
                if (String.valueOf(Icon2.getTag()).isEmpty()) { }
                else {
                    i.putExtra("icon2", String.valueOf(Icon2.getTag()));
                }
                i.putExtra("player", player);
                startActivity(i);
            }
        });


//        interactions for changing the color of the profiles

        ImageView red1 = findViewById(R.id.pick_red_1_user_select);
        red1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                player1.setColorFilter(ContextCompat.getColor(getApplicationContext(), R.color.red), PorterDuff.Mode.SCREEN);
                player1.setTag(red1.getTag());
            }
        });

        ImageView blue1 = findViewById(R.id.pick_blue_1_user_select);
        blue1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                player1.setColorFilter(ContextCompat.getColor(getApplicationContext(), R.color.blue), PorterDuff.Mode.SCREEN);
                player1.setTag(blue1.getTag());
            }
        });
        ImageView orange1 = findViewById(R.id.pick_orange_1_user_select);
        orange1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                player1.setColorFilter(ContextCompat.getColor(getApplicationContext(), R.color.orange), PorterDuff.Mode.SCREEN);
                player1.setTag(orange1.getTag());
            }
        });
        ImageView purple1 = findViewById(R.id.pick_purple_1_user_select);
        purple1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                player1.setColorFilter(ContextCompat.getColor(getApplicationContext(), R.color.purple), PorterDuff.Mode.SCREEN);
                player1.setTag(purple1.getTag());
            }
        });
        ImageView yellow1 = findViewById(R.id.pick_yellow_1_user_select);
        yellow1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                player1.setColorFilter(ContextCompat.getColor(getApplicationContext(), R.color.yellow), PorterDuff.Mode.SCREEN);
                player1.setTag(yellow1.getTag());
            }
        });
        ImageView pink1 = findViewById(R.id.pick_pink_1_user_select);
        pink1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                player1.setColorFilter(ContextCompat.getColor(getApplicationContext(), R.color.pink), PorterDuff.Mode.SCREEN);
                player1.setTag(pink1.getTag());
            }
        });
        ImageView green1 = findViewById(R.id.pick_green_1_user_select);
        green1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                player1.setColorFilter(ContextCompat.getColor(getApplicationContext(), R.color.green), PorterDuff.Mode.SCREEN);
                player1.setTag(green1.getTag());
            }
        });
        ImageView grey1 = findViewById(R.id.pick_grey_1_user_select);
        grey1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                player1.setColorFilter(ContextCompat.getColor(getApplicationContext(), R.color.grey), PorterDuff.Mode.SCREEN);
                player1.setTag(grey1.getTag());
            }
        });

        ImageView red2 = findViewById(R.id.pick_red_2_user_select);
        red2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                player2.setColorFilter(ContextCompat.getColor(getApplicationContext(), R.color.red), PorterDuff.Mode.SCREEN);
                player2.setTag(red2.getTag());
            }
        });

        ImageView blue2 = findViewById(R.id.pick_blue_2_user_select);
        blue2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                player2.setColorFilter(ContextCompat.getColor(getApplicationContext(), R.color.blue), PorterDuff.Mode.SCREEN);
                player2.setTag(blue2.getTag());
            }
        });
        ImageView orange2 = findViewById(R.id.pick_orange_2_user_select);
        orange2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                player2.setColorFilter(ContextCompat.getColor(getApplicationContext(), R.color.orange), PorterDuff.Mode.SCREEN);
                player2.setTag(orange2.getTag());
            }
        });
        ImageView purple2 = findViewById(R.id.pick_purple_2_user_select);
        purple2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                player2.setColorFilter(ContextCompat.getColor(getApplicationContext(), R.color.purple), PorterDuff.Mode.SCREEN);
                player2.setTag(purple2.getTag());
            }
        });
        ImageView yellow2 = findViewById(R.id.pick_yellow_2_user_select);
        yellow2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                player2.setColorFilter(ContextCompat.getColor(getApplicationContext(), R.color.yellow), PorterDuff.Mode.SCREEN);
                player2.setTag(yellow2.getTag());
            }
        });
        ImageView pink2 = findViewById(R.id.pick_pink_2_user_select);
        pink2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                player2.setColorFilter(ContextCompat.getColor(getApplicationContext(), R.color.pink), PorterDuff.Mode.SCREEN);
                player2.setTag(pink2.getTag());
            }
        });
        ImageView green2 = findViewById(R.id.pick_green_2_user_select);
        green2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                player2.setColorFilter(ContextCompat.getColor(getApplicationContext(), R.color.green), PorterDuff.Mode.SCREEN);
                player2.setTag(green2.getTag());
            }
        });
        ImageView grey2 = findViewById(R.id.pick_grey_2_user_select);
        grey2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                player2.setColorFilter(ContextCompat.getColor(getApplicationContext(), R.color.grey), PorterDuff.Mode.SCREEN);
                player2.setTag(grey2.getTag());
            }
        });



    }
}
