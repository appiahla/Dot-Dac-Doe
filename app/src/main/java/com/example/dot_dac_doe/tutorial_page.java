package com.example.dot_dac_doe;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityOptions;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.transition.Slide;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;


public class tutorial_page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().requestFeature(Window.FEATURE_ACTIVITY_TRANSITIONS);
        getWindow().setEnterTransition(new Slide());
        getWindow().setExitTransition(new Slide());
        setContentView(R.layout.activity_tutorial_page);

        ImageView arrow = (ImageView) findViewById(R.id.tutorial_next_arrow);
        arrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(tutorial_page.this, tutorial_page_part2.class);
                startActivity(i, ActivityOptions.makeSceneTransitionAnimation(tutorial_page.this).toBundle());
            }
        });
    }
}