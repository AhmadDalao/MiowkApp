package com.example.android.miowkapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


/**
 * {@link myWordAdapter} is an {@link ArrayAdapter} that can provide the layout for each list
 * based on a data source, which is a list of {@link WordsModel} objects.
 */
public class myWordAdapter extends ArrayAdapter<WordsModel> {

    // this variable is going to be used to sit the background of each page
    private int mColor;


    /**
     * This is our own custom constructor (it doesn't mirror a superclass constructor).
     * The context is used to inflate the layout file, and the list is the data we want
     * to populate into the lists.
     *
     * @param context     The current context. Used to inflate the layout file.
     * @param wordsModels A List of AndroidFlavor objects to display in a list
     */
    public myWordAdapter(Context context, ArrayList<WordsModel> wordsModels) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, wordsModels);
    }


    /**
     * This is our own custom constructor (it doesn't mirror a superclass constructor).
     * The context is used to inflate the layout file, and the list is the data we want
     * to populate into the lists.
     *
     * @param context       The current context. Used to inflate the layout file.
     * @param wordsModels   A List of AndroidFlavor objects to display in a list
     * @param colorResource is the background colo provided to change the background of the activity
     */
    public myWordAdapter(Context context, ArrayList<WordsModel> wordsModels, int colorResource) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, wordsModels);
        this.mColor = colorResource;
    }


    /**
     * Provides a view for an AdapterView (ListView, GridView, etc.)
     *
     * @param position    The position in the list of data that should be displayed in the
     *                    list item view.
     * @param convertView The recycled view to populate.
     * @param parent      The parent ViewGroup that is used for inflation.
     * @return The View for the position in the AdapterView.
     */
    @NonNull
    @Override
    public View getView(int position, View convertView, @NonNull ViewGroup parent) {

        // Check if the existing view is being reused, otherwise inflate the view

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.custom_list_word_layout, parent, false);
        }

        // Get the {@link WordModel} object located at this position in the list
        WordsModel word = getItem(position);

        // Find the TextView in the custom_list_word_layout.xml layout with the ID EnglishText
        TextView textEnglish = (TextView) convertView.findViewById(R.id.EnglishText);
        // Find the TextView in the custom_list_word_layout.xml layout with the ID TranslationText
        TextView textTranslation = (TextView) convertView.findViewById(R.id.TranslationText);
        // Find the TextView in the custom_list_word_layout.xml layout with the ID imageView
        ImageView imageView = (ImageView) convertView.findViewById(R.id.imageView);

        // Get the version name from the current WordModel object : word
        // set this text on the textEnglish TextView
        textEnglish.setText(word.getmTextEnglish());

        // Get the version name from the current WordModel object : word
        // set this text on the textTranslation TextView
        textTranslation.setText(word.getmTextTranslation());

        if (word.hasImage()) {
            imageView.setVisibility(View.VISIBLE);
            // Get the image resource ID from the current AndroidFlavor object and
            // set the image to iconView
            imageView.setImageResource(word.getmImageResource());
        } else {
            imageView.setVisibility(View.GONE);
        }


        // in case there was no color provided solved. crush issue.
        // meaning you can use their  the 3 argument constructor or the the 2 argument constructor.
        if (mColor != 0) {
            // Set the theme color for the list item
            View textContainer = convertView.findViewById(R.id.my_container);
            // Find the color that the resource ID maps to
            int color = ContextCompat.getColor(getContext(), mColor);
            // Set the background color of the text container View
            textContainer.setBackgroundColor(color);
        }


//
//        convertView.findViewById(R.id.myList);
//        convertView.setBackground(Color.parseColor(String.valueOf(mColor)));

        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return convertView;
    }// end of view method


}


