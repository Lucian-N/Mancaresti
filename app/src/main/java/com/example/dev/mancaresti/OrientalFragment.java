package com.example.dev.mancaresti;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class OrientalFragment extends Fragment {

    public OrientalFragment() {
        // Empty constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View rootView = inflater.inflate(R.layout.restaurant_list, container, false);

        // Create list of Burger Restaurants
        final ArrayList<Restaurant> restaurants = new ArrayList<>();
        restaurants.add(new Restaurant("Li Wu", "Vietnamese Food", R.drawable.ic_directions_white_24dp));
        restaurants.add(new Restaurant("Four Seasons", "Lebanese Food", R.drawable.ic_directions_white_24dp));
        restaurants.add(new Restaurant("Casa Satya", "Spicy Delights", R.drawable.ic_directions_white_24dp));
        restaurants.add(new Restaurant("Tuk Tuk", "Savor Thailand", R.drawable.ic_directions_white_24dp));
        restaurants.add(new Restaurant("5 Elemente", "Chinese Food", R.drawable.ic_directions_white_24dp));
        restaurants.add(new Restaurant("Haveli", "Indian Food", R.drawable.ic_directions_white_24dp));
        restaurants.add(new Restaurant("Taj", "Lamb treats", R.drawable.ic_directions_white_24dp));
        restaurants.add(new Restaurant("Kunnai", "Thai Food", R.drawable.ic_directions_white_24dp));
        restaurants.add(new Restaurant("Karishma", "Taste of Pakistan", R.drawable.ic_directions_white_24dp));
        restaurants.add(new Restaurant("Toan's", " Vietnamese Food", R.drawable.ic_directions_white_24dp));
        restaurants.add(new Restaurant("Long Xuan", "Chinese Food", R.drawable.ic_directions_white_24dp));




        RestaurantAdapter adapter = new RestaurantAdapter(getActivity(), restaurants, R.color.colorAccent);
        ListView listView = rootView.findViewById(R.id.foodList);
        listView.setAdapter(adapter);
        return rootView;
    }
    @Override
    public void onStop() {
        super.onStop();
    }
}
