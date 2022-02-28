package com.example.dot_dac_doe;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.TextView;

public class Settings extends AppCompatActivity {

    TextInputLayout textInputLayout;
    AutoCompleteTextView autoCompleteTextView;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        textInputLayout = findViewById(R.id.autoCompleteTextView);
        autoCompleteTextView = findViewById(R.id.autoCompleteTextView); //i think wrong i
        textView = findViewById(R.id.autoCompleteTextView);

        String [] items = {"Item1", "Item2", "Item3"};
        ArrayAdapter<String> itemAdapter = new ArrayAdapter<>(AutoCompleteTextView.this, R.layout.dropdown_item, items);
        autoCompleteTextView.setAdapter(itemAdapter);
        //autoCompleteTextView.setOnClickListener(new Ad);

    }

}


