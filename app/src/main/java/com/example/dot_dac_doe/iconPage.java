package com.example.dot_dac_doe;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;


public class iconPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_icon_page);
        String whichPlayer = getIntent().getStringExtra("player");
        if(whichPlayer.equalsIgnoreCase("player1")){

            ImageView TreeClick = findViewById(R.id.tree);
            ImageView Icon1 = findViewById(R.id.Icon1);
            TreeClick.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Icon1.setImageResource(R.drawable.tree);
                    Icon1.setTag(TreeClick.getTag());
                }
            });

            ImageView EggClick = findViewById(R.id.egg);
            EggClick.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Icon1.setImageResource(R.drawable.egg);
                    Icon1.setTag(EggClick.getTag());
                }
            });

            ImageView UmbrellaClick = findViewById(R.id.umbrella);
            UmbrellaClick.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Icon1.setImageResource(R.drawable.umbrella);
                    Icon1.setTag(UmbrellaClick.getTag());
                }
            });

            ImageView FriesClick = findViewById(R.id.fries);
            FriesClick.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Icon1.setImageResource(R.drawable.fries);
                    Icon1.setTag(FriesClick.getTag());
                }
            });

            ImageView WaveClick = findViewById(R.id.wave);
            WaveClick.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Icon1.setImageResource(R.drawable.wave);
                    Icon1.setTag(WaveClick.getTag());
                }
            });

            ImageView PeachClick = findViewById(R.id.peach);
            PeachClick.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Icon1.setImageResource(R.drawable.peach);
                    Icon1.setTag(PeachClick.getTag());
                }
            });

            ImageView PlanetClick = findViewById(R.id.planet);
            PlanetClick.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Icon1.setImageResource(R.drawable.planet);
                    Icon1.setTag(PlanetClick.getTag());
                }
            });

            ImageView RainClick = findViewById(R.id.rain);
            RainClick.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Icon1.setImageResource(R.drawable.rain);
                    Icon1.setTag(RainClick.getTag());
                }
            });

            ImageView CatClick = findViewById(R.id.cat);
            CatClick.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Icon1.setImageResource(R.drawable.cat);
                    Icon1.setTag(CatClick.getTag());
                }
            });

            ImageView FlowerClick = findViewById(R.id.flower);
            FlowerClick.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Icon1.setImageResource(R.drawable.flower);
                    Icon1.setTag(FlowerClick.getTag());
                }
            });

            ImageView GogglesClick = findViewById(R.id.goggles);
            GogglesClick.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Icon1.setImageResource(R.drawable.goggles);
                    Icon1.setTag(GogglesClick.getTag());
                }
            });

            ImageView PaintClick = findViewById(R.id.paint);
            PaintClick.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Icon1.setImageResource(R.drawable.paint);
                    Icon1.setTag(PaintClick.getTag());
                }
            });

            ImageView LightningClick = findViewById(R.id.lightning);
            LightningClick.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Icon1.setImageResource(R.drawable.lightning);
                    Icon1.setTag(LightningClick.getTag());
                }
            });

            ImageView SmileClick = findViewById(R.id.smile);
            SmileClick.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Icon1.setImageResource(R.drawable.smile);
                    Icon1.setTag(SmileClick.getTag());
                }
            });

            ImageView FishClick = findViewById(R.id.fish);
            FishClick.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Icon1.setImageResource(R.drawable.fish);
                    Icon1.setTag(FishClick.getTag());
                }
            });

            Button Selected = findViewById(R.id.Selected);
            Selected.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String icon = String.valueOf(Icon1.getTag());
                    Intent i = new Intent(iconPage.this, UserSelectActivity.class);
                    i.putExtra("icon1", icon);
                    startActivity(i);
                }
            });
        }
        if(whichPlayer.equalsIgnoreCase("player2")){
            ImageView TreeClick = findViewById(R.id.tree);
            ImageView Icon2 = findViewById(R.id.Icon2);
            TreeClick.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Icon2.setImageResource(R.drawable.tree);
                    Icon2.setTag(TreeClick.getTag());
                }
            });

            ImageView EggClick = findViewById(R.id.egg);
            EggClick.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Icon2.setImageResource(R.drawable.egg);
                    Icon2.setTag(EggClick.getTag());
                }
            });

            ImageView UmbrellaClick = findViewById(R.id.umbrella);
            UmbrellaClick.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Icon2.setImageResource(R.drawable.umbrella);
                    Icon2.setTag(UmbrellaClick.getTag());
                }
            });

            ImageView FriesClick = findViewById(R.id.fries);
            FriesClick.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Icon2.setImageResource(R.drawable.fries);
                    Icon2.setTag(FriesClick.getTag());
                }
            });

            ImageView WaveClick = findViewById(R.id.wave);
            WaveClick.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Icon2.setImageResource(R.drawable.wave);
                    Icon2.setTag(WaveClick.getTag());
                }
            });

            ImageView PeachClick = findViewById(R.id.peach);
            PeachClick.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Icon2.setImageResource(R.drawable.peach);
                    Icon2.setTag(PeachClick.getTag());
                }
            });

            ImageView PlanetClick = findViewById(R.id.planet);
            PlanetClick.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Icon2.setImageResource(R.drawable.planet);
                    Icon2.setTag(PlanetClick.getTag());
                }
            });

            ImageView RainClick = findViewById(R.id.rain);
            RainClick.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Icon2.setImageResource(R.drawable.rain);
                    Icon2.setTag(RainClick.getTag());
                }
            });

            ImageView CatClick = findViewById(R.id.cat);
            CatClick.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Icon2.setImageResource(R.drawable.cat);
                    Icon2.setTag(CatClick.getTag());
                }
            });

            ImageView FlowerClick = findViewById(R.id.flower);
            FlowerClick.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Icon2.setImageResource(R.drawable.flower);
                    Icon2.setTag(FlowerClick.getTag());
                }
            });

            ImageView GogglesClick = findViewById(R.id.goggles);
            GogglesClick.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Icon2.setImageResource(R.drawable.goggles);
                    Icon2.setTag(GogglesClick.getTag());
                }
            });

            ImageView PaintClick = findViewById(R.id.paint);
            PaintClick.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Icon2.setImageResource(R.drawable.paint);
                    Icon2.setTag(PaintClick.getTag());
                }
            });

            ImageView LightningClick = findViewById(R.id.lightning);
            LightningClick.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Icon2.setImageResource(R.drawable.lightning);
                    Icon2.setTag(LightningClick.getTag());
                }
            });

            ImageView SmileClick = findViewById(R.id.smile);
            SmileClick.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Icon2.setImageResource(R.drawable.smile);
                    Icon2.setTag(SmileClick.getTag());
                }
            });

            ImageView FishClick = findViewById(R.id.fish);
            FishClick.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Icon2.setImageResource(R.drawable.fish);
                    Icon2.setTag(FishClick.getTag());
                }
            });

            Button Selected = findViewById(R.id.Selected);
            Selected.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String icon = String.valueOf(Icon2.getTag());
                    Intent i = new Intent(iconPage.this, UserSelectActivity.class);
                    i.putExtra("icon2", icon);
                    startActivity(i);
                }
            });
        }

    }


}