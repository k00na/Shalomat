package com.example.k00na_.shalomat.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.k00na_.shalomat.Model.Joke;
import com.example.k00na_.shalomat.fragments.JokeContentFragment;

import java.util.ArrayList;
import java.util.UUID;

/**
 * Created by k00na_ on 28.8.2015.
 */
public class ViewPagerAdapter extends FragmentStatePagerAdapter {

    private ArrayList<Joke> mJokeArrayList;
    private UUID crimeID;
    private int mCurrentCatNum;


    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    public ViewPagerAdapter(FragmentManager fm, UUID crimeID, ArrayList<Joke> jokeObjects, int currentCategoryNum){
        super(fm);

        this.crimeID = crimeID;
        this.mJokeArrayList = jokeObjects;
        this.mCurrentCatNum = currentCategoryNum;
    };

    @Override
    public Fragment getItem(int position) {

        return JokeContentFragment.newInstance(crimeID, mCurrentCatNum, position);
    }

    @Override
    public int getCount() {
        return mJokeArrayList.size();
    }
}
