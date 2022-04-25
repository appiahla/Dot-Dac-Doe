//package com.example.dot_dac_doe.HorizontalLayouts;
//
//import androidx.appcompat.app.AlertDialog;
//import androidx.appcompat.app.AppCompatActivity;
//
//import android.content.DialogInterface;
//import android.os.Bundle;
//import android.widget.ImageView;
//import android.widget.TextView;
//
//import com.example.dot_dac_doe.Players.Computer;
//import com.example.dot_dac_doe.Models.HumanPlayer;
//import com.example.dot_dac_doe.Models.Player;
//import com.example.dot_dac_doe.R;
//import com.example.dot_dac_doe.Views.GameView;
//import com.example.dot_dac_doe.Views.PlayersStateView;
//
//import java.util.Map;
//
//public class GameActivitySame extends AppCompatActivity implements PlayersStateView {
//
//    protected GameView gameView;
//    protected TextView player1name, player2name, player1points, player2points;
//    ImageView currentPlayerPointer;
//    Player[] players;
//    Integer[] playersPoints = new Integer[]{0, 0};
//    Player currentPlayer;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_game_same);
//
//        gameView = (GameView) findViewById(R.id.gameView2);
//        gameView.setPlayersState(this);
//
//        player1name = (TextView) findViewById(R.id.player1name2);
//        player2name = (TextView) findViewById(R.id.player2name2);
//        player1points = (TextView) findViewById(R.id.player1points2);
//        player2points = (TextView) findViewById(R.id.player2points2);
//        currentPlayerPointer = (ImageView) findViewById(R.id.playerNowPointer2);
//        //currentPlayerPointer = (ImageView) findViewById(R.id.playerNowPointer2_1);
//
//        players = new Player[]{new HumanPlayer("Human"), new Computer("Computer")};
//        startGame(players);
//    }
//
//    private void startGame(Player[] players) {
//        gameView.startGame(players);
//        updateState();
//    }
//
//    public void updateState() {
//        runOnUiThread(new Runnable() {
//            @Override
//            public void run() {
//                if (currentPlayer == players[0]) {
//                    currentPlayerPointer.setImageResource(R.drawable.a1);
//                } else if (currentPlayer == players[1]) {
//                    currentPlayerPointer.setImageResource(R.drawable.a2);
//                }
//                player1points.setText("Boxes: " + playersPoints[0]);
//                player2points.setText("Boxes: " + playersPoints[1]);
//            }
//        });
//    }
//
//    @Override
//    public void setCurrentPlayer(Player player) {
//        currentPlayer = player;
//        updateState();
//    }
//
//    @Override
//    public void setPlayerPoints(Map<Player, Integer> player_occupyingBoxesCount_map) {
//        playersPoints[0] = (player_occupyingBoxesCount_map.get(players[0]));
//        playersPoints[1] = (player_occupyingBoxesCount_map.get(players[1]));
//        updateState();
//    }
//
//    @Override
//    public void setWinner(final Player winner) {
//        runOnUiThread(new Runnable() {
//            @Override
//            public void run() {
//                new AlertDialog.Builder(GameActivitySame.this)
//                        .setTitle("Dots And Boxes")
//                        .setMessage(winner.getName() + " Wins!")
//                        .setPositiveButton("Restart", new DialogInterface.OnClickListener() {
//                            public void onClick(DialogInterface dialog, int which) {
//                                recreate();
//                            }
//                        })
//                        .setNeutralButton("Dismiss", new DialogInterface.OnClickListener() {
//                            @Override
//                            public void onClick(DialogInterface dialogInterface, int i) {
//                            }
//                        }).show();
//            }
//        });
//    }
//}
