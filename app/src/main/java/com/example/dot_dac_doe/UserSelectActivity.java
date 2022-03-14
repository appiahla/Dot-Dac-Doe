package com.example.dot_dac_doe;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;

import android.content.Intent;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.view.Window;


public class UserSelectActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_user_select);


//       interaction for back btn between user-select and home activity
        ImageView back = findViewById(R.id.back_arrow);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(UserSelectActivity.this, HomeActivity.class);
                startActivity(i);
            }
        });

//      interaction for orientation page
        Button orientation = findViewById(R.id.orientation_button_user_select);
        orientation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(UserSelectActivity.this, Orientation.class);
                startActivity(i);
            }
        });

//        interaction for player one icon select
        ImageView player1 = findViewById(R.id.user_select_player1_circle);
        player1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(UserSelectActivity.this, iconPage.class);
                startActivity(i);
            }
        });

//        interaction for player two icon select
        ImageView player2 = findViewById(R.id.user_select_player2_circle);
        player2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(UserSelectActivity.this, iconPage.class);
                startActivity(i);
            }
        });


//        interactions for changing the color of the profiles

        ImageView red1 = findViewById(R.id.pick_red_1_user_select);
        red1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                player1.setColorFilter(ContextCompat.getColor(getApplicationContext(), R.color.red), PorterDuff.Mode.SCREEN);
            }
        });

        ImageView blue1 = findViewById(R.id.pick_blue_1_user_select);
        blue1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                player1.setColorFilter(ContextCompat.getColor(getApplicationContext(), R.color.blue), PorterDuff.Mode.SCREEN);
            }
        });
        ImageView orange1 = findViewById(R.id.pick_orange_1_user_select);
        orange1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                player1.setColorFilter(ContextCompat.getColor(getApplicationContext(), R.color.orange), PorterDuff.Mode.SCREEN);
            }
        });
        ImageView purple1 = findViewById(R.id.pick_purple_1_user_select);
        purple1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                player1.setColorFilter(ContextCompat.getColor(getApplicationContext(), R.color.purple), PorterDuff.Mode.SCREEN);
            }
        });
        ImageView yellow1 = findViewById(R.id.pick_yellow_1_user_select);
        yellow1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                player1.setColorFilter(ContextCompat.getColor(getApplicationContext(), R.color.yellow), PorterDuff.Mode.SCREEN);
            }
        });
        ImageView pink1 = findViewById(R.id.pick_pink_1_user_select);
        pink1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                player1.setColorFilter(ContextCompat.getColor(getApplicationContext(), R.color.pink), PorterDuff.Mode.SCREEN);
            }
        });
        ImageView green1 = findViewById(R.id.pick_green_1_user_select);
        green1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                player1.setColorFilter(ContextCompat.getColor(getApplicationContext(), R.color.green), PorterDuff.Mode.SCREEN);
            }
        });
        ImageView grey1 = findViewById(R.id.pick_grey_1_user_select);
        grey1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                player1.setColorFilter(ContextCompat.getColor(getApplicationContext(), R.color.grey), PorterDuff.Mode.SCREEN);
            }
        });

        ImageView red2 = findViewById(R.id.pick_red_2_user_select);
        red2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                player2.setColorFilter(ContextCompat.getColor(getApplicationContext(), R.color.red), PorterDuff.Mode.SCREEN);
            }
        });

        ImageView blue2 = findViewById(R.id.pick_blue_2_user_select);
        blue2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                player2.setColorFilter(ContextCompat.getColor(getApplicationContext(), R.color.blue), PorterDuff.Mode.SCREEN);
            }
        });
        ImageView orange2 = findViewById(R.id.pick_orange_2_user_select);
        orange2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                player2.setColorFilter(ContextCompat.getColor(getApplicationContext(), R.color.orange), PorterDuff.Mode.SCREEN);
            }
        });
        ImageView purple2 = findViewById(R.id.pick_purple_2_user_select);
        purple2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                player2.setColorFilter(ContextCompat.getColor(getApplicationContext(), R.color.purple), PorterDuff.Mode.SCREEN);
            }
        });
        ImageView yellow2 = findViewById(R.id.pick_yellow_2_user_select);
        yellow2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                player2.setColorFilter(ContextCompat.getColor(getApplicationContext(), R.color.yellow), PorterDuff.Mode.SCREEN);
            }
        });
        ImageView pink2 = findViewById(R.id.pick_pink_2_user_select);
        pink2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                player2.setColorFilter(ContextCompat.getColor(getApplicationContext(), R.color.pink), PorterDuff.Mode.SCREEN);
            }
        });
        ImageView green2 = findViewById(R.id.pick_green_2_user_select);
        green2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                player2.setColorFilter(ContextCompat.getColor(getApplicationContext(), R.color.green), PorterDuff.Mode.SCREEN);
            }
        });
        ImageView grey2 = findViewById(R.id.pick_grey_2_user_select);
        grey2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                player2.setColorFilter(ContextCompat.getColor(getApplicationContext(), R.color.grey), PorterDuff.Mode.SCREEN);
            }
        });

    }
}
