/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.dev.mancaresti;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.design.widget.TabLayout;

// App presents User with several lists of places to eat from Bucharest

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Set layout on init to main activity
        setContentView(R.layout.activity_main);

        // Set view pager that allows fragment navigation
        ViewPager mainPager = findViewById(R.id.mainActivityViewPager);

        // Adapter handles each fragment on activities
        CategoryAdapter adapter = new CategoryAdapter(this, getSupportFragmentManager());

        // Set the adapter on the view pager
        mainPager.setAdapter(adapter);

        // Create layout for tabs to be displayed and connect layout to view pager to update views
        TabLayout tabLayout = findViewById(R.id.mainActivityTabLayout);
        tabLayout.setupWithViewPager(mainPager);

    }
}
