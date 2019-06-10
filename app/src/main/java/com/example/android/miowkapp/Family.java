package com.example.android.miowkapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class Family extends Fragment {


    public Family() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.words_list, container, false);

        ArrayList<WordsModel> words = new ArrayList<WordsModel>();
        words.add(new WordsModel("hello this Family fragment ", ""));
        words.add(new WordsModel("ghghghment ", ""));
        words.add(new WordsModel("hefgdfdfamily fragment ", ""));
        words.add(new WordsModel("heldfdfnt ", ""));
        words.add(new WordsModel("hello this Family fragment ", ""));
        words.add(new WordsModel("helldddfdfamily fragment ", ""));
        words.add(new WordsModel("heldfdfragment ", ""));

        myWordAdapter adapter = new myWordAdapter(this.getContext(), words);
        ListView listView = (ListView) view.findViewById(R.id.myList);
        listView.setAdapter(adapter);

        return view;
    }

}
