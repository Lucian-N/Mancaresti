package com.example.dev.mancaresti;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class FineFragment extends Fragment{

    public FineFragment() {
        // Empty constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View rootView = inflater.inflate(R.layout.restaurant_list, container, false);

        // Create list of Burger Restaurants
        final ArrayList<Restaurant> restaurants = new ArrayList<>();
        restaurants.add(new Restaurant("the ARTIST", "Contemporary European", R.drawable.ic_directions_white_24dp));
        restaurants.add(new Restaurant("Le Bistrot Francais", "French themed", R.drawable.ic_directions_white_24dp));
        restaurants.add(new Restaurant("5 Elemente", "Chinese Food", R.drawable.ic_directions_white_24dp));
        restaurants.add(new Restaurant("JW Steakhouse", "Fresh cuts", R.drawable.ic_directions_white_24dp));
        restaurants.add(new Restaurant("Osho", "Best Steak in Town", R.drawable.ic_directions_white_24dp));
        restaurants.add(new Restaurant("Joseph", "Mediterranean Food", R.drawable.ic_directions_white_24dp));
        restaurants.add(new Restaurant("Kunnai", "Thai Food", R.drawable.ic_directions_white_24dp));
        restaurants.add(new Restaurant("Modigliani", "Pasta e Carne", R.drawable.ic_directions_white_24dp));
        restaurants.add(new Restaurant("Casa di David", "Italian themed", R.drawable.ic_directions_white_24dp));
        restaurants.add(new Restaurant("Vacamuuu", "Freshest Cuts", R.drawable.ic_directions_white_24dp));
        restaurants.add(new Restaurant("Resto Aperto", "Padano Pizza", R.drawable.ic_directions_white_24dp));
        restaurants.add(new Restaurant("NOR", "Sky Casual Restaurant", R.drawable.ic_directions_white_24dp));

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
