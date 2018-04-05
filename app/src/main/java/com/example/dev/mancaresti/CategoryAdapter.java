package com.example.dev.mancaresti;

import android.support.v4.app.FragmentPagerAdapter;
import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;

/**
 * Custom adapter to provide layout for each Restaurant object
 */

public class CategoryAdapter extends FragmentPagerAdapter {


    private Context restaurantContext;

    public CategoryAdapter(Context context, FragmentManager restaurantManager) {
        super(restaurantManager);
        restaurantContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        if ( position == 0 ) {
            return new BurgerFragment();
        } else if ( position == 1 ) {
            return new FineFragment();
        } else if (position == 2 ) {
            return new OrientalFragment();
        } else {
            return new PizzaFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position)  {
        if ( position == 0 ) {
            return restaurantContext.getString(R.string.category_burger);
        } else if ( position == 1 ) {
            return restaurantContext.getString(R.string.category_fine);
        } else if (position == 2 ) {
            return restaurantContext.getString(R.string.category_oriental);
        } else {
            return restaurantContext.getString(R.string.category_pizza);
        }
    }
}
