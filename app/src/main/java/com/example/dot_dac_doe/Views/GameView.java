package com.example.dot_dac_doe.Views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

import com.example.dot_dac_doe.R;
import com.example.dot_dac_doe.Models.Direction;
import com.example.dot_dac_doe.Models.Graph;
import com.example.dot_dac_doe.Models.HumanPlayer;
import com.example.dot_dac_doe.Models.Line;
import com.example.dot_dac_doe.Models.Player;

import java.util.HashMap;
import java.util.Map;
import java.util.Observable;

import java.util.Observer;

public class GameView extends View implements Observer {
    protected static final float radius = (float) 14 / 824;
    protected static final float start = (float) 6 / 824;
    protected static final float add1 = (float) 18 / 824;
    protected static final float add2 = (float) 2 / 824;
    protected static final float add3 = (float) 14 / 824;
    protected static final float add4 = (float) 141 / 824;
    protected static final float add5 = (float) 159 / 824;
    protected static final float add6 = (float) 9 / 824;

//    protected final int[] playerColors;
    protected int[] playerColors;
    protected Graph game;
    protected Line move;
    protected Paint paint;
    protected PlayersStateView playersState;

    int color1 = getResources().getColor(R.color.blue);
    int color2 = getResources().getColor(R.color.red);

    public GameView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);

        paint = new Paint();

        this.setOnTouchListener(new OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                getInput(event);
                return false;
            }
        });

//        player 1, then player 2 line colors
        playerColors = new int[]{color1,
                color2};
    }

    public void setPlayersState(PlayersStateView playersState) {
        this.playersState = playersState;
    }

    public void startGame(Player[] players) {
        if (!players[0].getTag().isEmpty()) {
            if(players[0].getTag() == "red1") {
                color1 = getResources().getColor(R.color.red);
            }
            else if(players[0].getTag() == "blue1") {
                color1 = getResources().getColor(R.color.blue);
            }
            else if(players[0].getTag() == "orange1") {
                color1 = getResources().getColor(R.color.orange);
            }
            else if(players[0].getTag() == "purple1") {
                color1 = getResources().getColor(R.color.purple);
            }
            else if(players[0].getTag() == "yellow1") {
                color1 = getResources().getColor(R.color.yellow);
            }
            else if(players[0].getTag() == "pink1") {
                color1 = getResources().getColor(R.color.pink);
            }
            else if(players[0].getTag() == "green1") {
                color1 = getResources().getColor(R.color.green);
            }
            else if(players[0].getTag() == "grey1") {
                color1 = getResources().getColor(R.color.grey);
            }
        }
        if (!players[1].getTag().isEmpty()) {
            if(players[1].getTag() == "red2") {
                color2 = getResources().getColor(R.color.red);
            }
            else if(players[1].getTag() == "blue2") {
                color2 = getResources().getColor(R.color.blue);
            }
            else if(players[1].getTag() == "orange2") {
                color2 = getResources().getColor(R.color.orange);
            }
            else if(players[1].getTag() == "purple2") {
                color2 = getResources().getColor(R.color.purple);
            }
            else if(players[1].getTag() == "yellow2") {
                color2 = getResources().getColor(R.color.yellow);
            }
            else if(players[1].getTag() == "pink2") {
                color2 = getResources().getColor(R.color.pink);
            }
            else if(players[1].getTag() == "green2") {
                color2 = getResources().getColor(R.color.green);
            }
            else if(players[1].getTag() == "grey2") {
                color2 = getResources().getColor(R.color.grey);
            }
        }
//        players[0]
        playerColors = new int[]{color1,
                color2};
        game = new Graph(5, 5, players);
        game.addObserver(this);
        new Thread() {
            @Override
            public void run() {
                game.start();
            }
        }.start();
        postInvalidate();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        canvas.drawColor(0x00FFFFFF);
        int min = Math.min(getWidth(), getHeight());
        float radius = GameView.radius * min;
        float start = GameView.start * min;
        float add1 = GameView.add1 * min;
        float add2 = GameView.add2 * min;
        float add4 = GameView.add4 * min;
        float add5 = GameView.add5 * min;
        float add6 = GameView.add6 * min;

        //paint lines
        paint.setColor(0xFF000000);
        for (int i = 0; i < game.getHeight() + 1; i++) {
            for (int j = 0; j < game.getWidth(); j++) {
                Line horizontal = new Line(Direction.HORIZONTAL, i, j);
                if (horizontal.equals(game.getNewestLine())) {
                    Log.d("CHECK", "THIS IS THE PLAYER HORIZONTAL: " + game.currentPlayer().getName());
                    if(game.currentPlayer().getName().equalsIgnoreCase("Player 1"))  { //actually player 2
                        paint.setColor(color2);
                    }
                      else if (game.currentPlayer().getName().equalsIgnoreCase("Player 2")) { //actually player 1
                        paint.setColor(color1);
                    }

                } else if (game.isLineOccupied(horizontal)) {
                    if (game.getLineOccupier(horizontal) == 1)
                        paint.setColor(playerColors[0]);
                    else
                        paint.setColor(playerColors[1]);
                } else {
                    paint.setColor(0xFFFFFFFF);
                }
                float rectSide = start + add5 * i + add1
                        - add2;
                canvas.drawRect(start + add5 * j + add1, start + add5 * i
                        + add2, start + add5 * (j + 1), rectSide, paint);

                Line vertical = new Line(Direction.VERTICAL, j, i);
                if (vertical.equals(game.getNewestLine())) {
                    Log.d("CHECK", "THIS IS THE PLAYER VERTICAL : " + game.currentPlayer().getName());
                    if(game.currentPlayer().getName().equalsIgnoreCase("Player 1"))  {
                        paint.setColor(color2);
                    } else if (game.currentPlayer().getName().equalsIgnoreCase("Player 2")) {
                        paint.setColor(color1);
                    }
//                    paint.setColor(getResources().getColor(playerColors[Player.indexIn(game.getBoxOccupier(j, i), game.getPlayers())]));
                } else if (game.isLineOccupied(vertical)) {
                    if (game.getLineOccupier(vertical) == 1)
                        paint.setColor(playerColors[0]);
                    else
                        paint.setColor(playerColors[1]);
                } else {
                    paint.setColor(0xFFFFFFFF);
                }
                canvas.drawRect(start + add5 * i + add2, start + add5 * j
                        + add1, rectSide, start + add5
                        * (j + 1), paint);
            }
        }

        //paint boxes
        for (int i = 0; i < game.getWidth(); i++) {
            for (int j = 0; j < game.getHeight(); j++) {
                paint.setColor(game.getBoxOccupier(j, i) == null ? Color.TRANSPARENT : playerColors[Player.indexIn(game.getBoxOccupier(j, i), game.getPlayers())]);
                canvas.drawRect(start + add5 * i + add1 + add2, start
                        + add5 * j + add1 + add2, start + add5 * i + add1
                        + add4 - add2, start + add5 * j + add1 + add4
                        - add2, paint);
            }
        }

        //paint points
        paint.setColor(getResources().getColor(R.color.black));
        for (int i = 0; i < game.getHeight() + 1; i++) {
            for (int j = 0; j < game.getWidth() + 1; j++) {
                canvas.drawCircle(start + add6 + j * add5 + 1, start + add6 + i * add5 + 1,
                        radius, paint);
            }
        }

        invalidate();
    }

    private void getInput(MotionEvent event) {
        if (event.getAction() != MotionEvent.ACTION_DOWN)
            return;

        float touchX = event.getX();
        float touchY = event.getY();
        int min = Math.min(getWidth(), getHeight());
        float start = GameView.start * min;
        float add1 = GameView.add1 * min;
        float add2 = GameView.add2 * min;
        float add3 = GameView.add3 * min;
        float add5 = GameView.add5 * min;
        int d = -1, a = -1, b = -1;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 5; j++) {
                float grid1 = start + add5 * j + add1 - add3;
                float grid2 = start + add5 * i + add2 - add3;
                float grid3 = start + add5 * i + add1 - add2 + add3;
                if (grid1 <= touchX
                        && touchX <= (start + add5 * (j + 1) + add3)
                        && touchY >= grid2
                        && touchY <= grid3) {
                    d = 0;
                    a = i;
                    b = j;
                }
                if (grid2 <= touchX
                        && touchX <= grid3
                        && touchY >= grid1
                        && touchY <= start + add5 * (j + 1) + add3) {
                    d = 1;
                    a = j;
                    b = i;
                }
            }
        }

        if (a != -1) {
            Direction direction;
            if (d == 0)
                direction = Direction.HORIZONTAL;
            else
                direction = Direction.VERTICAL;
            move = new Line(direction, a, b);
            try {
                ((HumanPlayer) game.currentPlayer()).add(move);
            } catch (Exception e) {
                Log.e("GameView", e.toString());
            }
        }
    }

    @Override
    public void update(Observable observable, Object data) {
        playersState.setCurrentPlayer(game.currentPlayer());
        Map<Player, Integer> player_occupyingBoxCount_map = new HashMap<>();
        for (Player player : game.getPlayers()) {
            player_occupyingBoxCount_map.put(player, game.getPlayerPoints(player));
        }
        playersState.setPlayerPoints(player_occupyingBoxCount_map);

        Player winner = game.getWinner();
        if (winner != null) {
            playersState.setWinner(winner);
        }
    }
}

