package com.example.imrankhan.info_bangladesh;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.transition.Slide;
import android.support.transition.TransitionInflater;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Toast;

import com.makeramen.roundedimageview.RoundedImageView;

public class place_menu extends AppCompatActivity implements View.OnClickListener{
    private RoundedImageView dhaka, sylhet, chittagong, barisal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_place_menu);

        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#F75D027E")));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);

        dhaka = (RoundedImageView) findViewById(R.id.dhaka_id);
        sylhet = (RoundedImageView) findViewById(R.id.sylhet_id);
        chittagong = (RoundedImageView) findViewById(R.id.chittagong_id);
        barisal = (RoundedImageView) findViewById(R.id.barisal_id);

        dhaka.setOnClickListener(this);
        sylhet.setOnClickListener(this);
        chittagong.setOnClickListener(this);
        barisal.setOnClickListener(this);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                this.finish();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.dhaka_id)
        {
            Intent intent = new Intent(place_menu.this, place_lists.class);
            intent.putExtra("division", "Dhaka");
            startActivity(intent);
            //overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
        }
        else if(v.getId() == R.id.sylhet_id)
        {
            /*Intent intent = new Intent(place_menu.this, place_lists.class);
            intent.putExtra("division", "Sylhet");
            startActivity(intent);*/
            Toast.makeText(place_menu.this, "This module will be updated soon!", Toast.LENGTH_SHORT).show();
        }
        else if(v.getId() == R.id.chittagong_id)
        {
            /*Intent intent = new Intent(place_menu.this, place_lists.class);
            intent.putExtra("division", "Chittagong");
            startActivity(intent);*/
            Toast.makeText(place_menu.this, "This module will be updated soon!", Toast.LENGTH_SHORT).show();
        }
        else if(v.getId() == R.id.barisal_id)
        {
            /*Intent intent = new Intent(place_menu.this, place_lists.class);
            intent.putExtra("division", "Barisal");
            startActivity(intent);*/
            Toast.makeText(place_menu.this, "This module will be updated soon!", Toast.LENGTH_SHORT).show();
        }
        else if(v.getId() == R.id.khulna_id)
        {
            Toast.makeText(place_menu.this, "This module will be updated soon!", Toast.LENGTH_SHORT).show();
        }
        else if(v.getId() == R.id.rajshahi_id)
        {
            Toast.makeText(place_menu.this, "This module will be updated soon!", Toast.LENGTH_SHORT).show();
        }
    }
}
