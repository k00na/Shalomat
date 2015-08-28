package com.example.k00na_.shalomat.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.k00na_.shalomat.Model.AppsSingleton;
import com.example.k00na_.shalomat.Model.Joke;
import com.example.k00na_.shalomat.R;

import java.util.ArrayList;
import java.util.UUID;

/**
 * Created by k00na_ on 27.8.2015.
 */
public class JokeContentFragment extends Fragment {


    public JokeContentFragment(){

    }

    public static JokeContentFragment newInstance(UUID jokeID, int currentCatNum, int currJokeNum){



        Bundle args = new Bundle();
        args.putSerializable("jokeID", jokeID);
        args.putInt("currentCatNum", currentCatNum);
        args.putInt("currJokeNum", currJokeNum);


        JokeContentFragment jokeContentFragment = new JokeContentFragment();
        jokeContentFragment.setArguments(args);

        return jokeContentFragment;

    }


    private TextView mTextViewContent;
    private UUID jokeID;
    private Joke mCurrentJoke;
    private boolean isFaved;
    private int currentCatNum;
    private ArrayList<Joke> mCurrentCategory;
    private int currentJokeNum;



    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.joke_content_fragment, container, false);

        Bundle bundle = getArguments();
        jokeID = (UUID) bundle.getSerializable("jokeID");
        currentCatNum = bundle.getInt("currentCatNum");
        currentJokeNum = bundle.getInt("currJokeNum", 0);

        mCurrentCategory = AppsSingleton.get(getActivity()).getCurrentJokeCategory(currentCatNum);
       // mCurrentJoke = AppsSingleton.get(getActivity()).getJoke(jokeID, mCurrentCategory);
        mCurrentJoke = mCurrentCategory.get(currentJokeNum);

        String currentJoke = mCurrentJoke.getJokeContent() + " work yo";

        mTextViewContent = (TextView)v.findViewById(R.id.jokeContentFragmentTextView);
        mTextViewContent.setText(currentJoke);


        return  v;

    }
}
