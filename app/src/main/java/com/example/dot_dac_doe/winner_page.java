package com.example.dot_dac_doe;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


//import com.example.dot_dac_doe.Models.Player;




public class winner_page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_winner_page);
        Button play_again = findViewById(R.id.play_again);
        Button home_button = findViewById(R.id.home_button);
        TextView winner_name = findViewById(R.id.winner_name);
        Intent in = getIntent();
        Bundle extras = in.getExtras();
        if (extras != null) {
            if (extras.containsKey("winner")) {
                String winner = getIntent().getStringExtra("winner");
                winner_name.setText(winner);            }        }

        play_again.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(winner_page.this, UserSelectActivity.class);
                startActivity(i);
                Intent intent = new Intent(getApplicationContext(), winner_page.class);
//                intent.putExtra("WINNER", winner);
                startActivity(intent);
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