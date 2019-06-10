package com.example.android.miowkapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Objects;


/**
 * A simple {@link Fragment} subclass.
 */
public class Numbers extends Fragment {


    private View view;

    public Numbers() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
         view = inflater.inflate(R.layout.words_list, container, false);

         populateNumbersList();
        return view;

    }

    private void populateNumbersList(){
        ArrayList<WordsModel> words = WordsModel.getArrayListNumbers();
        myWordAdapter adapter = new myWordAdapter(this.getContext() ,words);
        ListView listView = (ListView) view.findViewById(R.id.myList);
        listView.setAdapter(adapter);

    }




}
