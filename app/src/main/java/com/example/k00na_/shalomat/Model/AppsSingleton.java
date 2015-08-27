package com.example.k00na_.shalomat.Model;

import android.content.Context;

import com.example.k00na_.shalomat.JokeCategories.BlondinkeJokes;
import com.example.k00na_.shalomat.R;

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

    private AppsSingleton(Context context){

        mAppContext = context;





    }

    public static AppsSingleton get(Context c){

        if(sAppsSingleton == null)
            sAppsSingleton = new AppsSingleton(c.getApplicationContext());

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

    public ArrayList<Joke> getCurrentJokeCategory(int categoryInt){

        switch (categoryInt){

            case(R.id.blondinke_navigation):{
                currentJokeCategory = BlondinkeJokes.getBlondinkeJokes();
                return currentJokeCategory;
            }
            case(R.id.gostilniske_navigation):{
                currentJokeCategory = GostilniskeJokes.getGostilniskeJokes();
                return currentJokeCategory;
            }
            default: {
                currentJokeCategory = new ArrayList<Joke>();
                return currentJokeCategory;
            }

        }
    }











}
