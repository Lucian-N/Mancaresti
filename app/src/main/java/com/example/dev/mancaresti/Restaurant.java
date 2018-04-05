package com.example.dev.mancaresti;

import android.util.Log;

/**
 * Create @Restaurant class to be used with custom adapter
 */

public class Restaurant {

    private String restaurantName;
    private String restaurantDescription;
    private int restaurantImage = NO_IMAGE;
    private static final int NO_IMAGE = -1;

    public Restaurant(String restaurantNameId, String restaurantDescriptionId) {
        restaurantName = restaurantNameId;
        restaurantDescription = restaurantDescriptionId;
    }

    public Restaurant(String restaurantNameId, String restaurantDescriptionId, int restaurantImageId) {
        restaurantName = restaurantNameId;
        restaurantDescription = restaurantDescriptionId;
        restaurantImage = restaurantImageId;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public String getRestaurantDescription() {
        return restaurantDescription;
    }

    public int getRestaurantImage() {
        return restaurantImage;
    }

    public boolean imageExists() {
        return restaurantImage != NO_IMAGE;
    }

}
