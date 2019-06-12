package com.example.android.miowkapp;


import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class phrases extends Fragment {

    private View view;

    public phrases() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.words_list, container, false);


        populatePhraseList();
        return view;
    }


    private void populatePhraseList() {
        /**
         *  Create an ArrayList of WordsModel objects assigning the value by using the method getArrayListPhrases
         which contains the array of words defined at {@link WordsModel}
         */
        ArrayList<WordsModel> words = WordsModel.getArrayListPhrases();

        /** Create an {@link myWordAdapter}, whose data source is a list of
         *
         {@link WordsModel}s. The adapter knows how to create list item views for each item
         in the list.
         */
        myWordAdapter adapter = new myWordAdapter(this.getContext(), words ,R.color.primary_light);

        // Get a reference to the ListView, and attach the adapter to the listView.
        ListView listView = (ListView) view.findViewById(R.id.myList);
        listView.setAdapter(adapter);
    }

}
