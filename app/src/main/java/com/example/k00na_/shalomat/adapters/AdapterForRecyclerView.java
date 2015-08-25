package com.example.k00na_.shalomat.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.k00na_.shalomat.Model.DummyData;
import com.example.k00na_.shalomat.Model.GostilniskeJokes;
import com.example.k00na_.shalomat.Model.Joke;
import com.example.k00na_.shalomat.R;

import java.util.ArrayList;

/**
 * Created by k00na_ on 25.8.2015.
 */
public class AdapterForRecyclerView extends RecyclerView.Adapter<JokeViewHolder> {

    private LayoutInflater mLayoutInflater;
    private ArrayList<Joke> mJokesList = new ArrayList<Joke>();

    public AdapterForRecyclerView(Context context, ArrayList<Joke> jokes){

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

        String actualString = mJokesList.get(i).getJokeContent();
        int textSize = actualString.length();
        if(textSize > 200)
            actualString = actualString.substring(0, 200) + " ...";


        else    // dodaj Stringu toliko presledkov, da bo dolg 200
            for(int j = actualString.length(); actualString.length()<200; j++){
                actualString = actualString + " ";
            }



        jokeViewHolder.jokePreviewText.setText(actualString);
        jokeViewHolder.rating.setText(mJokesList.get(i).getUserRating() + "");

        if(mJokesList.get(i).isFavorited())
            jokeViewHolder.favoritedIcon.setImageResource(R.drawable.ic_star_black_24dp);



    }



    @Override
    public int getItemCount() {
        return GostilniskeJokes.getGostilniskeJokes().size();
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


