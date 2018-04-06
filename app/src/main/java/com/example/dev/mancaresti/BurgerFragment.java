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
        restaurants.add(new Restaurant(getString(R.string.restnameone), getString(R.string.restdescone), R.drawable.vivo));
        restaurants.add(new Restaurant(getString(R.string.restnametwo), getString(R.string.testdesctwo), R.drawable.modelier));
        restaurants.add(new Restaurant(getString(R.string.restnamethree), getString(R.string.restdescthree), R.drawable.switcheat));
        restaurants.add(new Restaurant(getString(R.string.restnamefour), getString(R.string.restdescfour), R.drawable.vacamuuu));
        restaurants.add(new Restaurant(getString(R.string.restnamefive), getString(R.string.restdescfive), R.drawable.redangus));
        restaurants.add(new Restaurant(getString(R.string.restnamesix), getString(R.string.restdescsix), R.drawable.osho));
        restaurants.add(new Restaurant(getString(R.string.restnameseven), getString(R.string.restdescseven), R.drawable.buffalobaz));
        restaurants.add(new Restaurant(getString(R.string.restnameeight), getString(R.string.restdesceight), R.drawable.burgervan));
        restaurants.add(new Restaurant(getString(R.string.restnamenine), getString(R.string.restdescnine), R.drawable.modelier));
        restaurants.add(new Restaurant(getString(R.string.restnameten), getString(R.string.restdescten), R.drawable.simbio));

        RestaurantAdapter adapter = new RestaurantAdapter(getActivity(), restaurants, R.color.colorBurger);
        ListView listView = rootView.findViewById(R.id.foodList);
        listView.setAdapter(adapter);
        return rootView;
    }
    @Override
    public void onStop() {
        super.onStop();
    }
}
