package com.example.fruitapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Orange_activity extends AppCompatActivity implements View.OnClickListener {
    private Button btnBuy;

    @Override
    public void onClick(View v) {
        Toast.makeText(this, "Your juice has been added to cart", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_orange);

        btnBuy = findViewById(R.id.btnBuy);
        btnBuy.setOnClickListener(this);
    }
}