package com.example.k00na_.shalomat.Model;

import java.util.ArrayList;

/**
 * Created by k00na_ on 25.8.2015.
 */
public class DummyData  {



    public static ArrayList<Joke> getJokes(){

        ArrayList<Joke> jokes = new ArrayList<Joke>();

        for(int i = 0; i<100; i++){

            Joke joke = new Joke();
            joke.setIsFavorited(i % 2 == 0);
            joke.setUserRating(Math.round((Math.random() * 5)));
            if(i == 0 || i == 3 ||i == 5)
                joke.setJokeContent("Use tabs to organize content at a high level, for example, presenting different sections of a newspaper. " +
                    "Don’t use tabs for carousels or pagination of content. Those use cases involve viewing content, not navigating between groups of content." +
                    "a high level, for example, presenting different sections of a newspaper. \" +\n" +
                    "                    \"Don’t use tabs for carousels or pagination of content. Those use cases involve viewing content, not navigating between groups of content.");
            else
                joke.setJokeContent("Use tabs to organize content at a high level, for example, presenting different sections of a newspaper. " +
                        "Don’t use tabs for carousels or pagination of content. Those use cases involve viewing content, not navigating between groups of content." +
                        "a high level, for example, presenting different sections of a newspaper. ");


            jokes.add(joke);


        }

        return jokes;

    }

    public static ArrayList<Joke> gostilniskeJokes(){

        ArrayList<Joke> gostilniske = new ArrayList<Joke>();

        for(int i = 0; i<JokeArrays.getGostilniskeJokes().size(); i++){
            Joke joke = new Joke();

            joke.setJokeContent(JokeArrays.getGostilniskeJokes().get(i).toString());
            joke.setIsFavorited(true);
            joke.setUserRating(3.2);
            gostilniske.add(joke);

        }
        return gostilniske;
    }


}
