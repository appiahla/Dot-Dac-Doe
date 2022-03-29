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

import com.example.dot_dac_doe.Models.Player;



public class winner_page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_winner_page);
        Button play_again = findViewById(R.id.play_again);
        Button home_button = findViewById(R.id.home_button);
//        setContentView(R.layout.activity_multiplayer_game);
        TextView winnerLabel = (TextView) findViewById(R.id.winner_header);
        TextView congrats = (TextView) findViewById(R.id.congrats);
//        String winner = getIntent().getStringExtra("WINNER");
//        //int score = getIntent().getIntExtra("SCORE", 0);
//        int player1Score = getIntent().getIntExtra("WINNER", 0);
//        int player2Score = getIntent().getIntExtra("WINNER", 0);
//        SharedPreferences gameSettings = getSharedPreferences("DATA", Context.MODE_PRIVATE);
//
//        if (player1Score > player2Score){
//            winnerLabel.setText("CONGRATULATIONS PLAYER 1! "+ player1Score);
//
//        }else{
//            winnerLabel.setText("CONGRATULATIONS PLAYER 2! " + player2Score);
//
//        }


        play_again.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(winner_page.this, UserSelectActivity.class);
                startActivity(i);
                Intent intent = new Intent(getApplicationContext(),winner_page.class);
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
//      Button restart = (Button) findViewById(R.id.vertical_restart);
//        restart.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View view) {
//
//                Intent i = new Intent(winner_page.this, MultiplayerGame.class);
//                i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
//                startActivity(i);
//            }
//        });
//
//
        }
//            public void setWinner(final Player winner) {
//                runOnUiThread(new Runnable() {
//                    @Override
//                    public void run() {
//                        new AlertDialog.Builder(winner_page.this)
//                                .setTitle("Dots And Boxes")
//                                .setMessage(winner.getName() + " Wins!")
//                                .setPositiveButton("Restart", new DialogInterface.OnClickListener() {
//                                    public void onClick(DialogInterface dialog, int which) {
//                                        recreate();
//                                    }
//                                })
//                                .setNeutralButton("Dismiss", new DialogInterface.OnClickListener() {
//                                    @Override
//                                    public void onClick(DialogInterface dialogInterface, int i) {
//                                    }
//                                }).show();
//                    }
//                });
//            }

}