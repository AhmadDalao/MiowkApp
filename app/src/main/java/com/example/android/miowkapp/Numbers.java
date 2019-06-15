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
import android.widget.Toast;

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
        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.

        ListView listView = (ListView) view.findViewById(R.id.myList);

        // Make the {@link ListView} use the {@link myWordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);

        // Set a click listener to play the audio when the list item is clicked on
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, final View view, int position, long id) {

                // Get the {@link WordsModel} object at the given position the user clicked on
                WordsModel wordsModel = words.get(position);


                /**you may want to print the current state of an object to the logs ( */
                //  Log.v("phrase", "current word" + wordsModel.toString());

                releaseMediaPlayer();

                // Create and setup the {@link MediaPlayer} for the audio resource associated
                // with the current word
                mediaPlayer = (MediaPlayer) MediaPlayer.create(view.getContext(), wordsModel.getmAudio());
                // Start the audio file
                mediaPlayer.start();
                mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        releaseMediaPlayer();
                        Toast.makeText(view.getContext(), "i'm done", Toast.LENGTH_LONG).show();
                    }
                });
            }
        });


    }

    /**
     * Clean up the media player by releasing its resources.
     */
    private void releaseMediaPlayer() {
        // If the media player is not null, then it may be currently playing a sound.
        if (mediaPlayer != null) {
            // Regardless of the current state of the media player, release its resources
            // because we no longer need it.
            mediaPlayer.release();

            // Set the media player back to null. For our code, we've decided that
            // setting the media player to null is an easy way to tell that the media player
            // is not configured to play an audio file at the moment.
            mediaPlayer = null;
        }

    }


}
