package com.example.dot_dac_doe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.dot_dac_doe.VerticalLayouts.MultiplayerGame;
import com.example.dot_dac_doe.VerticalLayouts.MultiplayerGameOppositeVertical;


public class Orientation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_orientation);
        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        // action between orientation same-side vertical
        ImageView same_side_vert = findViewById(R.id.ss_vertical);
        same_side_vert.setOnClickListener(view -> {
            Intent i = new Intent(Orientation.this, MultiplayerGame.class);
            if (extras != null) {
                if (extras.containsKey("icon1")){
                    i.putExtra("icon1", getIntent().getStringExtra("icon1"));
                }
                if (extras.containsKey("icon2")){
                    i.putExtra("icon2", getIntent().getStringExtra("icon2"));
                }
                if (extras.containsKey("color1")){
                    i.putExtra("color1", getIntent().getStringExtra("color1"));
                }
                if (extras.containsKey("color2")){
                    i.putExtra("color2", getIntent().getStringExtra("color2"));
                }
            }

            startActivity(i);
        });

//        action between orientation and opposite side vertical
        ImageView opp_side_vert = findViewById(R.id.os_vertical);
        opp_side_vert.setOnClickListener(view -> {
            Intent i = new Intent(Orientation.this, MultiplayerGameOppositeVertical.class);
            if (extras != null) {
                if (extras.containsKey("icon1")){
                    i.putExtra("icon1", getIntent().getStringExtra("icon1"));
                }
                if (extras.containsKey("icon2")){
                    i.putExtra("icon2", getIntent().getStringExtra("icon2"));
                }
                if (extras.containsKey("color1")){
                    i.putExtra("color1", getIntent().getStringExtra("color1"));
                }
                if (extras.containsKey("color2")){
                    i.putExtra("color2", getIntent().getStringExtra("color2"));
                }
            }

            startActivity(i);
        });
    }
}