package com.example.dot_dac_doe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;


import com.google.android.material.textfield.TextInputLayout;

public class Settings extends AppCompatActivity implements View.OnClickListener {

    @Override
    public void onClick(View view) {
    }

    TextInputLayout textInputLayout;
    AutoCompleteTextView autoCompleteTextView;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        textInputLayout = findViewById(R.id.menu_drop);
        autoCompleteTextView = findViewById(R.id.drop_items);
        textView = findViewById(R.id.itemSelected);

        String [] items = {"4x4", "5x5", "6x6"};
        ArrayAdapter<String> itemAdapter = new ArrayAdapter<>(Settings.this, R.layout.item_list, items);
        autoCompleteTextView.setAdapter(itemAdapter);
        autoCompleteTextView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                textView.setText((String)parent.getItemAtPosition(position));
            }
        });

        Switch music = findViewById(R.id.music_toggle);
        music.setChecked(true);
        music.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (!isChecked) {
                    Intent i = new Intent(Settings.this, BackgroundSoundService.class);
                    stopService(i);
                } else {
                    Intent i = new Intent(Settings.this, BackgroundSoundService.class);
                    startService(i);
                }
            }
        });


    }

//    public void playBackgroundMusic(View view) {
//        Intent i = new Intent(Settings.this, BackgroundSoundService.class);
//        startService(i);
//    }

}

