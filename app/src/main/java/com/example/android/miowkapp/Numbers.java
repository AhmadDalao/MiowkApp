package com.example.android.miowkapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class Numbers extends Fragment {


    public Numbers() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_numbers, container, false);


        ArrayList<String> words = new ArrayList<String>();
        words.add("one");
        words.add("Two");
        words.add("Three");
        words.add("Four");
        words.add("Five");
        words.add("six");
        words.add("seven");
        words.add("eight");
        words.add("nine");
        words.add("ten");
        words.size();


        LinearLayout linearLayout = (LinearLayout)view.findViewById(R.id.myLinearLayoutNumber);

        int counter = 0;
        while (counter < words.size()){
            TextView textView = new TextView(this.getContext());
            textView.setTextSize(32);
            textView.setTextColor(getResources().getColor(R.color.myBlack));
            textView.setText(words.get(counter));
            linearLayout.addView(textView);
            counter ++;
        }




        Log.v("Numbers", "word at index 0: " + words.get(0));
        Log.v("Numbers", "word at index 1: " + words.get(1));
        Log.v("Numbers", "word at index 2: " + words.get(2));
        Log.v("Numbers", "word at index 3: " + words.get(3));
        Log.v("Numbers", "word at index 4: " + words.get(4));
        Log.v("Numbers", "word at index 5: " + words.get(5));
        Log.v("Numbers", "word at index 6: " + words.get(6));
        Log.v("Numbers", "word at index 7: " + words.get(7));
        Log.v("Numbers", "word at index 8: " + words.get(8));
        Log.v("Numbers", "word at index 9: " + words.get(9));
        Log.v("Numbers", "the size of the array is : " + words.size());


        return view;

    }


}
