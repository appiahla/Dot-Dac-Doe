package com.example.dot_dac_doe;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;


public class iconPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_icon_page);

        ImageView orientation = findViewById(R.id.imageView5);
        orientation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(iconPage.this, UserSelectActivity.class);
                startActivity(i);
            }
        });

        ImageView TreeClick = findViewById(R.id.tree);
        ImageView Icon1 = findViewById(R.id.Icon1);
        TreeClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Icon1.setImageDrawable(ContextCompat.getDrawable(R.drawable.tree));
                Icon1.setImageResource(R.drawable.tree);

//                Icon1.setImageResource(R.drawable.tree);
//                Intent i = new Intent(iconPage.this, UserSelectActivity.class);
//                startActivity(i);
            }
        });

    }


}