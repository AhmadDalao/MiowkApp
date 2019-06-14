package com.example.android.miowkapp;


import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Objects;


/**
 * A simple {@link Fragment} subclass.
 */
public class Numbers extends Fragment {

    private MediaPlayer mediaPlayer;
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

    private void populateNumbersList() {
        /**
         *  Create an ArrayList of WordsModel objects assigning the value by using the method getArrayListPhrases
         which contains the array of words defined at {@link WordsModel}
         */
        final ArrayList<WordsModel> words = WordsModel.getArrayListNumbers();

        /** Create an {@link myWordAdapter}, whose data source is a list of
         *
         {@link WordsModel}s. The adapter knows how to create list item views for each item
         in the list.
         */
        myWordAdapter adapter = new myWordAdapter(this.getContext(), words, R.color.accent);

        // Get a reference to the ListView, and attach the adapter to the listView.
        ListView listView = (ListView) view.findViewById(R.id.myList);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                WordsModel wordsModel = words.get(position);
                mediaPlayer = (MediaPlayer) MediaPlayer.create(view.getContext(), wordsModel.getmAudio());
                mediaPlayer.start();
            }
        });
    }


}
