package com.example.k00na_.shalomat.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.k00na_.shalomat.Activities.JokeContentActivity;
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

    public static JokeContentFragment newInstance(UUID jokeID){

        Bundle bundle = new Bundle();
        bundle.putSerializable("jokeID", jokeID);

        JokeContentFragment fragment = new JokeContentFragment();
        fragment.setArguments(bundle);

        return fragment;

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
      //  jokeID = (UUID) bundle.getSerializable("jokeID");
        jokeID = (UUID) getActivity().getIntent().getSerializableExtra("jokeIDForContentFragment");

        mCurrentCategory = JokeContentActivity.getJokesFromContentActivity();






        for(int j = 0; j<mCurrentCategory.size(); j++){

            UUID currentID = mCurrentCategory.get(j).getJokeID();

            Log.i("forLoop", "current UUID: " + currentID.toString() + " || Joke UUID " + jokeID.toString());

            if(mCurrentCategory.get(j).getJokeID().equals(jokeID)){
                mCurrentJoke = mCurrentCategory.get(j);
                break;
            }
        }

        // NEW SHIT...
        // test, test


        String currentJoke = mCurrentJoke.getJokeContent();

        mTextViewContent = (TextView)v.findViewById(R.id.jokeContentFragmentTextView);
        mTextViewContent.setText(currentJoke);


        return  v;

    }
}
