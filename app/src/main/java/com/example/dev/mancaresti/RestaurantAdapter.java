package com.example.dev.mancaresti;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Custom adapter to populate with local restaurants
 */

public class RestaurantAdapter extends ArrayAdapter<Restaurant>{

    // Use to change background color of each type
    private int backgroundColor;

    public RestaurantAdapter(Context context, ArrayList<Restaurant> restaurants, int backgroundColorId) {
        super(context, 0, restaurants);
        backgroundColor = backgroundColorId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.restaurant_unit, parent, false);
        }

        // Get restaurant at list position
        Restaurant currentRestaurant = getItem(position);

        // Find respective resource files to update from xml
        // Update restaurant information with name, description and image
        TextView restaurantName = convertView.findViewById(R.id.restaurantName);
        restaurantName.setText(currentRestaurant.getRestaurantName());

        TextView restaurantDescription = convertView.findViewById(R.id.restaurantDescription);
        restaurantDescription.setText(currentRestaurant.getRestaurantDescription());

        ImageView restaurantImage = convertView.findViewById(R.id.restaurantImage);
        // Checks for an existing image
        if (currentRestaurant.imageExists()) {
            restaurantImage.setImageResource(currentRestaurant.getRestaurantImage());
            restaurantImage.setVisibility(View.VISIBLE);
        }
        else
            restaurantImage.setVisibility(View.GONE);

        LinearLayout textContainer = convertView.findViewById(R.id.restaurantContainer);
        int color = ContextCompat.getColor(getContext(),backgroundColor);
        textContainer.setBackgroundColor(color);

        return convertView;
    }
}
