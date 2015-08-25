package com.example.k00na_.shalomat.Model;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by k00na_ on 25.8.2015.
 */
public class JokeArrays {

    public static ArrayList gostilniskeJokes = new ArrayList<String>();



    static String[] gostilniskeVersion1 = { "yoyoyoyoyoyoyooyoy asdasdasdasd a das da d, yoyoyoyoyoyoyooyoy asdasdasdasd a das da d, yoyoyoyoyoyoyooyoy asdasdasdasd a das da d, yoyoyoyoyoyoyooyoy asdasdasdasd a das da d, yoyoyoyoyoyoyooyoy asdasdasdasd a das da d",
            "yoyoyoyoyoyoyooyoy asdasdasdasd a das da d, yoyoyoyoyoyoyooyoy asdasdasdasd a das da d, yoyoyoyoyoyoyooyoy asdasdasdasd a das da d, yoyoyoyoyoyoyooyoy asdasdasdasd a das da d, yoyoyoyoyoyoyooyoy asdasdasdasd a das da d, yoyoyoyoyoyoyooyoy asdasdasdasd a das da d, yoyoyoyoyoyoyooyoy asdasdasdasd a das da d" +
                    ",yoyoyoyoyoyoyooyoy asdasdasdasd a das da d yoyoyoyoyoyoyooyoy asdasdasdasd a das da d yoyoyoyoyoyoyooyoy asdasdasdasd a das da d"
    };

    static String[] gostilniskeVersion2 = {"\"Natakar, temu golažu pa nekaj manjka!\" \"Nemogoče, saj smo vanj zmetali vse, kar je včeraj ostalo v kuhinji!\" ",
    "\"Natakar, ali je ta pečenka res svinjska?\" \"Seveda je, saj je kuharju dvakrat padla na tla.\""};



    public static ArrayList<Joke> getGostilniskeYo(){

        ArrayList<Joke> jokes = new ArrayList<Joke>();
        for(int i = 0; i<gostilniskeVersion1.length - 1; i++){

            String currentJoke = gostilniskeVersion1[i];
            currentJoke.length();

            String[] toBePassed = currentJoke.split(" ", 10);

            Joke joke = new Joke();
            joke.setJokeContent(toBePassed.toString());
            joke.setIsFavorited(false);
            jokes.add(joke);
        }

        return jokes;
    }





    public static ArrayList getGostilniskeJokes (){

        // add version 1
        for(int i = 0; i<gostilniskeVersion1.length; i++){
            gostilniskeJokes.add(gostilniskeVersion1[i]);
        }
        // add version 2
        /*
        for(int i = 0; i<gostilniskeVersion2.length; i++){
            gostilniskeJokes.add(gostilniskeVersion2[i]);
        }
        */
        return gostilniskeJokes;
    }

    public static ArrayList<Joke> gostilniskeJokeList(){

        ArrayList<Joke> jokes = new ArrayList<Joke>();
        for(int i = 0; i < gostilniskeJokes.size(); i++){
            Joke joke = new Joke();
            joke.setJokeContent(getGostilniskeJokes().get(i).toString());
            joke.setUserRating(3.2);
            joke.setIsFavorited(true);
            jokes.add(joke);
        }

        return jokes;
    }




}
