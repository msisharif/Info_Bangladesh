package com.example.imrankhan.info_bangladesh;

/**
 * Created by ImranKhan on 9/4/2018.
 */

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.RatingBar;
import android.widget.TextView;

import com.makeramen.roundedimageview.RoundedImageView;

/**
 * Created by ImranKhan on 4/1/2018.
 */

public class CustomAdapter_Place extends BaseAdapter {

    int[] place_pic;
    String[] place_name;
    String[] rating;
    String[] district_name;
    String[] place_pic_pos;
    Context context;
    LayoutInflater layoutInflater;

    public CustomAdapter_Place(Context context, String[] place_name, int[] place_pic, String[] rating, String[] district_name, String[] place_pic_pos) {
        this.place_pic = place_pic;
        this.place_name = place_name;
        this.rating = rating;
        this.district_name = district_name;
        this.place_pic_pos = place_pic_pos;
        this.context = context;
        this.layoutInflater = layoutInflater;
    }

    @Override
    public int getCount() {
        return place_name.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {


        if(view == null)
        {
            layoutInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
            view = layoutInflater.inflate(R.layout.sample_view, viewGroup,false);
        }

        RoundedImageView show_place_pic =(RoundedImageView) view.findViewById(R.id.image_show_id);
        TextView placeName = (TextView) view.findViewById(R.id.place_name_id);
        TextView districtName = (TextView) view.findViewById(R.id.district_name_id);
        RatingBar ratingBar = (RatingBar) view.findViewById(R.id.rating_id);

        float rating_temp = Float.parseFloat(rating[i]);

        show_place_pic.setImageResource(place_pic[i]);
        placeName.setText(place_name[i]);
        districtName.setText(district_name[i]);
        ratingBar.setRating(rating_temp);

        return view;
    }
}
