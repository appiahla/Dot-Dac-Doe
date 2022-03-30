package com.example.dot_dac_doe.VerticalLayouts;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.dot_dac_doe.HomeActivity;
import com.example.dot_dac_doe.Players.Computer;
import com.example.dot_dac_doe.Models.HumanPlayer;
import com.example.dot_dac_doe.Models.Player;
import com.example.dot_dac_doe.R;
import com.example.dot_dac_doe.Views.GameView;
import com.example.dot_dac_doe.Views.PlayersStateView;
import com.example.dot_dac_doe.tutorial_page;

import java.util.Map;

public class MultiplayerGameOppositeVertical extends AppCompatActivity implements PlayersStateView {

    protected GameView gameView;
    protected TextView player1name, player2name, player1points, player2points;
    ImageView currentPlayerPointer;
    Player[] players;
    Integer[] playersPoints = new Integer[]{0, 0};
    Player currentPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multiplayer_game_opposite_vertical);

        gameView = findViewById(R.id.gameView_mult4);
        gameView.setPlayersState(this);

        player1name = findViewById(R.id.player1name_mult4);
        player2name = findViewById(R.id.player2name_mult4);
        player1points = findViewById(R.id.player1points_mult4);
        player2points = findViewById(R.id.player2points_mult4);
        currentPlayerPointer = findViewById(R.id.playerNowPointer_mult4);

        players = new Player[]{new HumanPlayer("Human"), new Computer("Computer")};
        startGame(players);

        //      interaction for pause button
        ImageView pause = findViewById(R.id.multiplayer_pause4);
        pause.setOnClickListener(view -> pauseGame());
    }

    private void startGame(Player[] players) {
        gameView.startGame(players);
        updateState();
    }

    public void updateState() {
        runOnUiThread(() -> {
            if (currentPlayer == players[0]) {
                currentPlayerPointer.setImageResource(R.drawable.a1);
            } else if (currentPlayer == players[1]) {
                currentPlayerPointer.setImageResource(R.drawable.a2);
            }
            player1points.setText("Boxes: " + playersPoints[0]);
            player2points.setText("Boxes: " + playersPoints[1]);
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
        runOnUiThread(() -> new AlertDialog.Builder(MultiplayerGameOppositeVertical.this)
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
                }).show());
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

        Button yes = exitView.findViewById(R.id.vertical_exit_yes);
        yes.setOnClickListener(view16 -> {
            exitAlert.dismiss();
            Intent i = new Intent(MultiplayerGameOppositeVertical.this, HomeActivity.class);
            i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(i);
        });

        Button no = exitView.findViewById(R.id.vertical_exit_no);
        no.setOnClickListener(view15 -> {
            exitAlert.dismiss();
            alert.show();
        });


        //      interaction for resuming
        Button resume = view.findViewById(R.id.vertical_resume);
        resume.setOnClickListener(view14 -> alert.dismiss());


        //      interaction for exiting the game
        Button exit = view.findViewById(R.id.vertical_exit);
        exit.setOnClickListener(view13 -> {
            alert.dismiss();
            exitAlert.show();

        });

        //      interaction for how to play
        Button howto = view.findViewById(R.id.vertical_howto);
        howto.setOnClickListener(view12 -> {
            Intent i = new Intent(MultiplayerGameOppositeVertical.this, tutorial_page.class);
            startActivity(i);
        });

        //      interaction for restarting the game
        Button restart = view.findViewById(R.id.vertical_restart);
        restart.setOnClickListener(view1 -> {
            alert.dismiss();
            Intent i = new Intent(MultiplayerGameOppositeVertical.this, MultiplayerGame.class);
            i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(i);
        });

        alert.show();
    }
}
