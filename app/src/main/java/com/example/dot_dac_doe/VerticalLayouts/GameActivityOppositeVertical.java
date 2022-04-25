////package com.example.dot_dac_doe.VerticalLayouts;
////
////import androidx.appcompat.app.AlertDialog;
////import androidx.appcompat.app.AppCompatActivity;
////
////import android.content.DialogInterface;
////import android.os.Bundle;
////import android.widget.ImageView;
////import android.widget.TextView;
////
////import com.example.dot_dac_doe.Players.Computer;
////import com.example.dot_dac_doe.Models.HumanPlayer;
////import com.example.dot_dac_doe.Models.Player;
////import com.example.dot_dac_doe.R;
////import com.example.dot_dac_doe.Views.GameView;
////import com.example.dot_dac_doe.Views.PlayersStateView;
////
////import java.util.Map;
////
////public class GameActivityOppositeVertical extends AppCompatActivity implements PlayersStateView {
////
////    protected GameView gameView;
////    protected TextView player1name, player2name, player1points, player2points;
////    ImageView currentPlayerPointer;
////    Player[] players;
////    Integer[] playersPoints = new Integer[]{0, 0};
////    Player currentPlayer;
////
////    @Override
////    protected void onCreate(Bundle savedInstanceState) {
////        super.onCreate(savedInstanceState);
////        setContentView(R.layout.activity_game_opposite_vertical);
////
////        gameView = (GameView) findViewById(R.id.gameView4);
////        gameView.setPlayersState(this);
////
////        player1name = (TextView) findViewById(R.id.player1name4);
////        player2name = (TextView) findViewById(R.id.player2name4);
////        player1points = (TextView) findViewById(R.id.player1points4);
////        player2points = (TextView) findViewById(R.id.player2points4);
////        currentPlayerPointer = (ImageView) findViewById(R.id.playerNowPointer4);
////        //currentPlayerPointer = (ImageView) findViewById(R.id.playerNowPointer4_1);
////
////        players = new Player[]{new HumanPlayer("Human"), new Computer("Computer")};
////        startGame(players);
////    }
////
////    private void startGame(Player[] players) {
////        gameView.startGame(players);
////        updateState();
////    }
////
////    public void updateState() {
////        runOnUiThread(new Runnable() {
////            @Override
////            public void run() {
////                if (currentPlayer == players[0]) {
////                    currentPlayerPointer.setImageResource(R.drawable.a1);
////                } else if (currentPlayer == players[1]) {
////                    currentPlayerPointer.setImageResource(R.drawable.a2);
////                }
////                player1points.setText("Boxes: " + playersPoints[0]);
////                player2points.setText("Boxes: " + playersPoints[1]);
////            }
////        });
////    }
////
////    @Override
////    public void setCurrentPlayer(Player player) {
////        currentPlayer = player;
////        updateState();
////    }
////
////    @Override
////    public void setPlayerPoints(Map<Player, Integer> player_occupyingBoxesCount_map) {
////        playersPoints[0] = (player_occupyingBoxesCount_map.get(players[0]));
////        playersPoints[1] = (player_occupyingBoxesCount_map.get(players[1]));
////        updateState();
////    }
////
////    @Override
////    public void setWinner(final Player winner) {
////        runOnUiThread(new Runnable() {
////            @Override
////            public void run() {
////                new AlertDialog.Builder(GameActivityOppositeVertical.this)
////                        .setTitle("Dots And Boxes")
////                        .setMessage(winner.getName() + " Wins!")
////                        .setPositiveButton("Restart", new DialogInterface.OnClickListener() {
////                            public void onClick(DialogInterface dialog, int which) {
////                                recreate();
////                            }
////                        })
////                        .setNeutralButton("Dismiss", new DialogInterface.OnClickListener() {
////                            @Override
////                            public void onClick(DialogInterface dialogInterface, int i) {
////                            }
////                        }).show();
////            }
////        });
////    }
////}
//package com.example.dot_dac_doe.VerticalLayouts;
//
//import androidx.appcompat.app.AlertDialog;
//import androidx.appcompat.app.AppCompatActivity;
//import androidx.core.content.ContextCompat;
//
//import android.content.DialogInterface;
//import android.content.Intent;
//import android.graphics.PorterDuff;
//import android.media.Image;
//import android.os.Bundle;
//import android.view.View;
//import android.widget.Button;
//import android.widget.ImageView;
//import android.widget.TextView;
//
//import com.example.dot_dac_doe.HomeActivity;
//import com.example.dot_dac_doe.Players.Computer;
//import com.example.dot_dac_doe.Models.HumanPlayer;
//import com.example.dot_dac_doe.Models.Player;
//import com.example.dot_dac_doe.R;
//import com.example.dot_dac_doe.UserSelectActivity;
//import com.example.dot_dac_doe.Views.GameView;
//import com.example.dot_dac_doe.Views.PlayersStateView;
//import com.example.dot_dac_doe.tutorial_page;
//import com.example.dot_dac_doe.winner_page;
//
//import java.util.Map;
//
//public class GameActivityOppositeVertical extends AppCompatActivity implements PlayersStateView {
//
//    protected GameView gameView;
//    protected TextView player1name, player2name, player1points, player2points;
//    ImageView currentPlayerPointer1, currentPlayerPointer2;
//    Player[] players;
//    Integer[] playersPoints = new Integer[]{0, 0};
//    Player currentPlayer;
//
//    int colorOne;
//    int colorTwo;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_game_opposite_vertical);
//
//        ImageView player1 = findViewById((R.id.player1_circle_mult4));
//        ImageView player2 = findViewById(R.id.player2_circle_mult4);
//        colorOne  = getResources().getColor(R.color.black);
//        colorTwo = getResources().getColor(R.color.black);
//        ImageView Icon1 = findViewById(R.id.icon1_mult4);
//        ImageView Icon2 = findViewById(R.id.icon2_mult4);
//        player2.setColorFilter(ContextCompat.getColor(getApplicationContext(), R.color.blue), PorterDuff.Mode.SCREEN);
//        player2.setTag("blue2");
//        gameView = findViewById(R.id.gameView_mult4);
//        gameView.setPlayersState(this);
//
//        player1name = findViewById(R.id.player1name_mult4);
//        player2name = findViewById(R.id.player2name_mult4);
//        player1points = findViewById(R.id.player1points_mult4);
//        player2points = findViewById(R.id.player2points_mult4);
//        currentPlayerPointer1 = findViewById(R.id.playerNowPointer_mult4);
//        currentPlayerPointer2 = findViewById(R.id.playerNowPointer_mult5);
//        currentPlayerPointer2.setVisibility(View.INVISIBLE);
//
//
//
//        //      interaction for pause button
//        ImageView pause = findViewById(R.id.multiplayer_pause4);
//        pause.setOnClickListener(view -> pauseGame());
//
//        Intent intent = getIntent();
//        Bundle extras = intent.getExtras();
//        if (extras != null) {
//            if (extras.containsKey("color1")) {
//                String color1 = getIntent().getStringExtra("color1");
//                if (color1.equalsIgnoreCase("red1")) {
//                    colorOne = getResources().getColor(R.color.red);
//                    player1.setColorFilter(ContextCompat.getColor(getApplicationContext(), R.color.red), PorterDuff.Mode.SCREEN);
//                    player1.setTag("red1");
//                    player1name.setTextColor(getResources().getColor(R.color.red));
//                    player1name.setTag("red1");
//                    player1points.setTextColor(getResources().getColor(R.color.red));
//                    player1points.setTag("red1");
//                }
//                if (color1.equalsIgnoreCase("blue1")) {
//                    colorOne = getResources().getColor(R.color.blue);
//                    player1.setColorFilter(ContextCompat.getColor(getApplicationContext(), R.color.blue), PorterDuff.Mode.SCREEN);
//                    player1.setTag("blue1");
//                    player1name.setTextColor(getResources().getColor(R.color.blue));
//                    player1name.setTag("blue1");
//                    player1points.setTextColor(getResources().getColor(R.color.blue));
//                    player1points.setTag("blue1");
//                }
//                if (color1.equalsIgnoreCase("orange1")) {
//                    colorOne = getResources().getColor(R.color.orange);
//                    player1.setColorFilter(ContextCompat.getColor(getApplicationContext(), R.color.orange), PorterDuff.Mode.SCREEN);
//                    player1.setTag("orange1");
//                    player1name.setTextColor(getResources().getColor(R.color.orange));
//                    player1name.setTag("orange1");
//                    player1points.setTextColor(getResources().getColor(R.color.orange));
//                    player1points.setTag("orange1");
//                }
//                if (color1.equalsIgnoreCase("purple1")) {
//                    colorOne = getResources().getColor(R.color.purple);
//                    player1.setColorFilter(ContextCompat.getColor(getApplicationContext(), R.color.purple), PorterDuff.Mode.SCREEN);
//                    player1.setTag("purple1");
//                    player1name.setTextColor(getResources().getColor(R.color.purple));
//                    player1name.setTag("purple1");
//                    player1points.setTextColor(getResources().getColor(R.color.purple));
//                    player1points.setTag("purple1");
//                }
//                if (color1.equalsIgnoreCase("yellow1")) {
//                    colorOne = getResources().getColor(R.color.yellow);
//                    player1.setColorFilter(ContextCompat.getColor(getApplicationContext(), R.color.yellow), PorterDuff.Mode.SCREEN);
//                    player1.setTag("yellow1");
//                    player1name.setTextColor(getResources().getColor(R.color.yellow));
//                    player1name.setTag("yellow1");
//                    player1points.setTextColor(getResources().getColor(R.color.yellow));
//                    player1points.setTag("yellow1");
//                }
//                if (color1.equalsIgnoreCase("pink1")) {
//                    colorOne = getResources().getColor(R.color.pink);
//                    player1.setColorFilter(ContextCompat.getColor(getApplicationContext(), R.color.pink), PorterDuff.Mode.SCREEN);
//                    player1.setTag("pink1");
//                    player1name.setTextColor(getResources().getColor(R.color.pink));
//                    player1name.setTag("pink1");
//                    player1points.setTextColor(getResources().getColor(R.color.pink));
//                    player1points.setTag("pink1");
//                }
//                if (color1.equalsIgnoreCase("green1")) {
//                    colorOne = getResources().getColor(R.color.green);
//                    player1.setColorFilter(ContextCompat.getColor(getApplicationContext(), R.color.green), PorterDuff.Mode.SCREEN);
//                    player1.setTag("green1");
//                    player1name.setTextColor(getResources().getColor(R.color.green));
//                    player1name.setTag("green1");
//                    player1points.setTextColor(getResources().getColor(R.color.green));
//                    player1points.setTag("green1");
//                }
//                if (color1.equalsIgnoreCase("grey1")) {
//                    colorOne = getResources().getColor(R.color.grey);
//                    player1.setColorFilter(ContextCompat.getColor(getApplicationContext(), R.color.grey), PorterDuff.Mode.SCREEN);
//                    player1.setTag("grey1");
//                    player1name.setTextColor(getResources().getColor(R.color.grey));
//                    player1name.setTag("grey1");
//                    player1points.setTextColor(getResources().getColor(R.color.grey));
//                    player1points.setTag("grey1");
//                }
//            }
//            if (extras.containsKey("icon1")) {
//                String icon1 = getIntent().getStringExtra("icon1");
//                if(icon1.equalsIgnoreCase("tree")) {
//                    Icon1.setImageResource(R.drawable.tree);
//                    Icon1.setTag("tree");
//                } else if(icon1.equalsIgnoreCase("egg")) {
//                    Icon1.setImageResource(R.drawable.egg);
//                    Icon1.setTag("egg");
//                } else if(icon1.equalsIgnoreCase("umbrella")) {
//                    Icon1.setImageResource(R.drawable.umbrella);
//                    Icon1.setTag("umbrella");
//                } else if(icon1.equalsIgnoreCase("fries")) {
//                    Icon1.setImageResource(R.drawable.fries);
//                    Icon1.setTag("fries");
//                } else if(icon1.equalsIgnoreCase("wave")) {
//                    Icon1.setImageResource(R.drawable.wave);
//                    Icon1.setTag("wave");
//                } else if(icon1.equalsIgnoreCase("peach")) {
//                    Icon1.setImageResource(R.drawable.peach);
//                    Icon1.setTag("peach");
//                } else if(icon1.equalsIgnoreCase("planet")) {
//                    Icon1.setImageResource(R.drawable.planet);
//                    Icon1.setTag("planet");
//                } else if(icon1.equalsIgnoreCase("rain")) {
//                    Icon1.setImageResource(R.drawable.rain);
//                    Icon1.setTag("rain");
//                } else if(icon1.equalsIgnoreCase("cat")) {
//                    Icon1.setImageResource(R.drawable.cat);
//                    Icon1.setTag("cat");
//                } else if(icon1.equalsIgnoreCase("flower")) {
//                    Icon1.setImageResource(R.drawable.flower);
//                    Icon1.setTag("flower");
//                } else if(icon1.equalsIgnoreCase("goggles")) {
//                    Icon1.setImageResource(R.drawable.goggles);
//                    Icon1.setTag("goggles");
//                } else if(icon1.equalsIgnoreCase("paint")) {
//                    Icon1.setImageResource(R.drawable.paint);
//                    Icon1.setTag("paint");
//                } else if(icon1.equalsIgnoreCase("lightning")) {
//                    Icon1.setImageResource(R.drawable.lightning);
//                    Icon1.setTag("lightning");
//                } else if(icon1.equalsIgnoreCase("smile")) {
//                    Icon1.setImageResource(R.drawable.smile);
//                    Icon1.setTag("smile");
//                } else if(icon1.equalsIgnoreCase("fish")) {
//                    Icon1.setImageResource(R.drawable.fish);
//                    Icon1.setTag("fish");
//                }
//            }
//        }
//        Icon2.setImageResource(R.drawable.fish);
//        Icon2.setTag("fish");
//        currentPlayerPointer1.setColorFilter(colorOne);
//        currentPlayerPointer2.setColorFilter(colorTwo);
//
//        players = new Player[]{new HumanPlayer("Player 1"), new HumanPlayer("Player 2")};
//        if (!String.valueOf(player1.getTag()).isEmpty()) {
//            players[0].setTag(String.valueOf(player1.getTag()));
//        }
////        if (!String.valueOf(player2.getTag()).isEmpty()) {
////            players[1].setTag(String.valueOf(player2.getTag()));
////        }
//        players[1].setTag("blue2");
//        startGame(players);
//    }
//
//    private void startGame(Player[] players) {
//        gameView.startGame(players);
//        updateState();
//    }
//
//    public void updateState() {
//        runOnUiThread(() -> {
//            if (currentPlayer == players[0]) {
//                currentPlayerPointer2.setVisibility(View.INVISIBLE);
//                currentPlayerPointer1.setVisibility(View.VISIBLE);
////                currentPlayerPointer1.setImageResource(R.drawable.a1);
////                currentPlayerPointer1.setColorFilter(colorOne);
//            } else if (currentPlayer == players[1]) {
//                currentPlayerPointer1.setVisibility(View.INVISIBLE);
//                currentPlayerPointer2.setVisibility(View.VISIBLE);
////                currentPlayerPointer1.setImageResource(R.drawable.a2);
////                currentPlayerPointer1.setColorFilter(colorTwo);
//            }
//            player1points.setText("Boxes: " + playersPoints[0]);
//            player2points.setText("Boxes: " + playersPoints[1]);
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
//        Intent i = new Intent(GameActivityOppositeVertical.this, winner_page.class);
//        startActivity(i);
//    }
//
//    public void pauseGame() {
////        alert for pause menu
//        View view = getLayoutInflater().inflate(R.layout.activity_vertical_pause_menu, null);
//        AlertDialog.Builder builder = new AlertDialog.Builder(this);
//        builder.setView(view);
//        AlertDialog alert = builder.create();
//        alert.getWindow().setBackgroundDrawableResource(R.color.transparent);
//        alert.setCanceledOnTouchOutside(false);
//
//
////        alert for exit options
//        View exitView = getLayoutInflater().inflate(R.layout.activity_vertical_exit_confirmation, null);
//        AlertDialog.Builder exitBuilder = new AlertDialog.Builder(this);
//        exitBuilder.setView(exitView);
//        AlertDialog exitAlert = exitBuilder.create();
//        exitAlert.getWindow().setBackgroundDrawableResource(R.color.transparent);
//        exitAlert.setCanceledOnTouchOutside(false);
//
//        Button yes = exitView.findViewById(R.id.vertical_exit_yes);
//        yes.setOnClickListener(view16 -> {
//            exitAlert.dismiss();
//            Intent i = new Intent(GameActivityOppositeVertical.this, HomeActivity.class);
//            i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
//            startActivity(i);
//        });
//
//        Button no = exitView.findViewById(R.id.vertical_exit_no);
//        no.setOnClickListener(view15 -> {
//            exitAlert.dismiss();
//            alert.show();
//        });
//
//
//        //      interaction for resuming
//        Button resume = view.findViewById(R.id.vertical_resume);
//        resume.setOnClickListener(view14 -> alert.dismiss());
//
//
//        //      interaction for exiting the game
//        Button exit = view.findViewById(R.id.vertical_exit);
//        exit.setOnClickListener(view13 -> {
//            alert.dismiss();
//            exitAlert.show();
//
//        });
//
//        //      interaction for how to play
//        Button howto = view.findViewById(R.id.vertical_howto);
//        howto.setOnClickListener(view12 -> {
//            Intent i = new Intent(GameActivityOppositeVertical.this, tutorial_page.class);
//            startActivity(i);
//        });
//
//        //      interaction for restarting the game
//        Button restart = view.findViewById(R.id.vertical_restart);
//        restart.setOnClickListener(view1 -> {
//            alert.dismiss();
//            Intent i = new Intent(GameActivityOppositeVertical.this, MultiplayerGameOppositeVertical.class);
//            i.putExtra("icon1", getIntent().getStringExtra("icon1"));
//            i.putExtra("color1", getIntent().getStringExtra("color1"));
//            i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
//            startActivity(i);
//        });
//
//        alert.show();
//    }
//}
