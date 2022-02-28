package com.example.dot_dac_doe;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
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

        textInputLayout = findViewById(R.id.menu_drop);
        autoCompleteTextView = findViewById(R.id.drop_items);
        textView = findViewById(R.id.itemSelected);

        String [] items = {"Item1", "Item2", "Item3"};
        ArrayAdapter<String> itemAdapter = new ArrayAdapter<>(Settings.this, R.layout.dropdown_item, items);
        autoCompleteTextView.setAdapter(itemAdapter);
        autoCompleteTextView.setOnClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                textView.setText(parent.getItemAtPosition(position));
            }
        });

    }

}


