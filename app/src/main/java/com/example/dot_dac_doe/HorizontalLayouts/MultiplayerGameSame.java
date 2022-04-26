package com.example.dot_dac_doe.HorizontalLayouts;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.dot_dac_doe.Players.Computer;
import com.example.dot_dac_doe.Models.HumanPlayer;
import com.example.dot_dac_doe.Models.Player;
import com.example.dot_dac_doe.R;
import com.example.dot_dac_doe.VerticalLayouts.MultiplayerGame;
import com.example.dot_dac_doe.Views.GameView;
import com.example.dot_dac_doe.Views.PlayersStateView;
import com.example.dot_dac_doe.winner_page;

import java.util.Map;

public class MultiplayerGameSame extends AppCompatActivity implements PlayersStateView {

    protected GameView gameView;
    protected TextView player1name, player2name, player1points, player2points;
    ImageView currentPlayerPointer;
    Player[] players;
    Integer[] playersPoints = new Integer[]{0, 0};
    Player currentPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multiplayer_game_same);

        gameView = (GameView) findViewById(R.id.gameView_mult2);
        gameView.setPlayersState(this);

        player1name = (TextView) findViewById(R.id.player1name_mult2);
        player2name = (TextView) findViewById(R.id.player2name_mult2);
        player1points = (TextView) findViewById(R.id.player1points_mult2);
        player2points = (TextView) findViewById(R.id.player2points_mult2);
        currentPlayerPointer = (ImageView) findViewById(R.id.playerNowPointer_mult2);

        players = new Player[]{new HumanPlayer("Human"), new Computer("Computer")};
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
    public void setPlayerPoints(Map<Player, Integer> player_occupyingBoxesCount_map) {
        playersPoints[0] = (player_occupyingBoxesCount_map.get(players[0]));
        playersPoints[1] = (player_occupyingBoxesCount_map.get(players[1]));
        updateState();
    }

    @Override
    public void setWinner(final Player winner) {
        Intent i = new Intent(MultiplayerGameSame.this, winner_page.class);
        i.putExtra("winner", winner.getName());
        startActivity(i);
    }
}
