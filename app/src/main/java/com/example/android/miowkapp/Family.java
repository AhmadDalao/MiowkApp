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


    private View view;

    public Family() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.words_list, container, false);

        populateFamilyList();

        return view;
    }


    private void populateFamilyList() {
        ArrayList<WordsModel> words = WordsModel.getArrayListFamily();
        myWordAdapter adapter = new myWordAdapter(this.getContext(), words);
        ListView listView = (ListView) view.findViewById(R.id.myList);
        listView.setAdapter(adapter);
    }


}
