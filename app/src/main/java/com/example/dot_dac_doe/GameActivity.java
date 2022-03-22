package com.example.dot_dac_doe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;

import android.graphics.Color;
import android.view.View;

public class GameActivity extends AppCompatActivity {

    private GameView myView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        myView = (GameView)findViewById(R.id.gameView);
    }

//    public void btnPressed(View view){
////update the View
//        myView.setCircleColor(Color.GREEN);
//        myView.setLabelColor(Color.MAGENTA);
//        myView.setLabelText("Help");
//    }
}