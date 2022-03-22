package com.example.dot_dac_doe;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;

public class GameView extends View {
    float x;
    float y;
    int r = 5;
    Paint mPaint = new Paint(Paint.ANTI_ALIAS_FLAG);


    public GameView(Context context) {
        super(context);
        mPaint.setColor(0xFFFF0000);
        this.x = 30;
        this.y = 30;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        canvas.drawCircle(x, y, r, mPaint);
    }
}
