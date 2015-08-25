package com.example.k00na_.shalomat.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.k00na_.shalomat.MainActivity;
import com.example.k00na_.shalomat.fragments.ListOfItemsFragment;

/**
 * Created by k00na_ on 24.8.2015.
 */
public class AdapterForTabs extends FragmentStatePagerAdapter {

    private static final String[] namesOfTabs = {"Najnovejši", "Najboljši", "Naključni"};


    public AdapterForTabs(FragmentManager fm, MainActivity mainActivity) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {

        Fragment fragment = ListOfItemsFragment.newInstance(position);


        return fragment;
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return namesOfTabs[position];
    }
}
