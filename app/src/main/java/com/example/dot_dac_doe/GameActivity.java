package com.example.dot_dac_doe;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.dot_dac_doe.Players.Computer;
import com.example.dot_dac_doe.Models.HumanPlayer;
import com.example.dot_dac_doe.Models.Player;
import com.example.dot_dac_doe.Views.GameView;
import com.example.dot_dac_doe.Views.PlayersStateView;

import java.util.Map;

public class GameActivity extends AppCompatActivity implements PlayersStateView {

    protected GameView gameView;
    protected TextView player1name, player2name, player1points,
            player2points;
    ImageView currentPlayerPointer, pause;
    Player[] players;
    Integer[] playersPoints = new Integer[]{0, 0};
    Player currentPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        gameView = (GameView) findViewById(R.id.gameView_mult);
        gameView.setPlayersState(this);

        ImageView player1 = findViewById(R.id.player1_circle_mult);
        ImageView player2 = findViewById(R.id.computer_circle_mult);
        player1.setColorFilter(ContextCompat.getColor(getApplicationContext(), R.color.red), PorterDuff.Mode.SCREEN);
        player1.setTag("red1");
        player2.setColorFilter(ContextCompat.getColor(getApplicationContext(), R.color.blue), PorterDuff.Mode.SCREEN);
        player2.setTag("blue2");

        player1name = (TextView) findViewById(R.id.player1name_mult);
        player2name = (TextView) findViewById(R.id.player2name_mult);
        player1points = (TextView) findViewById(R.id.player1points_mult);
        player2points = (TextView) findViewById(R.id.player2points_mult);
        currentPlayerPointer = (ImageView) findViewById(R.id.playerNowPointer_mult);
        pause = (ImageView) findViewById(R.id.multiplayer_pause);
        currentPlayerPointer.setColorFilter(getResources().getColor(R.color.red));

        players = new Player[]{new HumanPlayer("Player 1"), new Computer("Computer")};
//        players[0]
//        if (!String.valueOf(player1.getTag()).isEmpty()) {
            players[0].setTag("red1");
//        }
//        if (!String.valueOf(player2.getTag()).isEmpty()) {
            players[1].setTag("blue2");
//        }
        startGame(players);

        //      interaction for pause button
        ImageView pause = findViewById(R.id.multiplayer_pause);
        pause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pauseGame();
            }
        });
    }

    private void startGame(Player[] players) {
        gameView.startGame(players);
        updateState();
    }

    public void updateState() {
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                if (currentPlayer == players[0]) {
                    currentPlayerPointer.setImageResource(R.drawable.a1);
                    currentPlayerPointer.setColorFilter(getResources().getColor(R.color.red));
                } else if (currentPlayer == players[1]) {
                    currentPlayerPointer.setImageResource(R.drawable.a2);
                    currentPlayerPointer.setColorFilter(getResources().getColor(R.color.blue));
                }
                player1points.setText("Boxes: " + playersPoints[0]);
                player2points.setText("Boxes: " + playersPoints[1]);
            }
        });
    }

    @Override
    public void setCurrentPlayer(Player player) {
        currentPlayer = player;
        updateState();
    }

    @Override
    public void setPlayerPoints(Map<Player, Integer> player_points_map) {
        playersPoints[0] = (player_points_map.get(players[0]));
        playersPoints[1] = (player_points_map.get(players[1]));
        updateState();
    }

    @Override
    public void setWinner(final Player winner) {
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                new AlertDialog.Builder(GameActivity.this)
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




    public void pauseGame() {
//        alert for pause menu
        View view = getLayoutInflater().inflate(R.layout.activity_vertical_pause_menu, null);
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setView(view);
        AlertDialog alert = builder.create();
        alert.getWindow().setBackgroundDrawableResource(R.color.transparent);
        alert.setCanceledOnTouchOutside(false);


//        alert for exit options
        View exitView = getLayoutInflater().inflate(R.layout.activity_vertical_exit_confirmation, null);
        AlertDialog.Builder exitBuilder = new AlertDialog.Builder(this);
        exitBuilder.setView(exitView);
        AlertDialog exitAlert = exitBuilder.create();
        exitAlert.getWindow().setBackgroundDrawableResource(R.color.transparent);
        exitAlert.setCanceledOnTouchOutside(false);

        Button yes = (Button) exitView.findViewById(R.id.vertical_exit_yes);
        yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                exitAlert.dismiss();
                Intent i = new Intent(GameActivity.this, HomeActivity.class);
                i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(i);
            }
        });

        Button no = (Button) exitView.findViewById(R.id.vertical_exit_no);
        no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                exitAlert.dismiss();
                alert.show();
            }
        });


        //      interaction for resuming
        Button resume = (Button) view.findViewById(R.id.vertical_resume);
        resume.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                alert.dismiss();
            }
        });


        //      interaction for exiting the game
        Button exit = (Button) view.findViewById(R.id.vertical_exit);
        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                alert.dismiss();
                exitAlert.show();

            }
        });

        //      interaction for how to play
        Button howto = (Button) view.findViewById(R.id.vertical_howto);
        howto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(GameActivity.this, tutorial_page.class);
                startActivity(i);
            }
        });

        //      interaction for restarting the game
        Button restart = (Button) view.findViewById(R.id.vertical_restart);
        restart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                alert.dismiss();
                Intent i = new Intent(GameActivity.this, GameActivity.class);
                i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(i);
            }
        });

        alert.show();
    }

}