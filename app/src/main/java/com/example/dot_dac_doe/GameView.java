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
    //circle and text colors
    private int circleCol, labelCol;
    //label text
    private String circleText;
    //paint for drawing custom view
    private Paint paint;

    public GameView(Context context, AttributeSet attrs) {
        super(context, attrs);


        paint = new Paint();
        paint.setColor(Color.BLUE);
        paint.setAntiAlias(true);
        paint.setStrokeWidth(5);
        paint.setStyle(Paint.Style.STROKE);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        canvas.drawCircle(100, 100, 100, paint);
    }
}



//import android.content.Context;
//import android.graphics.Canvas;
//import android.graphics.Color;
//import android.graphics.Paint;
//import android.view.View;
//
//public class GameView extends View {
//    float x;
//    float y;
//    int r = 5;
//    Paint mPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
//
//
//    public GameView(Context context) {
//        super(context);
//        mPaint.setColor(0xFFFF0000);
//        this.x = 30;
//        this.y = 30;
//    }
//
//    @Override
//    protected void onDraw(Canvas canvas) {
//        super.onDraw(canvas);
//
//        canvas.drawCircle(x, y, r, mPaint);
//    }
//}

//public static class GameGrid extends View {
//
//    Paint black = new Paint();
//
//    public GameGrid(Context context) {
//        super(context);
//
//        black.setColor(Color.BLACK);
//        black.setStrokeWidth(8);
//    }
//
//    @Override
//    public void onDraw(Canvas canvas) {
//
//        float startX;
//        float stopX;
//        float startY;
//        float stopY;
//
//        int width = getWidth();
//        int height = getHeight();
//
//        int gridSize = 7;
//        int gridSpacing = Math.min(width, height) / gridSize;
//        int boardSize = gridSize * gridSpacing;
//
//        int xOffset = (width - boardSize)/2;
//        int yOffset = (height - boardSize)/2;
//
//        //Vertical Grid-lines
//        for (int i = 0; i < gridSize; i++) {
//
//            startX = xOffset + i*gridSpacing;
//            startY = yOffset;
//
//            stopX = startX;
//            stopY = startY + boardSize;
//
//            canvas.drawLine(startX, startY, stopX, stopY, black);
//
//        }
//
//        //Horizontal Grid-lines
//        for (int i = 0; i < gridSize; i++) {
//
//            startX = xOffset;
//            startY = yOffset + i*gridSpacing;
//
//            stopX = startX + boardSize;
//            stopY = startY;
//
//            canvas.drawLine(startX, startY, stopX, stopY, black);
//        }
//    }
//}
