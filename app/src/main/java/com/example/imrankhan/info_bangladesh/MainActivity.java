package com.example.imrankhan.info_bangladesh;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.RatingBar;
import android.widget.TextView;

import com.flaviofaria.kenburnsview.KenBurnsView;

public class MainActivity extends AppCompatActivity {
    KenBurnsView image_show;
    TextView place_name, district, description, address;
    RatingBar ratingBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#F75D027E")));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);

        image_show = (KenBurnsView) findViewById(R.id.image_show_id);
        place_name = (TextView) findViewById(R.id.place_name_id);
        district = (TextView) findViewById(R.id.district_name_id);
        description = (TextView) findViewById(R.id.description_id);
        address = (TextView) findViewById(R.id.address_id);
        ratingBar = (RatingBar) findViewById(R.id.rating_view_id);

        Intent mIntent = getIntent();
        String placeName = mIntent.getStringExtra("placeName");
        String districtName = mIntent.getStringExtra("district");
        String description_temp = mIntent.getStringExtra("placeDetails");
        String address_temp = mIntent.getStringExtra("address");
        String rating_temp = mIntent.getStringExtra("rating");
        String place_pic = mIntent.getStringExtra("place_pic");

        float rating = Float.parseFloat(rating_temp);

        place_name.setText(placeName);
        district.setText("District : " + districtName);
        address.setText("Address : " + address_temp);
        description.setText(description_temp);
        image_show.setImageResource(getResources().getIdentifier(place_pic, "drawable", this.getPackageName()));
        ratingBar.setRating(rating);
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
}
