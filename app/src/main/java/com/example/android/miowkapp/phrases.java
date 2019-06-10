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
public class phrases extends Fragment {


    public phrases() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.words_list, container, false);


        ArrayList<WordsModel> words = new ArrayList<WordsModel>();
        words.add(new WordsModel("phrases text", "ةيةيةية"));
        words.add(new WordsModel("fgfgfgfg text", "ةيةيةية"));
        words.add(new WordsModel("dfdfdfdf text", "ةيةيةية"));
        words.add(new WordsModel("phrases ssdsdsd", "ةيةيةية"));
        words.add(new WordsModel("phrases text", "ةيةيةية"));
        words.add(new WordsModel("45454545 text", "ةيةيةية"));
        words.add(new WordsModel("454545 text", "ةيةيةية"));


        myWordAdapter adapter = new myWordAdapter(this.getContext(), words);
        ListView listView = (ListView) view.findViewById(R.id.myList);
        listView.setAdapter(adapter);

        return view;
    }

}
