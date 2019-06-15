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

    /**
     * Miwok translation for the word
     */
    private String mTextTranslation;

    /**
     * Constant value that represents no image was provided for this word
     */
    private final static int Image = -1;

    /**
     * Image resource ID for the word
     */
    private int mImageResource = Image;

    /**
     * Audio resource ID for the word
     */
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
     * @param mAudio           the audio for each word is added this constructor is most likely to be used
     *                         in phrase fragment
     */
    public WordsModel(String mTextEnglish, String mTextTranslation, int mAudio) {
        this.mTextEnglish = mTextEnglish;
        this.mTextTranslation = mTextTranslation;
        this.mAudio = mAudio;
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
    retrieve and return the english text
     */

    public String getmTextEnglish() {
        return mTextEnglish;
    }

    /*
    retrieve  and return the translation
     */
    public String getmTextTranslation() {
        return mTextTranslation;
    }

    /*
     *     retrieve and return the image id
     */
    public int getmImageResource() {
        return mImageResource;
    }

    /*
     * retrieve and return the audio for each word
     */
    public int getmAudio() {
        return mAudio;
    }


    /*
    this method contains the array list for the colors fragment
     */
    public static ArrayList<WordsModel> getMyArrayListColors() {
        // Create an ArrayList of WordsModel objects

        ArrayList<WordsModel> words = new ArrayList<WordsModel>();
        words.add(new WordsModel("black", "test 2 test 2", R.drawable.color_black, R.raw.color_black));
        words.add(new WordsModel("brown", "test 2 test 2", R.drawable.color_brown, R.raw.color_brown));
        words.add(new WordsModel("dusty yellow", "test 2 test 2", R.drawable.color_dusty_yellow, R.raw.color_dusty_yellow));
        words.add(new WordsModel("gray", "test 2 test 2", R.drawable.color_gray, R.raw.color_gray));
        words.add(new WordsModel("green", "test 2 test 2", R.drawable.color_green, R.raw.color_green));
        words.add(new WordsModel("mustard yellow", "test 2 test 2", R.drawable.color_mustard_yellow, R.raw.color_mustard_yellow));
        words.add(new WordsModel("red", "test 2 test 2", R.drawable.color_red, R.raw.color_red));
        words.add(new WordsModel("white", "test 2 test 2", R.drawable.color_white, R.raw.color_white));
        return words;
    }


    /*
    this method contains the array list for the family fragment
     */
    public static ArrayList<WordsModel> getArrayListFamily() {
        // Create an ArrayList of WordsModel objects

        ArrayList<WordsModel> words = new ArrayList<WordsModel>();
        words.add(new WordsModel("father ", "fgfgfgfg", R.drawable.family_father, R.raw.family_father));
        words.add(new WordsModel("mother ", "dfdfdfdf", R.drawable.family_mother, R.raw.family_mother));
        words.add(new WordsModel("older sister ", "sdsdsdsd", R.drawable.family_older_sister, R.raw.family_older_sister));
        words.add(new WordsModel("older brother ", "3343434", R.drawable.family_older_brother, R.raw.family_older_brother));
        words.add(new WordsModel("grandfather ", "54545454", R.drawable.family_grandfather, R.raw.family_grandfather));
        words.add(new WordsModel("grandmother ", "23232323", R.drawable.family_grandmother, R.raw.family_grandmother));
        words.add(new WordsModel("son ", "121212", R.drawable.family_son, R.raw.family_son));
        return words;

    }

    /*
        this method contains the array list for the numbers fragment
         */
    public static ArrayList<WordsModel> getArrayListNumbers() {
        // Create an ArrayList of WordsModel objects

        ArrayList<WordsModel> words = new ArrayList<WordsModel>();
        words.add(new WordsModel("one", "اهلا", R.drawable.number_one, R.raw.number_one));
        words.add(new WordsModel("two", "اهلا", R.drawable.number_two, R.raw.number_two));
        words.add(new WordsModel("three", "hi", R.drawable.number_three, R.raw.number_three));
        words.add(new WordsModel("four", "h", R.drawable.number_four, R.raw.number_four));
        words.add(new WordsModel("five", "hh", R.drawable.number_five, R.raw.number_five));
        words.add(new WordsModel("six", "hhh", R.drawable.number_six, R.raw.number_six));
        words.add(new WordsModel("seven", "gghg", R.drawable.number_seven, R.raw.number_seven));
        words.add(new WordsModel("eight", "fgfg", R.drawable.number_eight, R.raw.number_eight));
        words.add(new WordsModel("nine", "dfdfdf", R.drawable.number_nine, R.raw.number_nine));
        words.add(new WordsModel("ten", "ssd", R.drawable.number_ten, R.raw.number_ten));
        return words;
    }


    /*
    this method contains the array list for the phrase fragment
     */

    public static ArrayList<WordsModel> getArrayListPhrases() {
        // Create an ArrayList of WordsModel objects

        ArrayList<WordsModel> words = new ArrayList<WordsModel>();
        words.add(new WordsModel("phrase are you coming", "text", R.raw.phrase_are_you_coming));
        words.add(new WordsModel("phrase_come_here", "ةيةيةية", R.raw.phrase_come_here));
        words.add(new WordsModel("phrase how are you feeling ", "ةيةيةية", R.raw.phrase_how_are_you_feeling));
        words.add(new WordsModel("im coming", "ةيةيةية", R.raw.phrase_im_coming));
        words.add(new WordsModel("im feeling good", "ةيةيةية", R.raw.phrase_im_feeling_good));
        words.add(new WordsModel("what is your name", "ةيةيةية", R.raw.phrase_what_is_your_name));
        words.add(new WordsModel("my name is ", "text", R.raw.phrase_my_name_is));
        return words;
    }


    @Override
    public String toString() {
        return "WordsModel{" +
                "mTextEnglish='" + mTextEnglish + '\'' +
                ", mTextTranslation='" + mTextTranslation + '\'' +
                ", mImageResource=" + mImageResource +
                ", mAudio=" + mAudio +
                '}';
    }
}
