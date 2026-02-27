package com.example.androiduitesting;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class ShowActivity extends AppCompatActivity {
    String city;

    TextView text;

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_show);

        Intent intent = getIntent();
        city = intent.getStringExtra("city");

        text = findViewById(R.id.city_text);
        text.setText(city);

        button = findViewById(R.id.button_back);
        button.setOnClickListener(view -> {
            finish();
        });
    }
}