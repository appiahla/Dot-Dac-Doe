package com.example.dot_dac_doe;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.dot_dac_doe.AI.RandomAIPlayer;
import com.example.dot_dac_doe.model.HumanPlayer;
import com.example.dot_dac_doe.model.Player;
import com.example.dot_dac_doe.view.GameView;
import com.example.dot_dac_doe.view.PlayersStateView;

import java.util.Map;

public class MultiplayerGame extends AppCompatActivity implements PlayersStateView {

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
        setContentView(R.layout.activity_multiplayer_game);

        gameView = (GameView) findViewById(R.id.gameView_mult);
        gameView.setPlayersState(this);

        player1name = (TextView) findViewById(R.id.player1name_mult);
        player2name = (TextView) findViewById(R.id.player2name_mult);
        player1points = (TextView) findViewById(R.id.player1points_mult);
        player2points = (TextView) findViewById(R.id.player2points_mult);
        currentPlayerPointer = (ImageView) findViewById(R.id.playerNowPointer_mult);
        pause = (ImageView) findViewById(R.id.multiplayer_pause);

        players = new Player[]{new HumanPlayer("Player 1"), new HumanPlayer("Player 2"),};
        startGame(players);

        //      interaction for orientation page
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
    public void setPlayerOccupyingBoxesCount(Map<Player, Integer> player_occupyingBoxesCount_map) {
        playersPoints[0] = (player_occupyingBoxesCount_map.get(players[0]));
        playersPoints[1] = (player_occupyingBoxesCount_map.get(players[1]));
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

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.game, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.action_new) {
            runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    new AlertDialog.Builder(MultiplayerGame.this)
                            .setTitle("Dots And Boxes")
                            .setMessage("New game versus")
                            .setPositiveButton("Computer", new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                    new AlertDialog.Builder(MultiplayerGame.this)
                                            .setTitle("Who goes first?")
                                            .setPositiveButton("Computer", new DialogInterface.OnClickListener() {
                                                @Override
                                                public void onClick(DialogInterface dialogInterface, int i) {
                                                    players = new Player[]{new RandomAIPlayer("Computer"),
                                                            new HumanPlayer("Player 1")};
                                                    startGame(players);

                                                    player1name.setText("Computer");
                                                    player2name.setText("Player 1");
                                                }
                                            })
                                            .setNegativeButton("Human", new DialogInterface.OnClickListener() {
                                                @Override
                                                public void onClick(DialogInterface dialogInterface, int i) {
                                                    players = new Player[]{new HumanPlayer("Player 1"),
                                                            new RandomAIPlayer("Computer")};
                                                    startGame(players);

                                                    player1name.setText("Player 1");
                                                    player2name.setText("Computer");
                                                }
                                            }).show();
                                }
                            })
                            .setNeutralButton("Another Player", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialogInterface, int i) {
                                    players = new Player[]{new HumanPlayer("Player 1"), new HumanPlayer("Player 2")};
                                    startGame(players);

                                    player1name.setText("Player 1");
                                    player2name.setText("Player 2");
                                }
                            }).show();
                } //if condition for human/computer
            });
        }

        return super.onOptionsItemSelected(item);
    }

    public void pauseGame() {
//        final Dialog dialog = new Dialog(this);
//        dialog.setContentView(R.layout.activity_vertical_pause_menu);
//        dialog.show();

        View view = getLayoutInflater().inflate(R.layout.activity_vertical_pause_menu, null);
        //get any variables
        //TextView yourTextView = view.findViewById(R.id.your_textview_id);
        AlertDialog.Builder builder = new AlertDialog.Builder(this);

        builder.setView(view);
        AlertDialog alert = builder.create();
        alert.getWindow().setBackgroundDrawableResource(R.color.transparent);
        alert.show();
    }

//    public void pauseGame() {
////        int id = item.getItemId();
//
//        runOnUiThread(new Runnable() {
//            @Override
//            public void run() {
//                new AlertDialog.Builder(MultiplayerGame.this)
//                        .setTitle("Dots And Boxes")
//                        .setMessage("New game versus")
//                        .setPositiveButton("Computer", new DialogInterface.OnClickListener() {
//                            public void onClick(DialogInterface dialog, int which) {
//                                new AlertDialog.Builder(MultiplayerGame.this)
//                                        .setTitle("Who goes first?")
//                                        .setPositiveButton("Computer", new DialogInterface.OnClickListener() {
//                                            @Override
//                                            public void onClick(DialogInterface dialogInterface, int i) {
//                                                players = new Player[]{new RandomAIPlayer("Computer"),
//                                                        new HumanPlayer("Player 1")};
//                                                startGame(players);
//
//                                                player1name.setText("Computer");
//                                                player2name.setText("Player 1");
//                                            }
//                                        })
//                                        .setNegativeButton("Human", new DialogInterface.OnClickListener() {
//                                            @Override
//                                            public void onClick(DialogInterface dialogInterface, int i) {
//                                                players = new Player[]{new HumanPlayer("Player 1"),
//                                                        new RandomAIPlayer("Computer")};
//                                                startGame(players);
//
//                                                player1name.setText("Player 1");
//                                                player2name.setText("Computer");
//                                            }
//                                        }).show();
//                            }
//                        })
//                        .setNeutralButton("Another Player", new DialogInterface.OnClickListener() {
//                            @Override
//                            public void onClick(DialogInterface dialogInterface, int i) {
//                                players = new Player[]{new HumanPlayer("Player 1"), new HumanPlayer("Player 2")};
//                                startGame(players);
//
//                                player1name.setText("Player 1");
//                                player2name.setText("Player 2");
//                            }
//                        }).show();
//            } //if condition for human/computer
//        });
//
////        return super.onOptionsItemSelected(item);
//    }
}