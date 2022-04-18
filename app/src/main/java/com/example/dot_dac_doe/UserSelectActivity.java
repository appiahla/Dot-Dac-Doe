package com.example.dot_dac_doe;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.transition.Explode;
import android.transition.Fade;
import android.transition.Slide;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


public class UserSelectActivity extends AppCompatActivity {
    Boolean[] sameColors1 = {false, false, false, false, false, false, false, false};
    Boolean[] sameColors2 = {false, false, false, false, false, false, false, false};
    String status;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().requestFeature(Window.FEATURE_ACTIVITY_TRANSITIONS);
        getWindow().setEnterTransition(new Explode());
        setContentView(R.layout.activity_user_select);

        ImageView Icon1 = findViewById(R.id.Icon1);
        ImageView Icon2 = findViewById(R.id.Icon2);
        ImageView player1 = findViewById(R.id.Circle1);
        ImageView player2 = findViewById(R.id.Circle2);
        TextView click_info1 = findViewById(R.id.info_3);
        TextView click_info2 = findViewById(R.id.info_4);


//      interaction for orientation page
        Button orientation = findViewById(R.id.orientation_button_user_select);
        orientation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(UserSelectActivity.this, Orientation.class);
                if(!String.valueOf(Icon1.getTag()).isEmpty()) {
                    i.putExtra("icon1", String.valueOf(Icon1.getTag()));
                }
                if(!String.valueOf(Icon2.getTag()).isEmpty()) {
                    i.putExtra("icon2", String.valueOf(Icon2.getTag()));
                }
                if(!String.valueOf(player1.getTag()).isEmpty()) {
                    i.putExtra("color1", String.valueOf(player1.getTag()));
                }
                if(!String.valueOf(player2.getTag()).isEmpty()) {
                    i.putExtra("color2", String.valueOf(player2.getTag()));
                }
                startActivity(i);
            }
        });

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        if (extras != null) {
            if (extras.containsKey("status")) {
                status = getIntent().getStringExtra("status");
            }
            if (extras.containsKey("color1")) {
                String color1 = getIntent().getStringExtra("color1");
                if (color1.equalsIgnoreCase("red1")) {
                    player1.setColorFilter(ContextCompat.getColor(getApplicationContext(), R.color.red), PorterDuff.Mode.SCREEN);
                    player1.setTag("red1");
                }
                if (color1.equalsIgnoreCase("blue1")) {
                    player1.setColorFilter(ContextCompat.getColor(getApplicationContext(), R.color.blue), PorterDuff.Mode.SCREEN);
                    player1.setTag("blue1");
                }
                if (color1.equalsIgnoreCase("orange1")) {
                    player1.setColorFilter(ContextCompat.getColor(getApplicationContext(), R.color.orange), PorterDuff.Mode.SCREEN);
                    player1.setTag("orange1");
                }
                if (color1.equalsIgnoreCase("purple1")) {
                    player1.setColorFilter(ContextCompat.getColor(getApplicationContext(), R.color.purple), PorterDuff.Mode.SCREEN);
                    player1.setTag("purple1");
                }
                if (color1.equalsIgnoreCase("yellow1")) {
                    player1.setColorFilter(ContextCompat.getColor(getApplicationContext(), R.color.yellow), PorterDuff.Mode.SCREEN);
                    player1.setTag("yellow1");
                }
                if (color1.equalsIgnoreCase("pink1")) {
                    player1.setColorFilter(ContextCompat.getColor(getApplicationContext(), R.color.pink), PorterDuff.Mode.SCREEN);
                    player1.setTag("pink1");
                }
                if (color1.equalsIgnoreCase("green1")) {
                    player1.setColorFilter(ContextCompat.getColor(getApplicationContext(), R.color.green), PorterDuff.Mode.SCREEN);
                    player1.setTag("green1");
                }
                if (color1.equalsIgnoreCase("grey1")) {
                    player1.setColorFilter(ContextCompat.getColor(getApplicationContext(), R.color.grey), PorterDuff.Mode.SCREEN);
                    player1.setTag("grey1");
                }
            }
            if (extras.containsKey("color2")) {
                String color2 = getIntent().getStringExtra("color2");
                if (color2.equalsIgnoreCase("red2")) {
                    player2.setColorFilter(ContextCompat.getColor(getApplicationContext(), R.color.red), PorterDuff.Mode.SCREEN);
                    player2.setTag("red2");
                }
                if (color2.equalsIgnoreCase("blue2")) {
                    player2.setColorFilter(ContextCompat.getColor(getApplicationContext(), R.color.blue), PorterDuff.Mode.SCREEN);
                    player2.setTag("blue2");
                }
                if (color2.equalsIgnoreCase("orange2")) {
                    player2.setColorFilter(ContextCompat.getColor(getApplicationContext(), R.color.orange), PorterDuff.Mode.SCREEN);
                    player2.setTag("orange2");
                }
                if (color2.equalsIgnoreCase("purple2")) {
                    player2.setColorFilter(ContextCompat.getColor(getApplicationContext(), R.color.purple), PorterDuff.Mode.SCREEN);
                    player2.setTag("purple2");
                }
                if (color2.equalsIgnoreCase("yellow2")) {
                    player2.setColorFilter(ContextCompat.getColor(getApplicationContext(), R.color.yellow), PorterDuff.Mode.SCREEN);
                    player2.setTag("yellow2");
                }
                if (color2.equalsIgnoreCase("pink2")) {
                    player2.setColorFilter(ContextCompat.getColor(getApplicationContext(), R.color.pink), PorterDuff.Mode.SCREEN);
                    player2.setTag("pink2");
                }
                if (color2.equalsIgnoreCase("green2")) {
                    player2.setColorFilter(ContextCompat.getColor(getApplicationContext(), R.color.green), PorterDuff.Mode.SCREEN);
                    player2.setTag("green2");
                }
                if (color2.equalsIgnoreCase("grey2")) {
                    player2.setColorFilter(ContextCompat.getColor(getApplicationContext(), R.color.grey), PorterDuff.Mode.SCREEN);
                    player2.setTag("grey2");
                }
            }
            if (extras.containsKey("icon1")) {
                String icon1 = getIntent().getStringExtra("icon1");
                click_info1.setVisibility(View.GONE);
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
                click_info2.setVisibility(View.GONE);
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
                    Icon2.setTag("fries");
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
                if (!String.valueOf(player2.getTag()).isEmpty()) {
                    i.putExtra("player2color", String.valueOf(player2.getTag()));
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
        player2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String player = "player2";
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
                if (!String.valueOf(player2.getTag()).isEmpty()) {
                    i.putExtra("player2color", String.valueOf(player2.getTag()));
                }

                i.putExtra("player", player);
                i.putExtra("visitedp1", "true");
                startActivity(i);
            }
        });


//        interactions for changing the color of the profiles

        ImageView red1 = findViewById(R.id.pick_red_1_user_select);
        red1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!sameColors2[0]) {
                    player1.setColorFilter(ContextCompat.getColor(getApplicationContext(), R.color.red), PorterDuff.Mode.SCREEN);
                    player1.setTag(red1.getTag());
                    sameColors1[0] = true;
                    unTrue1(0);
                }
            }
        });

        ImageView blue1 = findViewById(R.id.pick_blue_1_user_select);
        blue1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!sameColors2[1]) {
                    player1.setColorFilter(ContextCompat.getColor(getApplicationContext(), R.color.blue), PorterDuff.Mode.SCREEN);
                    player1.setTag(blue1.getTag());
                    sameColors1[1] = true;
                    unTrue1(1);
                }
            }
        });
        ImageView orange1 = findViewById(R.id.pick_orange_1_user_select);
        orange1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!sameColors2[2]) {
                    player1.setColorFilter(ContextCompat.getColor(getApplicationContext(), R.color.orange), PorterDuff.Mode.SCREEN);
                    player1.setTag(orange1.getTag());
                    sameColors1[2] = true;
                    unTrue1(2);
                }
            }
        });
        ImageView purple1 = findViewById(R.id.pick_purple_1_user_select);
        purple1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!sameColors2[3]) {
                    player1.setColorFilter(ContextCompat.getColor(getApplicationContext(), R.color.purple), PorterDuff.Mode.SCREEN);
                    player1.setTag(purple1.getTag());
                    sameColors1[3] = true;
                    unTrue1(3);
                }
            }
        });
        ImageView yellow1 = findViewById(R.id.pick_yellow_1_user_select);
        yellow1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!sameColors2[4]) {
                    player1.setColorFilter(ContextCompat.getColor(getApplicationContext(), R.color.yellow), PorterDuff.Mode.SCREEN);
                    player1.setTag(yellow1.getTag());
                    sameColors1[4] = true;
                    unTrue1(4);
                }
            }
        });
        ImageView pink1 = findViewById(R.id.pick_pink_1_user_select);
        pink1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!sameColors2[5]) {
                    player1.setColorFilter(ContextCompat.getColor(getApplicationContext(), R.color.pink), PorterDuff.Mode.SCREEN);
                    player1.setTag(pink1.getTag());
                    sameColors1[5] = true;
                    unTrue1(5);
                }
            }
        });
        ImageView green1 = findViewById(R.id.pick_green_1_user_select);
        green1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!sameColors2[6]) {
                    player1.setColorFilter(ContextCompat.getColor(getApplicationContext(), R.color.green), PorterDuff.Mode.SCREEN);
                    player1.setTag(green1.getTag());
                    sameColors1[6] = true;
                    unTrue1(6);
                }
            }
        });
        ImageView grey1 = findViewById(R.id.pick_grey_1_user_select);
        grey1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!sameColors2[7]) {
                    player1.setColorFilter(ContextCompat.getColor(getApplicationContext(), R.color.grey), PorterDuff.Mode.SCREEN);
                    player1.setTag(grey1.getTag());
                    sameColors1[7] = true;
                    unTrue1(7);
                }
            }
        });

        ImageView red2 = findViewById(R.id.pick_red_2_user_select);
        red2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!sameColors1[0]) {
                    player2.setColorFilter(ContextCompat.getColor(getApplicationContext(), R.color.red), PorterDuff.Mode.SCREEN);
                    player2.setTag(red2.getTag());
                    sameColors2[0] = true;
                    unTrue2(0);
                }
            }
        });

        ImageView blue2 = findViewById(R.id.pick_blue_2_user_select);
        blue2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!sameColors1[1]) {
                    player2.setColorFilter(ContextCompat.getColor(getApplicationContext(), R.color.blue), PorterDuff.Mode.SCREEN);
                    player2.setTag(blue2.getTag());
                    sameColors2[1] = true;
                    unTrue2(1);
                }
            }
        });
        ImageView orange2 = findViewById(R.id.pick_orange_2_user_select);
        orange2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!sameColors1[2]) {
                    player2.setColorFilter(ContextCompat.getColor(getApplicationContext(), R.color.orange), PorterDuff.Mode.SCREEN);
                    player2.setTag(orange2.getTag());
                    sameColors2[2] = true;
                    unTrue2(2);
                }
            }
        });
        ImageView purple2 = findViewById(R.id.pick_purple_2_user_select);
        purple2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!sameColors1[3]) {
                    player2.setColorFilter(ContextCompat.getColor(getApplicationContext(), R.color.purple), PorterDuff.Mode.SCREEN);
                    player2.setTag(purple2.getTag());
                    sameColors2[3] = true;
                    unTrue2(3);
                }
            }
        });
        ImageView yellow2 = findViewById(R.id.pick_yellow_2_user_select);
        yellow2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!sameColors1[4]) {
                    player2.setColorFilter(ContextCompat.getColor(getApplicationContext(), R.color.yellow), PorterDuff.Mode.SCREEN);
                    player2.setTag(yellow2.getTag());
                    sameColors2[4] = true;
                    unTrue2(4);
                }
            }
        });
        ImageView pink2 = findViewById(R.id.pick_pink_2_user_select);
        pink2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!sameColors1[5]) {
                    player2.setColorFilter(ContextCompat.getColor(getApplicationContext(), R.color.pink), PorterDuff.Mode.SCREEN);
                    player2.setTag(pink2.getTag());
                    sameColors2[5] = true;
                    unTrue2(5);
                }
            }
        });
        ImageView green2 = findViewById(R.id.pick_green_2_user_select);
        green2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!sameColors1[6]) {
                    player2.setColorFilter(ContextCompat.getColor(getApplicationContext(), R.color.green), PorterDuff.Mode.SCREEN);
                    player2.setTag(green2.getTag());
                    sameColors2[6] = true;
                    unTrue2(6);
                }
            }
        });
        ImageView grey2 = findViewById(R.id.pick_grey_2_user_select);
        grey2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!sameColors1[7]) {
                    player2.setColorFilter(ContextCompat.getColor(getApplicationContext(), R.color.grey), PorterDuff.Mode.SCREEN);
                    player2.setTag(grey2.getTag());
                    sameColors2[7] = true;
                    unTrue2(7);
                }
            }
        });
    }

    private void unTrue1(int index) {
        for (int i = 0; i < sameColors1.length; i++) {
            if (i == index) {
                continue;
            } else {
                sameColors1[i] = false;
            }
        }
    }

    private void unTrue2(int index) {
        for (int i = 0; i < sameColors2.length; i++) {
            if (i == index) {
                continue;
            } else {
                sameColors2[i] = false;
            }
        }
    }
}
