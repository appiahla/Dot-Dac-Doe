package com.example.dot_dac_doe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;

public class GameActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
    }

    public static class GameGrid extends View {

        Paint black = new Paint();

        public GameGrid(Context context) {
            super(context);

            black.setColor(Color.BLACK);
            black.setStrokeWidth(8);
        }

        @Override
        public void onDraw(Canvas canvas) {

            float startX;
            float stopX;
            float startY;
            float stopY;

            int width = getWidth();
            int height = getHeight();

            int gridSize = 7;
            int gridSpacing = Math.min(width, height) / gridSize;
            int boardSize = gridSize * gridSpacing;

            int xOffset = (width - boardSize)/2;
            int yOffset = (height - boardSize)/2;

            //Vertical Grid-lines
            for (int i = 0; i < gridSize; i++) {

                startX = xOffset + i*gridSpacing;
                startY = yOffset;

                stopX = startX;
                stopY = startY + boardSize;

                canvas.drawLine(startX, startY, stopX, stopY, black);

            }

            //Horizontal Grid-lines
            for (int i = 0; i < gridSize; i++) {

                startX = xOffset;
                startY = yOffset + i*gridSpacing;

                stopX = startX + boardSize;
                stopY = startY;

                canvas.drawLine(startX, startY, stopX, stopY, black);
            }
        }
    }
}