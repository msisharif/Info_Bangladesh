package com.example.imrankhan.info_bangladesh;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Toast;

public class home_menu extends AppCompatActivity implements View.OnClickListener{
    private CardView landscape_card, river_card, feedback_card, about_card;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_menu);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#F75D027E")));
        getSupportActionBar().setLogo(R.drawable.logo);
        getSupportActionBar().setDisplayUseLogoEnabled(true);

        landscape_card = (CardView) findViewById(R.id.landscape_id);
        river_card = (CardView) findViewById(R.id.river_id);
        feedback_card = (CardView) findViewById(R.id.feedback_id);
        about_card = (CardView) findViewById(R.id.about_id);

        landscape_card.setOnClickListener(this);
        river_card.setOnClickListener(this);
        feedback_card.setOnClickListener(this);
        about_card.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.landscape_id)
        {
            Intent intent = new Intent(home_menu.this, place_menu.class);
            startActivity(intent);
        }
        else if(v.getId() == R.id.river_id)
        {
            Toast.makeText(home_menu.this, "This module will be Updated soon!", Toast.LENGTH_SHORT).show();
        }
        else if(v.getId() == R.id.feedback_id)
        {
            Intent intent = new Intent(home_menu.this, feedback.class);
            startActivity(intent);
        }
        else if(v.getId() == R.id.about_id)
        {
            Intent intent = new Intent(home_menu.this, about.class);
            startActivity(intent);
        }
    }
}
