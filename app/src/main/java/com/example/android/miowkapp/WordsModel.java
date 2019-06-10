package com.example.android.miowkapp;

import android.media.Image;
import android.provider.ContactsContract;
import android.widget.ListView;

import java.util.ArrayList;

public class WordsModel {


    //declare private data instead of public to ensure the privacy of data field of each class
    private String mTextEnglish;
    private String mTextTranslation;
    private final static int Image = -1;
    private int mImageResource = Image;
    private int mAudio;


    public WordsModel(String mTextEnglish, String mTextTranslation, int mImageResource, int mAudio) {
        this.mTextEnglish = mTextEnglish;
        this.mTextTranslation = mTextTranslation;
        this.mImageResource = mImageResource;
        this.mAudio = mAudio;
    }


    public WordsModel(String mTextEnglish, String mTextTranslation, int mImageResource) {
        this.mTextEnglish = mTextEnglish;
        this.mTextTranslation = mTextTranslation;
        this.mImageResource = mImageResource;
    }

    public WordsModel(String mTextEnglish, String mTextTranslation) {
        this.mTextEnglish = mTextEnglish;
        this.mTextTranslation = mTextTranslation;
    }

    // check wither an image is provided or not
    public boolean hasImage() {
        return mImageResource != Image;
    }


    //retrieve the english text

    public String getmTextEnglish() {
        return mTextEnglish;
    }
    //retrieve the translation

    public String getmTextTranslation() {
        return mTextTranslation;
    }

    //retrieve the image id
    public int getmImageResource() {
        return mImageResource;
    }

    public int getmAudio() {
        return mAudio;
    }


    public static ArrayList<WordsModel> getMyArrayListColors() {
        ArrayList<WordsModel> words = new ArrayList<WordsModel>();
        words.add(new WordsModel("test test", "test 2 test 2"));
        words.add(new WordsModel("test test", "test 2 test 2"));
        words.add(new WordsModel("test test", "test 2 test 2"));
        words.add(new WordsModel("test test", "test 2 test 2"));
        words.add(new WordsModel("test test", "test 2 test 2"));
        return words;
    }


}
