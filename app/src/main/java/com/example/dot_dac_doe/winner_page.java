package com.example.dot_dac_doe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;


public class winner_page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_winner_page);
        Button play_again = findViewById(R.id.play_again);
        Button home_button = findViewById(R.id.home_button);
        play_again.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(winner_page.this, UserSelectActivity.class);
                startActivity(i);
            }
        });
        home_button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent a = new Intent(winner_page.this, HomeActivity.class);
                startActivity(a);
            }
        });
            }

    }