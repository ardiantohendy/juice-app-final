package com.example.fruitapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private CardView cardGrape, cardOrange, cardApple, cardOrange2;
    private Button showDetail;
    Intent intent;

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.cardGrape:
                intent = new Intent(this, Grape_activity.class);
                startActivity(intent);
                break;
            case R.id.cardOrange:
                intent = new Intent(this, Orange_activity.class);
                startActivity(intent);
                break;
            case R.id.cardApple:
                intent = new Intent(this, Apple_activity.class);
                startActivity(intent);
                break;
            case R.id.cardOrange2:
                intent = new Intent(this, Orange2_activity.class);
                startActivity(intent);
                break;
            case R.id.showDetail:
                intent = new Intent(this, ShowAllMenu.class);
                startActivity(intent);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cardGrape = findViewById(R.id.cardGrape);
        cardOrange = findViewById(R.id.cardOrange);
        cardApple = findViewById(R.id.cardApple);
        cardOrange2 = findViewById(R.id.cardOrange2);
        showDetail = findViewById(R.id.showDetail);

        cardGrape.setOnClickListener(this);
        cardOrange.setOnClickListener(this);
        cardApple.setOnClickListener(this);
        cardOrange2.setOnClickListener(this);
        showDetail.setOnClickListener(this);
    }
}