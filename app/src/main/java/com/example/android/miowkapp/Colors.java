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


//        ArrayList<WordsModel> words = new ArrayList<WordsModel>();
//        words.add(new WordsModel("colors fragment text", "اهلااااا"));
//        words.add(new WordsModel("ghghght", "اهلااااا"));
//        words.add(new WordsModel("colors ghghgh text", "اهلااااا"));
//        words.add(new WordsModel("codfdfdfment text", "اهلااااا"));
//        words.add(new WordsModel("colors 66565656t", "اهلااااا"));
//        words.add(new WordsModel("cofgfgfgment text", "اهلااااا"));
//        words.add(new WordsModel("colors fragment dfdfdfrs fragment text", "اهلااااا"));
//        words.add(new WordsModel("colorsdfdfdfxt", "اهلااااا"));
//        words.add(new WordsModel("colorsdsdsd text", "اهلااااا"));
//        words.add(new WordsModel("colors fragment text", "اهلااااا"));
//        words.add(new WordsModel("colors fragment text", "اهلااااا"));

        populateDataList();


        return view;
    }

    private void populateDataList() {
        ArrayList<WordsModel> words = WordsModel.getMyArrayListColors();
        myWordAdapter adapterb = new myWordAdapter(this.getContext(), words);
        ListView listView = (ListView) view.findViewById(R.id.myList);
        listView.setAdapter(adapterb);
        //listView.setOnClickListener();
    }


}
