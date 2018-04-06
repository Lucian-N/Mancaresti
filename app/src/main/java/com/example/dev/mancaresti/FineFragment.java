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
        restaurants.add(new Restaurant(getString(R.string.fineone), getString(R.string.finedescone), R.drawable.ic_directions_white_24dp));
        restaurants.add(new Restaurant(getString(R.string.finetwo), getString(R.string.finedesctwo), R.drawable.ic_directions_white_24dp));
        restaurants.add(new Restaurant(getString(R.string.finethree), getString(R.string.finedescthree), R.drawable.ic_directions_white_24dp));
        restaurants.add(new Restaurant(getString(R.string.finefour), getString(R.string.finedescfour), R.drawable.ic_directions_white_24dp));
        restaurants.add(new Restaurant(getString(R.string.finefive), getString(R.string.finedescfive), R.drawable.ic_directions_white_24dp));
        restaurants.add(new Restaurant(getString(R.string.finesix), getString(R.string.finedescsix), R.drawable.ic_directions_white_24dp));
        restaurants.add(new Restaurant(getString(R.string.fineseven), getString(R.string.finedescseven), R.drawable.ic_directions_white_24dp));
        restaurants.add(new Restaurant(getString(R.string.fineeight), getString(R.string.finedesceight), R.drawable.ic_directions_white_24dp));
        restaurants.add(new Restaurant(getString(R.string.finenine), getString(R.string.finedescnine), R.drawable.ic_directions_white_24dp));
        restaurants.add(new Restaurant(getString(R.string.fineten), getString(R.string.finedescten), R.drawable.ic_directions_white_24dp));
        restaurants.add(new Restaurant(getString(R.string.fineeleven), getString(R.string.finedesceleven), R.drawable.ic_directions_white_24dp));
        restaurants.add(new Restaurant(getString(R.string.finetwelve), getString(R.string.finedesctwelve), R.drawable.ic_directions_white_24dp));

        RestaurantAdapter adapter = new RestaurantAdapter(getActivity(), restaurants, R.color.colorFine);
        ListView listView = rootView.findViewById(R.id.foodList);
        listView.setAdapter(adapter);
        return rootView;
    }
    @Override
    public void onStop() {
        super.onStop();
    }
}
