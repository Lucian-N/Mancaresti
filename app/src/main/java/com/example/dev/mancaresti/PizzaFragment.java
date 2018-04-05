package com.example.dev.mancaresti;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class PizzaFragment extends Fragment{

    public PizzaFragment() {
        // Empty constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View rootView = inflater.inflate(R.layout.restaurant_list, container, false);

        // Create list of Burger Restaurants
        final ArrayList<Restaurant> restaurants = new ArrayList<>();
        restaurants.add(new Restaurant("Domino's", "Fast Food", R.drawable.ic_directions_white_24dp));
        restaurants.add(new Restaurant("Volare", "Pizza Napoletana", R.drawable.ic_directions_white_24dp));
        restaurants.add(new Restaurant("Premiata", "Pizza Milan", R.drawable.ic_directions_white_24dp));
        restaurants.add(new Restaurant("Fabio", "Fast Food", R.drawable.ic_directions_white_24dp));
        restaurants.add(new Restaurant("Boca Lupo", "Roma Pizza", R.drawable.ic_directions_white_24dp));
        restaurants.add(new Restaurant("Borsalino", "Pizza Napoletana", R.drawable.ic_directions_white_24dp));
        restaurants.add(new Restaurant("Jerry's", "Fast Food", R.drawable.ic_directions_white_24dp));
        restaurants.add(new Restaurant("Resto Aperto", "Padano Pizza", R.drawable.ic_directions_white_24dp));
        restaurants.add(new Restaurant("Trenta", "Fast Food", R.drawable.ic_directions_white_24dp));





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
