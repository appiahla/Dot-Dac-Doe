package com.example.dot_dac_doe;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.dot_dac_doe.model.Player;



public class winner_page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_winner_page);
        Button play_again = findViewById(R.id.play_again);
        Button home_button = findViewById(R.id.home_button);
        setContentView(R.layout.activity_multiplayer_game);

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
        Button restart = (Button) findViewById(R.id.vertical_restart);
        restart.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Intent i = new Intent(winner_page.this, MultiplayerGame.class);
                i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(i);
            }
        });


        }
            public void setWinner(final Player winner) {
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        new AlertDialog.Builder(winner_page.this)
                                .setTitle("Dots And Boxes")
                                .setMessage(winner.getName() + " Wins!")
                                .setPositiveButton("Restart", new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int which) {
                                        recreate();
                                    }
                                })
                                .setNeutralButton("Dismiss", new DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface dialogInterface, int i) {
                                    }
                                }).show();
                    }
                });
            }
}