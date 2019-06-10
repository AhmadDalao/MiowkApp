package com.example.android.miowkapp;

public class WordsModel {


    //declare private data instead of public to ensure the privacy of data field of each class
    private String mTextEnglish;
    private String mTextTranslation;
    private int mImageResource;


    public WordsModel(String mTextEnglish , String mTextTranslation , int mImageResource){
        this.mTextEnglish = mTextEnglish;
        this.mTextTranslation = mTextTranslation;
        this.mImageResource = mImageResource;
    }

    public WordsModel(String mTextEnglish , String mTextTranslation){
        this.mTextEnglish = mTextEnglish;
        this.mTextTranslation = mTextTranslation;
    }

    //retrieve the english text

    public String getmTextEnglish(){
        return mTextEnglish;
    }
    //retrieve the translation

    public String getmTextTranslation(){
        return mTextTranslation;
    }

    //retrieve the image id
    public int getmImageResource(){
        return mImageResource;
    }





}
