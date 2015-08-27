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

import java.util.UUID;

/**
 * Created by k00na_ on 27.8.2015.
 */
public class JokeContentFragment extends Fragment {


    public JokeContentFragment(){

    }

    public JokeContentFragment newInstance(UUID jokeID, int currentCatNum){



        Bundle args = new Bundle();
        args.putSerializable("jokeID", jokeID);
        args.putInt("currentCatNum", currentCatNum);


        JokeContentFragment jokeContentFragment = new JokeContentFragment();
        jokeContentFragment.setArguments(args);

        return jokeContentFragment;

    }


    private TextView mTextViewContent;
    private UUID jokeID;
    private Joke joke;
    private boolean isFaved;
    private int currentCatNum;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.joke_content_fragment, container, false);

        Bundle bundle = getArguments();
        jokeID = (UUID) bundle.getSerializable("jokeID");
        currentCatNum = bundle.getInt("currentCatNum");

      //  joke = AppsSingleton.get(getActivity()).getCurrentJokeCategory(currentCatNum)



        mTextViewContent = (TextView)v.findViewById(R.id.jokeContentFragmentTextView);


        return  v;

    }
}
