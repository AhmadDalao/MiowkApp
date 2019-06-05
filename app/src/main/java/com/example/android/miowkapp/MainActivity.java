package com.example.android.miowkapp;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // //Set the content of the activity to use the activity_main.xml layout file
        // Find the view pager that will allow the user to swipe between fragments
        // you can fine id.MyViewPager in activity main.xml under viewPager View

        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);
        if (viewPager != null) {
            setupViewPager(viewPager);
        }
        // Create an adapter that knows which fragment should be shown on each page
        //  myViewPagerAdapter adapter = new myViewPagerAdapter(getSupportFragmentManager());
        //  add the icon to the tap layout
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);

        tabLayout.setupWithViewPager(viewPager);


//        // to add icons to the taps
//        tabLayout.getTabAt(0).setIcon(R.drawable.ic_colors);
//        tabLayout.getTabAt(1).setIcon(R.drawable.ic_people2);
//        tabLayout.getTabAt(2).setIcon(R.drawable.ic_numbers);
//        tabLayout.getTabAt(3).setIcon(R.drawable.ic_proverb);


    } // end of onCreate method


    //  this method will add my fragments to the viewPager so i can see them on the screen
    private void setupViewPager(ViewPager viewPager) {
        myViewPagerAdapter adapter = new myViewPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new Colors(), "Colors");
        adapter.addFragment(new Family(), "Family");
        adapter.addFragment(new Numbers(), "Numbers");
        adapter.addFragment(new phrases(), "Phrases");


//  the more you add the more taps you have but you need to create the class and xml file for the new fragments .
        viewPager.setAdapter(adapter);
    }


}// end of main


