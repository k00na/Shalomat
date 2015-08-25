package com.example.k00na_.shalomat.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.k00na_.shalomat.R;
import com.example.k00na_.shalomat.ViewHolders.JokeViewHolder;

/**
 * Created by k00na_ on 25.8.2015.
 */
public class AdapterForRecyclerView extends RecyclerView.Adapter {

    private LayoutInflater mLayoutInflater;

    public AdapterForRecyclerView(Context context){

        mLayoutInflater = LayoutInflater.from(context);

    }


    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {

        View v = mLayoutInflater.inflate(R.layout.joke_view_holder, viewGroup, false);
        JokeViewHolder jokeViewHolder = new JokeViewHolder(v);

        return jokeViewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}


