package com.example.imrankhan.info_bangladesh;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import com.flaviofaria.kenburnsview.KenBurnsView;

public class place_lists extends AppCompatActivity {

    private ListView listView;
    private String[] place_name;
    private String[] place_details;
    private String[] district;
    private String[] rating_bar;
    private String[] place_pic;
    private String[] address;
    private String division;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_place_lists);

        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#F75D027E")));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);

        KenBurnsView kenBurnsView_obj = (KenBurnsView) findViewById(R.id.image_show_id);
        TextView title = (TextView) findViewById(R.id.title_id);

        Intent intent = getIntent();
        division = intent.getStringExtra("division");

        title.setText("DIVISION: "+division);
        String division_lowerCase = division.toLowerCase();


        if(division_lowerCase.equals("dhaka"))
        {
            kenBurnsView_obj.setImageResource(getResources().getIdentifier("landscape_division_cover_dhaka", "drawable", this.getPackageName()));

            int[] dhaka_place_pic = {R.drawable.landscape_division_dhaka_ahsan_manjil,R.drawable.landscape_division_dhaka_lalbager_kella};

            listView = (ListView) findViewById(R.id.list_id);
            place_name = getResources().getStringArray(R.array.dhaka_place_name);
            place_details = getResources().getStringArray(R.array.dhaka_place_details);
            district = getResources().getStringArray(R.array.dhaka_district);
            rating_bar = getResources().getStringArray(R.array.dhaka_place_rating);
            place_pic = getResources().getStringArray(R.array.dhaka_place_pic);
            address = getResources().getStringArray(R.array.dhaka_address);

            CustomAdapter_Place adapter = new CustomAdapter_Place(place_lists.this, place_name, dhaka_place_pic, rating_bar, district, place_pic);
            listView.setAdapter(adapter);
        }
        else if(division_lowerCase.equals("sylhet"))
        {
            kenBurnsView_obj.setImageResource(getResources().getIdentifier("landscape_division_cover_sylhet", "drawable", this.getPackageName()));

            int[] dhaka_place_pic = {R.drawable.landscape_division_dhaka_ahsan_manjil,R.drawable.landscape_division_dhaka_lalbager_kella};

            listView = (ListView) findViewById(R.id.list_id);
            place_name = getResources().getStringArray(R.array.dhaka_place_name);
            place_details = getResources().getStringArray(R.array.dhaka_place_details);
            district = getResources().getStringArray(R.array.dhaka_district);
            rating_bar = getResources().getStringArray(R.array.dhaka_place_rating);
            place_pic = getResources().getStringArray(R.array.dhaka_place_pic);
            address = getResources().getStringArray(R.array.dhaka_address);

            CustomAdapter_Place adapter = new CustomAdapter_Place(place_lists.this, place_name, dhaka_place_pic, rating_bar, district, place_pic);
            listView.setAdapter(adapter);
        }

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent myIntent = new Intent(place_lists.this, MainActivity.class);
                myIntent.putExtra("placeName", place_name[i]);
                myIntent.putExtra("placeDetails", place_details[i]);
                myIntent.putExtra("district", district[i]);
                myIntent.putExtra("rating", rating_bar[i]);
                myIntent.putExtra("place_pic", place_pic[i]);
                myIntent.putExtra("address", address[i]);
                startActivity(myIntent);
            }
        });
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
