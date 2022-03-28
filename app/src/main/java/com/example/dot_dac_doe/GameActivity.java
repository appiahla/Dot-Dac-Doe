package com.example.dot_dac_doe;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.dot_dac_doe.AI.RandomAIPlayer;
import com.example.dot_dac_doe.model.HumanPlayer;
import com.example.dot_dac_doe.model.Player;
import com.example.dot_dac_doe.view.GameView;
import com.example.dot_dac_doe.view.PlayersStateView;

import java.util.Map;

public class GameActivity extends AppCompatActivity implements PlayersStateView {

    protected GameView gameView;
    protected TextView player1name, player2name, player1points, player2points;
    ImageView currentPlayerPointer;
    Player[] players;
    Integer[] playersPoints = new Integer[]{0, 0};
    Player currentPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        //setContentView(R.layout.activity_game_opposite);

        gameView = (GameView) findViewById(R.id.gameView);
        gameView.setPlayersState(this);

        player1name = (TextView) findViewById(R.id.player1name);
        player2name = (TextView) findViewById(R.id.player2name);
        player1points = (TextView) findViewById(R.id.player1points);
        player2points = (TextView) findViewById(R.id.player2points);
        currentPlayerPointer = (ImageView) findViewById(R.id.playerNowPointer);

        players = new Player[]{new HumanPlayer("Human"), new RandomAIPlayer("Computer")};
        startGame(players);
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
                    new AlertDialog.Builder(GameActivity.this)
                            .setTitle("Dots And Boxes")
                            .setMessage("New game versus")
                            .setPositiveButton("Computer", new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                    new AlertDialog.Builder(GameActivity.this)
                                            .setTitle("Who goes first?")
                                            .setPositiveButton("Computer", new DialogInterface.OnClickListener() {
                                                @Override
                                                public void onClick(DialogInterface dialogInterface, int i) {
                                                    players = new Player[]{new RandomAIPlayer("Computer"),
                                                            new HumanPlayer("Human")};
                                                    startGame(players);

                                                    player1name.setText("Computer");
                                                    player2name.setText("Human");
                                                }
                                            })
                                            .setNegativeButton("Human", new DialogInterface.OnClickListener() {
                                                @Override
                                                public void onClick(DialogInterface dialogInterface, int i) {
                                                    players = new Player[]{new HumanPlayer("Human"),
                                                            new RandomAIPlayer("Computer")};
                                                    startGame(players);

                                                    player1name.setText("Human");
                                                    player2name.setText("Computer");
                                                }
                                            }).show();
                                }
                            })
                            .setNeutralButton("Human", new DialogInterface.OnClickListener() {
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
}