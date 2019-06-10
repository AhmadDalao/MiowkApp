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
        words.add(new WordsModel("test Colors", "test 2 test 2"));
        words.add(new WordsModel("test test", "test 2 test 2"));
        words.add(new WordsModel("test test", "test 2 test 2"));
        words.add(new WordsModel("test test", "test 2 test 2"));
        words.add(new WordsModel("test test", "test 2 test 2"));

        WordsModel wordsModel = new WordsModel("hi", "yo");
        words.add(wordsModel);
        return words;
    }

    public static ArrayList<WordsModel> getArrayListFamily() {

        ArrayList<WordsModel> words = new ArrayList<WordsModel>();
        words.add(new WordsModel("hello this Family fragment ", "fgfgfgfg"));
        words.add(new WordsModel("ghghghment ", "dfdfdfdf"));
        words.add(new WordsModel("hefgdfdfamily fragment ", "sdsdsdsd"));
        words.add(new WordsModel("heldfdfnt ", "3343434"));
        words.add(new WordsModel("hello this Family fragment ", "54545454"));
        words.add(new WordsModel("helldddfdfamily fragment ", "23232323"));
        words.add(new WordsModel("heldfdfragment ", "121212"));
        return words;

    }


    public static ArrayList<WordsModel> getArrayListNumbers() {
        ArrayList<WordsModel> words = new ArrayList<WordsModel>();
        words.add(new WordsModel("Numbers", "اهلا"));
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
        return words;
    }

    public static ArrayList<WordsModel> getArrayListPhrases() {
        ArrayList<WordsModel> words = new ArrayList<WordsModel>();
        words.add(new WordsModel("phrases text", "ةيةيةية"));
        words.add(new WordsModel("fgfgfgfg text", "ةيةيةية"));
        words.add(new WordsModel("dfdfdfdf text", "ةيةيةية"));
        words.add(new WordsModel("phrases ssdsdsd", "ةيةيةية"));
        words.add(new WordsModel("phrases text", "ةيةيةية"));
        words.add(new WordsModel("45454545 text", "ةيةيةية"));
        words.add(new WordsModel("454545 text", "ةيةيةية"));
        return words;
    }


}
