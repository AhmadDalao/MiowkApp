package com.example.android.miowkapp;

import android.media.Image;
import android.provider.ContactsContract;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * {@link WordsModel} represent the vocabulary words that the user wants to learn .
 * it also contains the translation for the words
 */
public class WordsModel {
    //declare private data instead of public to ensure the privacy of data field of each class

    /*
     * Default text in this case the English language  for each word
     */
    private String mTextEnglish;
    /*
     * translation text in this case the translation  for each  English word
     */
    private String mTextTranslation;
    private final static int Image = -1;
    private int mImageResource = Image;
    private int mAudio;


    /**
     * create a new WordModel  object
     *
     * @param mTextEnglish     the word  that the user is already familiar with
     *                         ( such as English or any other languages ).
     * @param mTextTranslation the word translation in arabic for example.
     * @param mImageResource   the image which will be added next to each item in the list to help
     *                         understanding the meaning of the word.
     * @param mAudio           the audio which will be played to help the user understand the correct
     *                         pronunciation.
     */
    public WordsModel(String mTextEnglish, String mTextTranslation, int mImageResource, int mAudio) {
        this.mTextEnglish = mTextEnglish;
        this.mTextTranslation = mTextTranslation;
        this.mImageResource = mImageResource;
        this.mAudio = mAudio;
    }

    /**
     * create a new WordModel  object
     *
     * @param mTextEnglish     the word  that the user is already familiar with
     *                         ( such as English or any other languages ).
     * @param mTextTranslation the word translation in arabic for example.
     * @param mImageResource   the image which will be added next to each item in the list to help
     *                         understanding the meaning of the word.
     */
    public WordsModel(String mTextEnglish, String mTextTranslation, int mImageResource) {
        this.mTextEnglish = mTextEnglish;
        this.mTextTranslation = mTextTranslation;
        this.mImageResource = mImageResource;
    }

    /**
     * create a new WordModel  object
     *
     * @param mTextEnglish     the word  that the user is already familiar with
     *                         ( such as English or any other languages ).
     * @param mTextTranslation the word translation in arabic for example.
     */
    public WordsModel(String mTextEnglish, String mTextTranslation) {
        this.mTextEnglish = mTextEnglish;
        this.mTextTranslation = mTextTranslation;
    }

    /*
    check wither an image is provided or not
     */
    public boolean hasImage() {
        return mImageResource != Image;
    }


    /*
    retrieve the english text
     */

    public String getmTextEnglish() {
        return mTextEnglish;
    }

    /*
    retrieve the translation
     */
    public String getmTextTranslation() {
        return mTextTranslation;
    }

    /*
     *     retrieve the image id
     */
    public int getmImageResource() {
        return mImageResource;
    }

    /*
     * retrieve the audio for each word
     */
    public int getmAudio() {
        return mAudio;
    }


    public static ArrayList<WordsModel> getMyArrayListColors() {
        // Create an ArrayList of WordsModel objects

        ArrayList<WordsModel> words = new ArrayList<WordsModel>();
        words.add(new WordsModel("black", "test 2 test 2", R.drawable.color_black));
        words.add(new WordsModel("brown", "test 2 test 2" , R.drawable.color_brown));
        words.add(new WordsModel("dusty yellow", "test 2 test 2", R.drawable.color_dusty_yellow));
        words.add(new WordsModel("gray", "test 2 test 2" , R.drawable.color_gray));
        words.add(new WordsModel("green", "test 2 test 2", R.drawable.color_green));
        words.add(new WordsModel("mustard yellow", "test 2 test 2", R.drawable.color_mustard_yellow));
        words.add(new WordsModel("red", "test 2 test 2", R.drawable.color_red));
        words.add(new WordsModel("white", "test 2 test 2", R.drawable.color_white));
        WordsModel wordsModel = new WordsModel("hi", "yo");
        words.add(wordsModel);
        return words;
    }

    public static ArrayList<WordsModel> getArrayListFamily() {
        // Create an ArrayList of WordsModel objects

        ArrayList<WordsModel> words = new ArrayList<WordsModel>();
        words.add(new WordsModel("hello this Family fragment ", "fgfgfgfg", R.drawable.ic_colors));
        words.add(new WordsModel("ghghghment ", "dfdfdfdf"));
        words.add(new WordsModel("hefgdfdfamily fragment ", "sdsdsdsd"));
        words.add(new WordsModel("heldfdfnt ", "3343434"));
        words.add(new WordsModel("hello this Family fragment ", "54545454", R.drawable.ic_house));
        words.add(new WordsModel("helldddfdfamily fragment ", "23232323"));
        words.add(new WordsModel("heldfdfragment ", "121212"));
        return words;

    }


    public static ArrayList<WordsModel> getArrayListNumbers() {
        // Create an ArrayList of WordsModel objects

        ArrayList<WordsModel> words = new ArrayList<WordsModel>();
        words.add(new WordsModel("Numbers", "اهلا", R.drawable.ic_numbers));
        words.add(new WordsModel("hi", "اهلا"));
        words.add(new WordsModel("yo", "اهلا"));
        words.add(new WordsModel("qwqwqwqw", "اهلا"));
        words.add(new WordsModel("wewew", "اهلا", R.drawable.ic_people));
        words.add(new WordsModel("woerererrds", "اهلا"));
        words.add(new WordsModel("rerer", "اهلا"));
        words.add(new WordsModel("rttrt", "اهلا"));
        words.add(new WordsModel("fgfgfgfg", "اهلا"));
        words.add(new WordsModel("hhhhh", "اهلا", R.drawable.ic_people2));
        words.add(new WordsModel("ggggg", "اهلا"));
        return words;
    }

    public static ArrayList<WordsModel> getArrayListPhrases() {
        // Create an ArrayList of WordsModel objects

        ArrayList<WordsModel> words = new ArrayList<WordsModel>();
        words.add(new WordsModel("phrases text", "text", R.drawable.ic_colors));
        words.add(new WordsModel("fgfgfgfg text", "ةيةيةية"));
        words.add(new WordsModel("dfdfdfdf text", "ةيةيةية"));
        words.add(new WordsModel("phrases ssdsdsd", "ةيةيةية"));
        words.add(new WordsModel("phrases text", "ةيةيةية"));
        words.add(new WordsModel("45454545 text", "ةيةيةية"));
        words.add(new WordsModel("454545 text", "text", R.drawable.ic_pen));
        return words;
    }


}
