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

import com.example.dot_dac_doe.Models.HumanPlayer;
import com.example.dot_dac_doe.Models.Player;
import com.example.dot_dac_doe.Views.GameView;
import com.example.dot_dac_doe.Views.PlayersStateView;

import java.util.Map;

public class MultiplayerGame extends AppCompatActivity implements PlayersStateView {

    protected GameView gameView;
    protected TextView player1name, player2name, player1points,
            player2points;
    ImageView currentPlayerPointer, pause;
    Player[] players;
    Integer[] playersPoints = new Integer[]{0, 0};
    Player currentPlayer;

//   will need to add these later
//    ImageView Icon1 = findViewById(R.id.Icon1);
//    ImageView Icon2 = findViewById(R.id.Icon2);

//    ImageView player1;
//    ImageView player2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multiplayer_game);

        ImageView player1 = findViewById(R.id.player1_circle_mult);
        ImageView player2 = findViewById(R.id.computer_circle_mult);

        gameView = (GameView) findViewById(R.id.gameView_mult);
        gameView.setPlayersState(this);

        player1name = (TextView) findViewById(R.id.player1name_mult);
        player2name = (TextView) findViewById(R.id.player2name_mult);
        player1points = (TextView) findViewById(R.id.player1points_mult);
        player2points = (TextView) findViewById(R.id.player2points_mult);
        currentPlayerPointer = (ImageView) findViewById(R.id.playerNowPointer_mult);
        pause = (ImageView) findViewById(R.id.multiplayer_pause);

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        if (extras != null) {
            if (extras.containsKey("color1")) {
                String color1 = getIntent().getStringExtra("color1");
                if (color1.equalsIgnoreCase("red1")) {
                    player1.setColorFilter(ContextCompat.getColor(getApplicationContext(), R.color.red), PorterDuff.Mode.SCREEN);
                    player1.setTag("red1");
                    player1name.setTextColor(getResources().getColor(R.color.red));
                    player1name.setTag("red1");
                    player1points.setTextColor(getResources().getColor(R.color.red));
                    player1points.setTag("red1");
                }
                if (color1.equalsIgnoreCase("blue1")) {
                    player1.setColorFilter(ContextCompat.getColor(getApplicationContext(), R.color.blue), PorterDuff.Mode.SCREEN);
                    player1.setTag("blue1");
                    player1name.setTextColor(getResources().getColor(R.color.blue));
                    player1name.setTag("blue1");
                    player1points.setTextColor(getResources().getColor(R.color.blue));
                    player1points.setTag("blue1");
                }
                if (color1.equalsIgnoreCase("orange1")) {
                    player1.setColorFilter(ContextCompat.getColor(getApplicationContext(), R.color.orange), PorterDuff.Mode.SCREEN);
                    player1.setTag("orange1");
                    player1name.setTextColor(getResources().getColor(R.color.orange));
                    player1name.setTag("orange1");
                    player1points.setTextColor(getResources().getColor(R.color.orange));
                    player1points.setTag("orange1");
                }
                if (color1.equalsIgnoreCase("purple1")) {
                    player1.setColorFilter(ContextCompat.getColor(getApplicationContext(), R.color.purple), PorterDuff.Mode.SCREEN);
                    player1.setTag("purple1");
                    player1name.setTextColor(getResources().getColor(R.color.purple));
                    player1name.setTag("purple1");
                    player1points.setTextColor(getResources().getColor(R.color.purple));
                    player1points.setTag("purple1");
                }
                if (color1.equalsIgnoreCase("yellow1")) {
                    player1.setColorFilter(ContextCompat.getColor(getApplicationContext(), R.color.yellow), PorterDuff.Mode.SCREEN);
                    player1.setTag("yellow1");
                    player1name.setTextColor(getResources().getColor(R.color.yellow));
                    player1name.setTag("yellow1");
                    player1points.setTextColor(getResources().getColor(R.color.yellow));
                    player1points.setTag("yellow1");
                }
                if (color1.equalsIgnoreCase("pink1")) {
                    player1.setColorFilter(ContextCompat.getColor(getApplicationContext(), R.color.pink), PorterDuff.Mode.SCREEN);
                    player1.setTag("pink1");
                    player1name.setTextColor(getResources().getColor(R.color.pink));
                    player1name.setTag("pink1");
                    player1points.setTextColor(getResources().getColor(R.color.pink));
                    player1points.setTag("pink1");
                }
                if (color1.equalsIgnoreCase("green1")) {
                    player1.setColorFilter(ContextCompat.getColor(getApplicationContext(), R.color.green), PorterDuff.Mode.SCREEN);
                    player1.setTag("green1");
                    player1name.setTextColor(getResources().getColor(R.color.green));
                    player1name.setTag("green1");
                    player1points.setTextColor(getResources().getColor(R.color.green));
                    player1points.setTag("green1");
                }
                if (color1.equalsIgnoreCase("grey1")) {
                    player1.setColorFilter(ContextCompat.getColor(getApplicationContext(), R.color.grey), PorterDuff.Mode.SCREEN);
                    player1.setTag("grey1");
                    player1name.setTextColor(getResources().getColor(R.color.grey));
                    player1name.setTag("grey1");
                    player1points.setTextColor(getResources().getColor(R.color.grey));
                    player1points.setTag("grey1");
                }
            }
            if (extras.containsKey("color2")) {
                String color2 = getIntent().getStringExtra("color2");
                if (color2.equalsIgnoreCase("red2")) {
                    player2.setColorFilter(ContextCompat.getColor(getApplicationContext(), R.color.red), PorterDuff.Mode.SCREEN);
                    player2.setTag("red2");
                    player2name.setTextColor(getResources().getColor(R.color.red));
                    player2name.setTag("red2");
                    player2points.setTextColor(getResources().getColor(R.color.red));
                    player2points.setTag("red2");
                }
                if (color2.equalsIgnoreCase("blue2")) {
                    player2.setColorFilter(ContextCompat.getColor(getApplicationContext(), R.color.blue), PorterDuff.Mode.SCREEN);
                    player2.setTag("blue2");
                    player2name.setTextColor(getResources().getColor(R.color.blue));
                    player2name.setTag("blue2");
                    player2points.setTextColor(getResources().getColor(R.color.blue));
                    player2points.setTag("blue2");
                }
                if (color2.equalsIgnoreCase("orange2")) {
                    player2.setColorFilter(ContextCompat.getColor(getApplicationContext(), R.color.orange), PorterDuff.Mode.SCREEN);
                    player2.setTag("orange2");
                    player2name.setTextColor(getResources().getColor(R.color.orange));
                    player2name.setTag("orange2");
                    player2points.setTextColor(getResources().getColor(R.color.orange));
                    player2points.setTag("orange2");
                }
                if (color2.equalsIgnoreCase("purple2")) {
                    player2.setColorFilter(ContextCompat.getColor(getApplicationContext(), R.color.purple), PorterDuff.Mode.SCREEN);
                    player2.setTag("purple2");
                    player2name.setTextColor(getResources().getColor(R.color.purple));
                    player2name.setTag("purple2");
                    player2points.setTextColor(getResources().getColor(R.color.purple));
                    player2points.setTag("purple2");
                }
                if (color2.equalsIgnoreCase("yellow2")) {
                    player2.setColorFilter(ContextCompat.getColor(getApplicationContext(), R.color.yellow), PorterDuff.Mode.SCREEN);
                    player2.setTag("yellow2");
                    player2name.setTextColor(getResources().getColor(R.color.yellow));
                    player2name.setTag("yellow2");
                    player2points.setTextColor(getResources().getColor(R.color.yellow));
                    player2points.setTag("yellow2");
                }
                if (color2.equalsIgnoreCase("pink2")) {
                    player2.setColorFilter(ContextCompat.getColor(getApplicationContext(), R.color.pink), PorterDuff.Mode.SCREEN);
                    player2.setTag("pink2");
                    player2name.setTextColor(getResources().getColor(R.color.pink));
                    player2name.setTag("pink2");
                    player2points.setTextColor(getResources().getColor(R.color.pink));
                    player2points.setTag("pink2");
                }
                if (color2.equalsIgnoreCase("green2")) {
                    player2.setColorFilter(ContextCompat.getColor(getApplicationContext(), R.color.green), PorterDuff.Mode.SCREEN);
                    player2.setTag("green2");
                    player2name.setTextColor(getResources().getColor(R.color.green));
                    player2name.setTag("green2");
                    player2points.setTextColor(getResources().getColor(R.color.green));
                    player2points.setTag("green2");
                }
                if (color2.equalsIgnoreCase("grey2")) {
                    player2.setColorFilter(ContextCompat.getColor(getApplicationContext(), R.color.grey), PorterDuff.Mode.SCREEN);
                    player2.setTag("grey2");
                    player2name.setTextColor(getResources().getColor(R.color.grey));
                    player2name.setTag("grey2");
                    player2points.setTextColor(getResources().getColor(R.color.grey));
                    player2points.setTag("grey2");
                }
            }
        }



        players = new Player[]{new HumanPlayer("Player 1"), new HumanPlayer("Player 2"),};

        if (!String.valueOf(player1.getTag()).isEmpty()) {
            players[0].setTag(String.valueOf(player1.getTag()));
        }
        if (!String.valueOf(player2.getTag()).isEmpty()) {
            players[1].setTag(String.valueOf(player2.getTag()));
        }
//        players = new Player[]{new HumanPlayer("Player 1"), new HumanPlayer("Player 2"),};
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
                } else if (currentPlayer == players[1]) {
                    currentPlayerPointer.setImageResource(R.drawable.a2);
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
                new AlertDialog.Builder(MultiplayerGame.this)
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
                Intent i = new Intent(MultiplayerGame.this, HomeActivity.class);
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
                Intent i = new Intent(MultiplayerGame.this, tutorial_page.class);
                startActivity(i);
            }
        });

        //      interaction for restarting the game
        Button restart = (Button) view.findViewById(R.id.vertical_restart);
        restart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                alert.dismiss();
                Intent i = new Intent(MultiplayerGame.this, MultiplayerGame.class);
                i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(i);
            }
        });

        alert.show();
    }
}