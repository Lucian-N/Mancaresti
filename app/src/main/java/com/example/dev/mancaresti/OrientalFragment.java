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
        restaurants.add(new Restaurant(getString(R.string.orientalone), getString(R.string.orientaldescone), R.drawable.ic_directions_white_24dp));
        restaurants.add(new Restaurant(getString(R.string.orientaltwo), getString(R.string.orientaldesctwo), R.drawable.ic_directions_white_24dp));
        restaurants.add(new Restaurant(getString(R.string.orientalthree), getString(R.string.orientaldescthree), R.drawable.ic_directions_white_24dp));
        restaurants.add(new Restaurant(getString(R.string.orientalfour), getString(R.string.orientaldescfour), R.drawable.ic_directions_white_24dp));
        restaurants.add(new Restaurant(getString(R.string.orientalfive), getString(R.string.orientaldescfive), R.drawable.ic_directions_white_24dp));
        restaurants.add(new Restaurant(getString(R.string.orientalsix), getString(R.string.orientaldescsix), R.drawable.ic_directions_white_24dp));
        restaurants.add(new Restaurant(getString(R.string.orientalseven), getString(R.string.orientaldescseven), R.drawable.ic_directions_white_24dp));
        restaurants.add(new Restaurant(getString(R.string.orientalnine), getString(R.string.orientaldescnine), R.drawable.ic_directions_white_24dp));
        restaurants.add(new Restaurant(getString(R.string.orientaleight), getString(R.string.orientaldesceight), R.drawable.ic_directions_white_24dp));
        restaurants.add(new Restaurant(getString(R.string.orientalten), getString(R.string.orientaldescten), R.drawable.ic_directions_white_24dp));
        restaurants.add(new Restaurant(getString(R.string.orientaleleven), getString(R.string.orientaldesceleven), R.drawable.ic_directions_white_24dp));

        RestaurantAdapter adapter = new RestaurantAdapter(getActivity(), restaurants, R.color.colorOriental);
        ListView listView = rootView.findViewById(R.id.foodList);
        listView.setAdapter(adapter);
        return rootView;
    }
    @Override
    public void onStop() {
        super.onStop();
    }
}
