package com.example.android.miowkapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.design.widget.TabLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class myWordAdapter extends ArrayAdapter<WordsModel> {


    public myWordAdapter(Context context, ArrayList<WordsModel> wordsModels) {
        super(context, 0, wordsModels);
    }


    @NonNull
    @Override
    public View getView(int position, View convertView, @NonNull ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.custom_list_word_layout, parent, false);
        }


        WordsModel word = getItem(position);
        TextView textEnglish = (TextView) convertView.findViewById(R.id.EnglishText);
        TextView textTranslation = (TextView) convertView.findViewById(R.id.TranslationText);

        textEnglish.setText(word.getmTextEnglish());
        textTranslation.setText(word.getmTextTranslation());


        return convertView;
    }// end of view method


}


