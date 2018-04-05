package com.example.dev.mancaresti;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class BurgerFragment extends Fragment{

    public BurgerFragment() {
        // Empty constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View rootView = inflater.inflate(R.layout.restaurant_list, container, false);

        // Create list of Burger Restaurants
        final ArrayList<Restaurant> restaurants = new ArrayList<>();
        restaurants.add(new Restaurant("Vivo", "Fusion Food Bar", R.drawable.ic_directions_white_24dp));
        restaurants.add(new Restaurant("Modelier", "Burger Joint", R.drawable.ic_directions_white_24dp));
        restaurants.add(new Restaurant("Switch.eat", "Street Food Style", R.drawable.ic_directions_white_24dp));
        restaurants.add(new Restaurant("Vacamuuu", "Freshest Cuts", R.drawable.ic_directions_white_24dp));
        restaurants.add(new Restaurant("Red Angus Steakhouse", "Taste Australia", R.drawable.ic_directions_white_24dp));
        restaurants.add(new Restaurant("Osho", "Best Steak in Town", R.drawable.ic_directions_white_24dp));
        restaurants.add(new Restaurant("Buffalo Baz", "Baz Bistro and Lounge", R.drawable.ic_directions_white_24dp));
        restaurants.add(new Restaurant("Burger Van", "Food Truck", R.drawable.ic_directions_white_24dp));
        restaurants.add(new Restaurant("Circus", "Best Burgers", R.drawable.ic_directions_white_24dp));
        restaurants.add(new Restaurant("Simbio", "Gastrourban Bar", R.drawable.ic_directions_white_24dp));

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
