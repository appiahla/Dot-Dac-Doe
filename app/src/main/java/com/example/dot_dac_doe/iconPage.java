package com.example.dot_dac_doe;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Bundle;
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
                }
            });

            ImageView EggClick = findViewById(R.id.egg);
            EggClick.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Icon1.setImageResource(R.drawable.egg);
                }
            });

            ImageView UmbrellaClick = findViewById(R.id.umbrella);
            UmbrellaClick.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Icon1.setImageResource(R.drawable.umbrella);
                }
            });

            ImageView FriesClick = findViewById(R.id.fries);
            FriesClick.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Icon1.setImageResource(R.drawable.fries);
                }
            });

            ImageView WaveClick = findViewById(R.id.wave);
            WaveClick.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Icon1.setImageResource(R.drawable.wave);
                }
            });

            ImageView PeachClick = findViewById(R.id.peach);
            PeachClick.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Icon1.setImageResource(R.drawable.peach);
                }
            });

            ImageView PlanetClick = findViewById(R.id.planet);
            PlanetClick.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Icon1.setImageResource(R.drawable.planet);
                }
            });

            ImageView RainClick = findViewById(R.id.rain);
            RainClick.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Icon1.setImageResource(R.drawable.rain);
                }
            });

            ImageView CatClick = findViewById(R.id.cat);
            CatClick.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Icon1.setImageResource(R.drawable.cat);
                }
            });

            ImageView FlowerClick = findViewById(R.id.flower);
            FlowerClick.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Icon1.setImageResource(R.drawable.flower);
                }
            });

            ImageView GogglesClick = findViewById(R.id.goggles);
            GogglesClick.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Icon1.setImageResource(R.drawable.goggles);
                }
            });

            ImageView PaintClick = findViewById(R.id.paint);
            PaintClick.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Icon1.setImageResource(R.drawable.paint);
                }
            });

            ImageView LightningClick = findViewById(R.id.lightning);
            LightningClick.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Icon1.setImageResource(R.drawable.lightning);
                }
            });

            ImageView SmileClick = findViewById(R.id.smile);
            SmileClick.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Icon1.setImageResource(R.drawable.smile);
                }
            });

            ImageView FishClick = findViewById(R.id.fish);
            FishClick.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Icon1.setImageResource(R.drawable.fish);
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
                }
            });

            ImageView EggClick = findViewById(R.id.egg);
            EggClick.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Icon2.setImageResource(R.drawable.egg);
                }
            });

            ImageView UmbrellaClick = findViewById(R.id.umbrella);
            UmbrellaClick.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Icon2.setImageResource(R.drawable.umbrella);
                }
            });

            ImageView FriesClick = findViewById(R.id.fries);
            FriesClick.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Icon2.setImageResource(R.drawable.fries);
                }
            });

            ImageView WaveClick = findViewById(R.id.wave);
            WaveClick.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Icon2.setImageResource(R.drawable.wave);
                }
            });

            ImageView PeachClick = findViewById(R.id.peach);
            PeachClick.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Icon2.setImageResource(R.drawable.peach);
                }
            });

            ImageView PlanetClick = findViewById(R.id.planet);
            PlanetClick.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Icon2.setImageResource(R.drawable.planet);
                }
            });

            ImageView RainClick = findViewById(R.id.rain);
            RainClick.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Icon2.setImageResource(R.drawable.rain);
                }
            });

            ImageView CatClick = findViewById(R.id.cat);
            CatClick.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Icon2.setImageResource(R.drawable.cat);
                }
            });

            ImageView FlowerClick = findViewById(R.id.flower);
            FlowerClick.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Icon2.setImageResource(R.drawable.flower);
                }
            });

            ImageView GogglesClick = findViewById(R.id.goggles);
            GogglesClick.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Icon2.setImageResource(R.drawable.goggles);
                }
            });

            ImageView PaintClick = findViewById(R.id.paint);
            PaintClick.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Icon2.setImageResource(R.drawable.paint);
                }
            });

            ImageView LightningClick = findViewById(R.id.lightning);
            LightningClick.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Icon2.setImageResource(R.drawable.lightning);
                }
            });

            ImageView SmileClick = findViewById(R.id.smile);
            SmileClick.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Icon2.setImageResource(R.drawable.smile);
                }
            });

            ImageView FishClick = findViewById(R.id.fish);
            FishClick.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Icon2.setImageResource(R.drawable.fish);
                }
            });
        }
//        ImageView TreeClick = findViewById(R.id.tree);
//        ImageView Icon1 = findViewById(R.id.Icon1);
//        TreeClick.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Icon1.setImageResource(R.drawable.tree);
//            }
//        });
//
//        ImageView EggClick = findViewById(R.id.egg);
//        EggClick.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Icon1.setImageResource(R.drawable.egg);
//            }
//        });
//
//        ImageView UmbrellaClick = findViewById(R.id.umbrella);
//        UmbrellaClick.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Icon1.setImageResource(R.drawable.umbrella);
//            }
//        });
//
//        ImageView FriesClick = findViewById(R.id.fries);
//        FriesClick.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Icon1.setImageResource(R.drawable.fries);
//            }
//        });
//
//        ImageView WaveClick = findViewById(R.id.wave);
//        WaveClick.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Icon1.setImageResource(R.drawable.wave);
//            }
//        });
//
//        ImageView PeachClick = findViewById(R.id.peach);
//        PeachClick.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Icon1.setImageResource(R.drawable.peach);
//            }
//        });
//
//        ImageView PlanetClick = findViewById(R.id.planet);
//        PlanetClick.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Icon1.setImageResource(R.drawable.planet);
//            }
//        });
//
//        ImageView RainClick = findViewById(R.id.rain);
//        RainClick.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Icon1.setImageResource(R.drawable.rain);
//            }
//        });
//
//        ImageView CatClick = findViewById(R.id.cat);
//        CatClick.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Icon1.setImageResource(R.drawable.cat);
//            }
//        });
//
//        ImageView FlowerClick = findViewById(R.id.flower);
//        FlowerClick.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Icon1.setImageResource(R.drawable.flower);
//            }
//        });
//
//        ImageView GogglesClick = findViewById(R.id.goggles);
//        GogglesClick.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Icon1.setImageResource(R.drawable.goggles);
//            }
//        });
//
//        ImageView PaintClick = findViewById(R.id.paint);
//        PaintClick.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Icon1.setImageResource(R.drawable.paint);
//            }
//        });
//
//        ImageView LightningClick = findViewById(R.id.lightning);
//        LightningClick.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Icon1.setImageResource(R.drawable.lightning);
//            }
//        });
//
//        ImageView SmileClick = findViewById(R.id.smile);
//        SmileClick.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Icon1.setImageResource(R.drawable.smile);
//            }
//        });
//
//        ImageView FishClick = findViewById(R.id.fish);
//        FishClick.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Icon1.setImageResource(R.drawable.fish);
//            }
//        });

    }


}