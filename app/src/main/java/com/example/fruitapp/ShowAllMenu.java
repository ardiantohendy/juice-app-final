package com.example.fruitapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ShowAllMenu extends AppCompatActivity implements View.OnClickListener {
    private CardView cardGrape, cardOrange, cardOrange2, cardApple;
    private Intent intent;

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.cardGrape:
                intent = new Intent(this,Grape_activity.class);
                startActivity(intent);
                break;
            case R.id.cardOrange:
                intent = new Intent(this, Orange_activity.class);
                startActivity(intent);
                break;
            case R.id.cardOrange2:
                intent = new Intent(this, Orange2_activity.class);
                startActivity(intent);
                break;
            case R.id.cardApple:
                intent = new Intent(this, Apple_activity.class);
                startActivity(intent);
                break;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_all_menu);

        cardGrape = findViewById(R.id.cardGrape);
        cardOrange = findViewById(R.id.cardOrange);
        cardOrange2 = findViewById(R.id.cardOrange2);
        cardApple = findViewById(R.id.cardApple);

        cardGrape.setOnClickListener(this);
        cardOrange.setOnClickListener(this);
        cardOrange2.setOnClickListener(this);
        cardApple.setOnClickListener(this);
    }
}