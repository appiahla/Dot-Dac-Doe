package com.example.dot_dac_doe;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.util.AttributeSet;
import android.view.View;

public class GameView extends View {

    Paint black = new Paint();

    public GameView(Context context) {
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

        int width = 1000;
        int height = 1000;

        int gridSize = 10;
        int gridSpacing = width / gridSize;
        int boardSize = gridSize * gridSpacing;

        int xOffset = 50;
        int yOffset = 50;

        //Vertical Grid-lines
        for (int i = 0; i < gridSize; i++) {

            startX = xOffset + i * gridSpacing;
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

// draw clickable line : https://stackoverflow.com/questions/18275032/technique-to-make-a-canvas-drawline-clickable
