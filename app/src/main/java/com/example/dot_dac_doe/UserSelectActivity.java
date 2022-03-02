package com.example.dot_dac_doe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class UserSelectActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
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

    }
}