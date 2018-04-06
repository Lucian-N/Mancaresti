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
        restaurants.add(new Restaurant(getString(R.string.pizzaone), getString(R.string.pizzadescone), R.drawable.ic_directions_white_24dp));
        restaurants.add(new Restaurant(getString(R.string.pizzatwo), getString(R.string.pizzadesctwo), R.drawable.ic_directions_white_24dp));
        restaurants.add(new Restaurant(getString(R.string.pizzathree), getString(R.string.pizzadescthree), R.drawable.ic_directions_white_24dp));
        restaurants.add(new Restaurant(getString(R.string.pizzafour), getString(R.string.pizzadescfour), R.drawable.ic_directions_white_24dp));
        restaurants.add(new Restaurant(getString(R.string.pizzafive), getString(R.string.pizzadescfive), R.drawable.ic_directions_white_24dp));
        restaurants.add(new Restaurant(getString(R.string.pizzasix), getString(R.string.pizzadescsix), R.drawable.ic_directions_white_24dp));
        restaurants.add(new Restaurant(getString(R.string.pizzaseven), getString(R.string.pizzadescseven), R.drawable.ic_directions_white_24dp));
        restaurants.add(new Restaurant(getString(R.string.pizzaeight), getString(R.string.pizzadesceight), R.drawable.ic_directions_white_24dp));
        restaurants.add(new Restaurant(getString(R.string.pizzanine), getString(R.string.pizzadescnine), R.drawable.ic_directions_white_24dp));

        RestaurantAdapter adapter = new RestaurantAdapter(getActivity(), restaurants, R.color.colorPizza);
        ListView listView = rootView.findViewById(R.id.foodList);
        listView.setAdapter(adapter);
        return rootView;
    }
    @Override
    public void onStop() {
        super.onStop();
    }
}
