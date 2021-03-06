package com.example.dot_dac_doe;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.app.ActivityOptions;
import android.content.Intent;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.transition.Explode;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


public class iconPage extends AppCompatActivity {

    String status;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().requestFeature(Window.FEATURE_ACTIVITY_TRANSITIONS);
        getWindow().setEnterTransition(new Explode());
        getWindow().setExitTransition(new Explode());
        setContentView(R.layout.activity_icon_page);
        ImageView Icon1 = findViewById(R.id.Icon1);
        ImageView Icon2 = findViewById(R.id.Icon2);
        ImageView Circle1 = findViewById(R.id.Circle1);
        ImageView Circle2 = findViewById(R.id.Circle2);

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        String whichPlayer = intent.getStringExtra("player");
        if (extras != null) {
            if(extras.containsKey("status")){
                status = getIntent().getStringExtra("status");
            }
            if (extras.containsKey("player1color")) {
                String color1 = getIntent().getStringExtra("player1color");
                if (color1.equalsIgnoreCase("red1")) {
                    Circle1.setColorFilter(ContextCompat.getColor(getApplicationContext(), R.color.red), PorterDuff.Mode.SCREEN);
                    Circle1.setTag("red1");
                }
                if (color1.equalsIgnoreCase("blue1")) {
                    Circle1.setColorFilter(ContextCompat.getColor(getApplicationContext(), R.color.blue), PorterDuff.Mode.SCREEN);
                    Circle1.setTag("blue1");
                }
                if (color1.equalsIgnoreCase("orange1")) {
                    Circle1.setColorFilter(ContextCompat.getColor(getApplicationContext(), R.color.orange), PorterDuff.Mode.SCREEN);
                    Circle1.setTag("orange1");
                }
                if (color1.equalsIgnoreCase("purple1")) {
                    Circle1.setColorFilter(ContextCompat.getColor(getApplicationContext(), R.color.purple), PorterDuff.Mode.SCREEN);
                    Circle1.setTag("purple1");
                }
                if (color1.equalsIgnoreCase("yellow1")) {
                    Circle1.setColorFilter(ContextCompat.getColor(getApplicationContext(), R.color.yellow), PorterDuff.Mode.SCREEN);
                    Circle1.setTag("yellow1");
                }
                if (color1.equalsIgnoreCase("pink1")) {
                    Circle1.setColorFilter(ContextCompat.getColor(getApplicationContext(), R.color.pink), PorterDuff.Mode.SCREEN);
                    Circle1.setTag("pink1");
                }
                if (color1.equalsIgnoreCase("green1")) {
                    Circle1.setColorFilter(ContextCompat.getColor(getApplicationContext(), R.color.green), PorterDuff.Mode.SCREEN);
                    Circle1.setTag("green1");
                }
                if (color1.equalsIgnoreCase("grey1")) {
                    Circle1.setColorFilter(ContextCompat.getColor(getApplicationContext(), R.color.grey), PorterDuff.Mode.SCREEN);
                    Circle1.setTag("grey1");
                }
            }
            if (extras.containsKey("player2color")) {
                String color2 = getIntent().getStringExtra("player2color");
                if (color2.equalsIgnoreCase("red2")) {
                    Circle2.setColorFilter(ContextCompat.getColor(getApplicationContext(), R.color.red), PorterDuff.Mode.SCREEN);
                    Circle2.setTag("red2");
                }
                if (color2.equalsIgnoreCase("blue2")) {
                    Circle2.setColorFilter(ContextCompat.getColor(getApplicationContext(), R.color.blue), PorterDuff.Mode.SCREEN);
                    Circle2.setTag("blue2");
                }
                if (color2.equalsIgnoreCase("orange2")) {
                    Circle2.setColorFilter(ContextCompat.getColor(getApplicationContext(), R.color.orange), PorterDuff.Mode.SCREEN);
                    Circle2.setTag("orange2");
                }
                if (color2.equalsIgnoreCase("purple2")) {
                    Circle2.setColorFilter(ContextCompat.getColor(getApplicationContext(), R.color.purple), PorterDuff.Mode.SCREEN);
                    Circle2.setTag("purple2");
                }
                if (color2.equalsIgnoreCase("yellow2")) {
                    Circle2.setColorFilter(ContextCompat.getColor(getApplicationContext(), R.color.yellow), PorterDuff.Mode.SCREEN);
                    Circle2.setTag("yellow2");
                }
                if (color2.equalsIgnoreCase("pink2")) {
                    Circle2.setColorFilter(ContextCompat.getColor(getApplicationContext(), R.color.pink), PorterDuff.Mode.SCREEN);
                    Circle2.setTag("pink2");
                }
                if (color2.equalsIgnoreCase("green2")) {
                    Circle2.setColorFilter(ContextCompat.getColor(getApplicationContext(), R.color.green), PorterDuff.Mode.SCREEN);
                    Circle2.setTag("green2");
                }
                if (color2.equalsIgnoreCase("grey2")) {
                    Circle2.setColorFilter(ContextCompat.getColor(getApplicationContext(), R.color.grey), PorterDuff.Mode.SCREEN);
                    Circle2.setTag("grey2");
                }
            }
            if (extras.containsKey("icon1")) {
                String icon1 = getIntent().getStringExtra("icon1");
                if (icon1.equalsIgnoreCase("tree")) {
                    Icon1.setImageResource(R.drawable.tree);
                    Icon1.setTag("tree");
                } else if (icon1.equalsIgnoreCase("egg")) {
                    Icon1.setImageResource(R.drawable.egg);
                    Icon1.setTag("egg");
                } else if (icon1.equalsIgnoreCase("umbrella")) {
                    Icon1.setImageResource(R.drawable.umbrella);
                    Icon1.setTag("umbrella");
                } else if (icon1.equalsIgnoreCase("fries")) {
                    Icon1.setImageResource(R.drawable.fries);
                    Icon1.setTag("fries");
                } else if (icon1.equalsIgnoreCase("wave")) {
                    Icon1.setImageResource(R.drawable.wave);
                    Icon1.setTag("wave");
                } else if (icon1.equalsIgnoreCase("peach")) {
                    Icon1.setImageResource(R.drawable.peach);
                    Icon1.setTag("peach");
                } else if (icon1.equalsIgnoreCase("planet")) {
                    Icon1.setImageResource(R.drawable.planet);
                    Icon1.setTag("planet");
                } else if (icon1.equalsIgnoreCase("rain")) {
                    Icon1.setImageResource(R.drawable.rain);
                    Icon1.setTag("rain");
                } else if (icon1.equalsIgnoreCase("cat")) {
                    Icon1.setImageResource(R.drawable.cat);
                    Icon1.setTag("cat");
                } else if (icon1.equalsIgnoreCase("flower")) {
                    Icon1.setImageResource(R.drawable.flower);
                    Icon1.setTag("flower");
                } else if (icon1.equalsIgnoreCase("goggles")) {
                    Icon1.setImageResource(R.drawable.goggles);
                    Icon1.setTag("goggles");
                } else if (icon1.equalsIgnoreCase("paint")) {
                    Icon1.setImageResource(R.drawable.paint);
                    Icon1.setTag("paint");
                } else if (icon1.equalsIgnoreCase("lightning")) {
                    Icon1.setImageResource(R.drawable.lightning);
                    Icon1.setTag("lightning");
                } else if (icon1.equalsIgnoreCase("smile")) {
                    Icon1.setImageResource(R.drawable.smile);
                    Icon1.setTag("smile");
                } else if (icon1.equalsIgnoreCase("fish")) {
                    Icon1.setImageResource(R.drawable.fish);
                    Icon1.setTag("fish");
                }
            }
            if (extras.containsKey("icon2")) {
                String icon2 = getIntent().getStringExtra("icon2");
                if (icon2.equalsIgnoreCase("tree")) {
                    Icon2.setImageResource(R.drawable.tree);
                    Icon2.setTag("tree");
                } else if (icon2.equalsIgnoreCase("egg")) {
                    Icon2.setImageResource(R.drawable.egg);
                    Icon2.setTag("egg");
                } else if (icon2.equalsIgnoreCase("umbrella")) {
                    Icon2.setImageResource(R.drawable.umbrella);
                    Icon2.setTag("umbrella");
                } else if (icon2.equalsIgnoreCase("fries")) {
                    Icon2.setImageResource(R.drawable.fries);
                    Icon2.setTag("fries");
                } else if (icon2.equalsIgnoreCase("wave")) {
                    Icon2.setImageResource(R.drawable.wave);
                    Icon2.setTag("wave");
                } else if (icon2.equalsIgnoreCase("peach")) {
                    Icon2.setImageResource(R.drawable.peach);
                    Icon2.setTag("peach");
                } else if (icon2.equalsIgnoreCase("planet")) {
                    Icon2.setImageResource(R.drawable.planet);
                    Icon2.setTag("planet");
                } else if (icon2.equalsIgnoreCase("rain")) {
                    Icon2.setImageResource(R.drawable.rain);
                    Icon2.setTag("rain");
                } else if (icon2.equalsIgnoreCase("cat")) {
                    Icon2.setImageResource(R.drawable.cat);
                    Icon2.setTag("cat");
                } else if (icon2.equalsIgnoreCase("flower")) {
                    Icon2.setImageResource(R.drawable.flower);
                    Icon2.setTag("flower");
                } else if (icon2.equalsIgnoreCase("goggles")) {
                    Icon2.setImageResource(R.drawable.goggles);
                    Icon2.setTag("goggles");
                } else if (icon2.equalsIgnoreCase("paint")) {
                    Icon2.setImageResource(R.drawable.paint);
                    Icon2.setTag("paint");
                } else if (icon2.equalsIgnoreCase("lightning")) {
                    Icon2.setImageResource(R.drawable.lightning);
                    Icon2.setTag("lightning");
                } else if (icon2.equalsIgnoreCase("smile")) {
                    Icon2.setImageResource(R.drawable.smile);
                    Icon2.setTag("smile");
                } else if (icon2.equalsIgnoreCase("fish")) {
                    Icon2.setImageResource(R.drawable.fish);
                    Icon2.setTag("fish");
                }
            }
        }
//        String tag1 = getIntent().getStringExtra()
        if(whichPlayer.equalsIgnoreCase("player1")){
            Circle2.setVisibility(View.INVISIBLE);
            TextView player2_name = findViewById(R.id.Player2);
            player2_name.setVisibility(View.INVISIBLE);
            Icon2.setVisibility(View.INVISIBLE);

            ImageView TreeClick = findViewById(R.id.tree);
            TreeClick.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (String.valueOf(Icon2.getTag()).isEmpty() || !String.valueOf(Icon2.getTag()).equals("tree")) {
                        Icon1.setImageResource(R.drawable.tree);
                        Icon1.setTag(TreeClick.getTag());
                    }
                }
            });

            ImageView EggClick = findViewById(R.id.egg);
            EggClick.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (String.valueOf(Icon2.getTag()).isEmpty() || !String.valueOf(Icon2.getTag()).equals("egg")) {
                        Icon1.setImageResource(R.drawable.egg);
                        Icon1.setTag(EggClick.getTag());
                    }
                }
            });

            ImageView UmbrellaClick = findViewById(R.id.umbrella);
            UmbrellaClick.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (String.valueOf(Icon2.getTag()).isEmpty() || !String.valueOf(Icon2.getTag()).equals("umbrella" +
                            "")) {
                        Icon1.setImageResource(R.drawable.umbrella);
                        Icon1.setTag(UmbrellaClick.getTag());
                    }
                }
            });

            ImageView FriesClick = findViewById(R.id.fries);
            FriesClick.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (String.valueOf(Icon2.getTag()).isEmpty() || !String.valueOf(Icon2.getTag()).equals("fries")) {
                        Icon1.setImageResource(R.drawable.fries);
                        Icon1.setTag(FriesClick.getTag());
                    }
                }
            });

            ImageView WaveClick = findViewById(R.id.wave);
            WaveClick.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (String.valueOf(Icon2.getTag()).isEmpty() || !String.valueOf(Icon2.getTag()).equals("wave")) {
                        Icon1.setImageResource(R.drawable.wave);
                        Icon1.setTag(WaveClick.getTag());
                    }
                }
            });

            ImageView PeachClick = findViewById(R.id.peach);
            PeachClick.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (String.valueOf(Icon2.getTag()).isEmpty() || !String.valueOf(Icon2.getTag()).equals("peach")) {
                        Icon1.setImageResource(R.drawable.peach);
                        Icon1.setTag(PeachClick.getTag());
                    }
                }
            });

            ImageView PlanetClick = findViewById(R.id.planet);
            PlanetClick.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (String.valueOf(Icon2.getTag()).isEmpty() || !String.valueOf(Icon2.getTag()).equals("planet")) {
                        Icon1.setImageResource(R.drawable.planet);
                        Icon1.setTag(PlanetClick.getTag());
                    }
                }
            });

            ImageView RainClick = findViewById(R.id.rain);
            RainClick.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (String.valueOf(Icon2.getTag()).isEmpty() || !String.valueOf(Icon2.getTag()).equals("rain")) {
                        Icon1.setImageResource(R.drawable.rain);
                        Icon1.setTag(RainClick.getTag());
                    }
                }
            });

            ImageView CatClick = findViewById(R.id.cat);
            CatClick.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (String.valueOf(Icon2.getTag()).isEmpty() || !String.valueOf(Icon2.getTag()).equals("cat")) {
                        Icon1.setImageResource(R.drawable.cat);
                        Icon1.setTag(CatClick.getTag());
                    }
                }
            });

            ImageView FlowerClick = findViewById(R.id.flower);
            FlowerClick.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (String.valueOf(Icon2.getTag()).isEmpty() || !String.valueOf(Icon2.getTag()).equals("flower")) {
                        Icon1.setImageResource(R.drawable.flower);
                        Icon1.setTag(FlowerClick.getTag());
                    }
                }
            });

            ImageView GogglesClick = findViewById(R.id.goggles);
            GogglesClick.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (String.valueOf(Icon2.getTag()).isEmpty() || !String.valueOf(Icon2.getTag()).equals("goggles")) {
                        Icon1.setImageResource(R.drawable.goggles);
                        Icon1.setTag(GogglesClick.getTag());
                    }
                }
            });

            ImageView PaintClick = findViewById(R.id.paint);
            PaintClick.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (String.valueOf(Icon2.getTag()).isEmpty() || !String.valueOf(Icon2.getTag()).equals("paint")) {
                        Icon1.setImageResource(R.drawable.paint);
                        Icon1.setTag(PaintClick.getTag());
                    }
                }
            });

            ImageView LightningClick = findViewById(R.id.lightning);
            LightningClick.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (String.valueOf(Icon2.getTag()).isEmpty() || !String.valueOf(Icon2.getTag()).equals("lightning")) {
                        Icon1.setImageResource(R.drawable.lightning);
                        Icon1.setTag(LightningClick.getTag());
                    }
                }
            });

            ImageView SmileClick = findViewById(R.id.smile);
            SmileClick.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (String.valueOf(Icon2.getTag()).isEmpty() || !String.valueOf(Icon2.getTag()).equals("smile")) {
                        Icon1.setImageResource(R.drawable.smile);
                        Icon1.setTag(SmileClick.getTag());
                    }
                }
            });

            ImageView FishClick = findViewById(R.id.fish);
            FishClick.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (String.valueOf(Icon2.getTag()).isEmpty() || !String.valueOf(Icon2.getTag()).equals("fish")) {
                        Icon1.setImageResource(R.drawable.fish);
                        Icon1.setTag(FishClick.getTag());
                    }
                }
            });

            Button Selected = findViewById(R.id.Selected);
            Selected.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String icon1 = String.valueOf(Icon1.getTag());
                    Intent i = new Intent(iconPage.this, UserSelectActivity.class);
                    if(!String.valueOf(Icon2.getTag()).isEmpty()) {
                        i.putExtra("icon2", String.valueOf(Icon2.getTag()));
                    }
                    if(!String.valueOf(Circle1.getTag()).isEmpty()) {
                        i.putExtra("color1", String.valueOf(Circle1.getTag()));
                    }
                    if(!String.valueOf(Circle2.getTag()).isEmpty()) {
                        i.putExtra("color2", String.valueOf(Circle2.getTag()));
                    }
                    i.putExtra("status", status);
                    i.putExtra("icon1", icon1);
                    startActivity(i, ActivityOptions.makeSceneTransitionAnimation(iconPage.this).toBundle());
                }
            });
        }
        if(whichPlayer.equalsIgnoreCase("player2")){

            Circle1.setVisibility(View.INVISIBLE);
            TextView player1_name = findViewById(R.id.Player1);
            player1_name.setVisibility(View.INVISIBLE);
            Icon1.setVisibility(View.INVISIBLE);

            ImageView TreeClick = findViewById(R.id.tree);
            TreeClick.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (String.valueOf(Icon1.getTag()).isEmpty() || !String.valueOf(Icon1.getTag()).equals("tree")) {
                        Icon2.setImageResource(R.drawable.tree);
                        Icon2.setTag(TreeClick.getTag());
                    }
                }
            });

            ImageView EggClick = findViewById(R.id.egg);
            EggClick.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (String.valueOf(Icon1.getTag()).isEmpty() || !String.valueOf(Icon1.getTag()).equals("egg")) {
                        Icon2.setImageResource(R.drawable.egg);
                        Icon2.setTag(EggClick.getTag());
                    }
                }
            });

            ImageView UmbrellaClick = findViewById(R.id.umbrella);
            UmbrellaClick.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (String.valueOf(Icon1.getTag()).isEmpty() || !String.valueOf(Icon1.getTag()).equals("umbrella")) {
                        Icon2.setImageResource(R.drawable.umbrella);
                        Icon2.setTag(UmbrellaClick.getTag());
                    }
                }
            });

            ImageView FriesClick = findViewById(R.id.fries);
            FriesClick.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (String.valueOf(Icon1.getTag()).isEmpty() || !String.valueOf(Icon1.getTag()).equals("fries")) {
                        Icon2.setImageResource(R.drawable.fries);
                        Icon2.setTag(FriesClick.getTag());
                    }
                }
            });

            ImageView WaveClick = findViewById(R.id.wave);
            WaveClick.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (String.valueOf(Icon1.getTag()).isEmpty() || !String.valueOf(Icon1.getTag()).equals("wave")) {
                        Icon2.setImageResource(R.drawable.wave);
                        Icon2.setTag(WaveClick.getTag());
                    }
                }
            });

            ImageView PeachClick = findViewById(R.id.peach);
            PeachClick.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (String.valueOf(Icon1.getTag()).isEmpty() || !String.valueOf(Icon1.getTag()).equals("peach")) {
                        Icon2.setImageResource(R.drawable.peach);
                        Icon2.setTag(PeachClick.getTag());
                    }
                }
            });

            ImageView PlanetClick = findViewById(R.id.planet);
            PlanetClick.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (String.valueOf(Icon1.getTag()).isEmpty() || !String.valueOf(Icon1.getTag()).equals("planet")) {
                        Icon2.setImageResource(R.drawable.planet);
                        Icon2.setTag(PlanetClick.getTag());
                    }
                }
            });

            ImageView RainClick = findViewById(R.id.rain);
            RainClick.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (String.valueOf(Icon1.getTag()).isEmpty() || !String.valueOf(Icon1.getTag()).equals("rain")) {
                        Icon2.setImageResource(R.drawable.rain);
                        Icon2.setTag(RainClick.getTag());
                    }
                }
            });

            ImageView CatClick = findViewById(R.id.cat);
            CatClick.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (String.valueOf(Icon1.getTag()).isEmpty() || !String.valueOf(Icon1.getTag()).equals("cat")) {
                        Icon2.setImageResource(R.drawable.cat);
                        Icon2.setTag(CatClick.getTag());
                    }
                }
            });

            ImageView FlowerClick = findViewById(R.id.flower);
            FlowerClick.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (String.valueOf(Icon1.getTag()).isEmpty() || !String.valueOf(Icon1.getTag()).equals("flower")) {
                        Icon2.setImageResource(R.drawable.flower);
                        Icon2.setTag(FlowerClick.getTag());
                    }
                }
            });

            ImageView GogglesClick = findViewById(R.id.goggles);
            GogglesClick.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (String.valueOf(Icon1.getTag()).isEmpty() || !String.valueOf(Icon1.getTag()).equals("goggles")) {
                        Icon2.setImageResource(R.drawable.goggles);
                        Icon2.setTag(GogglesClick.getTag());
                    }
                }
            });

            ImageView PaintClick = findViewById(R.id.paint);
            PaintClick.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (String.valueOf(Icon1.getTag()).isEmpty() || !String.valueOf(Icon1.getTag()).equals("paint")) {
                        Icon2.setImageResource(R.drawable.paint);
                        Icon2.setTag(PaintClick.getTag());
                    }
                }
            });

            ImageView LightningClick = findViewById(R.id.lightning);
            LightningClick.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (String.valueOf(Icon1.getTag()).isEmpty() || !String.valueOf(Icon1.getTag()).equals("lightning")) {
                        Icon2.setImageResource(R.drawable.lightning);
                        Icon2.setTag(LightningClick.getTag());
                    }
                }
            });

            ImageView SmileClick = findViewById(R.id.smile);
            SmileClick.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (String.valueOf(Icon1.getTag()).isEmpty() || !String.valueOf(Icon1.getTag()).equals("smile")) {
                        Icon2.setImageResource(R.drawable.smile);
                        Icon2.setTag(SmileClick.getTag());
                    }
                }
            });

            ImageView FishClick = findViewById(R.id.fish);
            FishClick.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (String.valueOf(Icon1.getTag()).isEmpty() || !String.valueOf(Icon1.getTag()).equals("fish")) {
                        Icon2.setImageResource(R.drawable.fish);
                        Icon2.setTag(FishClick.getTag());
                    }
                }
            });

            Button Selected = findViewById(R.id.Selected);
            Selected.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String icon2 = String.valueOf(Icon2.getTag());
                    Intent i = new Intent(iconPage.this, UserSelectActivity.class);
                    if(!String.valueOf(Icon1.getTag()).isEmpty() ) {
                        i.putExtra("icon1", String.valueOf(Icon1.getTag()));
                    }
                    if(!String.valueOf(Circle1.getTag()).isEmpty()) {
                        i.putExtra("color1", String.valueOf(Circle1.getTag()));
                    }
                    if(!String.valueOf(Circle2.getTag()).isEmpty()) {
                        i.putExtra("color2", String.valueOf(Circle2.getTag()));
                    }
                    i.putExtra("status", status);
                    i.putExtra("icon2", icon2);
                    startActivity(i, ActivityOptions.makeSceneTransitionAnimation(iconPage.this).toBundle());
                }
            });
        }

    }

}