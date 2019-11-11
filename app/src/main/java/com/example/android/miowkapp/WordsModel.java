package com.example.android.miowkapp;

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
        words.add(new WordsModel("red", "weṭeṭṭi", R.drawable.color_red, R.raw.color_red));
        words.add(new WordsModel("green", "chokokki", R.drawable.color_green, R.raw.color_green));
        words.add(new WordsModel("brown", "ṭakaakki", R.drawable.color_brown, R.raw.color_brown));
        words.add(new WordsModel("gray", "ṭopoppi", R.drawable.color_gray, R.raw.color_gray));
        words.add(new WordsModel("black", "kululli", R.drawable.color_black, R.raw.color_black));
        words.add(new WordsModel("white", "kelelli", R.drawable.color_white, R.raw.color_white));
        words.add(new WordsModel("dusty yellow", "ṭopiisә", R.drawable.color_dusty_yellow, R.raw.color_dusty_yellow));
        words.add(new WordsModel("mustard yellow", "chiwiiṭә", R.drawable.color_mustard_yellow, R.raw.color_mustard_yellow));
        return words;
    }


    /*
    this method contains the array list for the family fragment
     */
    public static ArrayList<WordsModel> getArrayListFamily() {
        // Create an ArrayList of WordsModel objects

        ArrayList<WordsModel> words = new ArrayList<WordsModel>();
        words.add(new WordsModel("father", "әpә", R.drawable.family_father, R.raw.family_father));
        words.add(new WordsModel("mother", "әṭa",R.drawable.family_mother, R.raw.family_mother));
        words.add(new WordsModel("son", "angsi", R.drawable.family_son, R.raw.family_son));
        words.add(new WordsModel("daughter", "tune", R.drawable.family_daughter, R.raw.family_daughter));
        words.add(new WordsModel("older brother", "taachi", R.drawable.family_older_brother, R.raw.family_older_brother));
        words.add(new WordsModel("younger brother", "chalitti", R.drawable.family_younger_brother, R.raw.family_younger_brother));
        words.add(new WordsModel("older sister", "teṭe", R.drawable.family_older_sister, R.raw.family_older_sister));
        words.add(new WordsModel("younger sister", "kolliti", R.drawable.family_younger_sister, R.raw.family_younger_sister));
        words.add(new WordsModel("grandmother", "ama", R.drawable.family_grandmother, R.raw.family_grandmother));
        words.add(new WordsModel("grandfather", "paapa", R.drawable.family_grandfather, R.raw.family_grandfather));
        return words;

    }

    /*
        this method contains the array list for the numbers fragment
         */
    public static ArrayList<WordsModel> getArrayListNumbers() {
        // Create an ArrayList of WordsModel objects

        ArrayList<WordsModel> words = new ArrayList<WordsModel>();
        words.add(new WordsModel("one", "lutti", R.drawable.number_one, R.raw.number_one));
        words.add(new WordsModel("two", "ottiko", R.drawable.number_two, R.raw.number_two));
        words.add(new WordsModel("three", "tolookosu", R.drawable.number_three, R.raw.number_three));
        words.add(new WordsModel("four", "oyyisa", R.drawable.number_four, R.raw.number_four));
        words.add(new WordsModel("five", "massoka", R.drawable.number_five, R.raw.number_five));
        words.add(new WordsModel("six", "temmoka", R.drawable.number_six, R.raw.number_six));
        words.add(new WordsModel("seven", "kennekaku", R.drawable.number_seven, R.raw.number_seven));
        words.add(new WordsModel("eight", "kawinta", R.drawable.number_eight, R.raw.number_eight));
        words.add(new WordsModel("nine", "wo'e", R.drawable.number_nine, R.raw.number_nine));
        words.add(new WordsModel("ten", "na'accha", R.drawable.number_ten, R.raw.number_ten));

        return words;
    }


    /*
    this method contains the array list for the phrase fragment
     */

    public static ArrayList<WordsModel> getArrayListPhrases() {
        // Create an ArrayList of WordsModel objects

        ArrayList<WordsModel> words = new ArrayList<WordsModel>();
        words.add(new WordsModel("Where are you going?", "minto wuksus", R.raw.phrase_where_are_you_going));
        words.add(new WordsModel("What is your name?", "tinnә oyaase'nә", R.raw.phrase_what_is_your_name));
        words.add(new WordsModel("My name is...", "oyaaset...", R.raw.phrase_my_name_is));
        words.add(new WordsModel("How are you feeling?", "michәksәs?", R.raw.phrase_how_are_you_feeling));
        words.add(new WordsModel("I’m feeling good.", "kuchi achit", R.raw.phrase_im_feeling_good));
        words.add(new WordsModel("Are you coming?", "әәnәs'aa?", R.raw.phrase_are_you_coming));
        words.add(new WordsModel("Yes, I’m coming.", "hәә’ әәnәm", R.raw.phrase_yes_im_coming));
        words.add(new WordsModel("I’m coming.", "әәnәm", R.raw.phrase_im_coming));
        words.add(new WordsModel("Let’s go.", "yoowutis", R.raw.phrase_lets_go));
        words.add(new WordsModel("Come here.", "әnni'nem", R.raw.phrase_come_here));
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
