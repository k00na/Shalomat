package com.example.k00na_.shalomat.Model;

import android.content.Context;

import java.util.ArrayList;
import java.util.UUID;

/**
 * Created by k00na_ on 26.8.2015.
 */
public class AppsSingleton {

    private static AppsSingleton sAppsSingleton;
    private Context mAppContext;
    private int currentCategoryInt;
    private ArrayList<Joke> currentJokeCategory;

    private AppsSingleton(Context context, int categoryInt){

        mAppContext = context;
        currentJokeCategory = new ArrayList<Joke>();


    }

    public static AppsSingleton get(Context c, int categoryInt){

        if(sAppsSingleton == null)
            sAppsSingleton = new AppsSingleton(c.getApplicationContext(), categoryInt);

        return sAppsSingleton;

    }

    public Joke getJoke(UUID id){
        for(Joke j : currentJokeCategory){
            if(j.getJokeID().equals(id)){
                return  j;
            }
        }

        return null;
    }







}
