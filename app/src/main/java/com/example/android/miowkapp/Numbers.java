package com.example.android.miowkapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Objects;


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
        View view = inflater.inflate(R.layout.words_list, container, false);


        // 1 create the list as array list


        ArrayList<WordsModel> words = new ArrayList<WordsModel>();

        words.add(new WordsModel("words", "اهلا"));
        words.add(new WordsModel("hi", "اهلا"));
        words.add(new WordsModel("yo", "اهلا"));
        words.add(new WordsModel("qwqwqwqw", "اهلا"));
        words.add(new WordsModel("wewew", "اهلا"));
        words.add(new WordsModel("woerererrds", "اهلا"));
        words.add(new WordsModel("rerer", "اهلا"));
        words.add(new WordsModel("rttrt", "اهلا"));
        words.add(new WordsModel("fgfgfgfg", "اهلا"));
        words.add(new WordsModel("hhhhh", "اهلا"));
        words.add(new WordsModel("ggggg", "اهلا"));

        myWordAdapter adapter = new myWordAdapter(this.getContext(), words);


        ListView listView = (ListView) view.findViewById(R.id.myList);
        listView.setAdapter(adapter);


        return view;

    }


}
