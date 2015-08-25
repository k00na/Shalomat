package com.example.k00na_.shalomat.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.k00na_.shalomat.R;

import java.util.ArrayList;

/**
 * Created by k00na_ on 25.8.2015.
 */
public class AdapterForRecyclerView extends RecyclerView.Adapter<JokeViewHolder> {

    private LayoutInflater mLayoutInflater;
    private ArrayList mJokesList = new ArrayList<String>();

    public AdapterForRecyclerView(Context context, ArrayList<String> jokes){

        mLayoutInflater = LayoutInflater.from(context);
        mJokesList = jokes;

    }


    @Override
    public JokeViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {

        View v = mLayoutInflater.inflate(R.layout.joke_view_holder, viewGroup, false);
        JokeViewHolder jokeViewHolder = new JokeViewHolder(v);

        return jokeViewHolder;
    }

    @Override
    public void onBindViewHolder(JokeViewHolder jokeViewHolder, int i) {

        jokeViewHolder.jokePreviewText.setText("haha");



    }



    @Override
    public int getItemCount() {
        return 0;
    }
}

class JokeViewHolder extends RecyclerView.ViewHolder {

    TextView jokePreviewText;
    TextView rating;
    ImageView favoritedIcon;

    public JokeViewHolder(View itemView) {
        super(itemView);

        jokePreviewText = (TextView)itemView.findViewById(R.id.jokePreviewTextID);
        rating = (TextView)itemView.findViewById(R.id.ratingText);
        favoritedIcon = (ImageView)itemView.findViewById(R.id.favoritedIcon);

    }




}


