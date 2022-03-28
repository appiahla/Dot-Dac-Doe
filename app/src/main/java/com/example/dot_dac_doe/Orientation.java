package com.example.dot_dac_doe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;


public class Orientation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_orientation);

        // action for back btn between orientation and user-select
        ImageView same_side_vert = findViewById(R.id.ss_vertical);
        same_side_vert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Orientation.this, MultiplayerGame.class);
                Intent intent = getIntent();
                Bundle extras = intent.getExtras();
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
            }
        });
    }
}