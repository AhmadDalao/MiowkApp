package com.example.android.miowkapp;


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
public class Colors extends Fragment {


    private View view;

    public Colors() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.words_list, container, false);

        populateColorsList();

        return view;
    }

    private void populateColorsList() {
        ArrayList<WordsModel> words = WordsModel.getMyArrayListColors();
        myWordAdapter adapter = new myWordAdapter(this.getContext(), words);
        ListView listView = (ListView) view.findViewById(R.id.myList);
        listView.setAdapter(adapter);
        //listView.setOnClickListener();
    }


}
