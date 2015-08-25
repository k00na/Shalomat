package com.example.k00na_.shalomat.Model;

import java.util.ArrayList;

/**
 * Created by k00na_ on 25.8.2015.
 */
public class GostilniskeJokes {


    static String[] jokesContent = {"V lokal pride Janez in vpraša natakarja: \"Kaj imate hladnega, da pogasim žejo?\" \"Oranžado, kokto, coca-colo, multi solo, ledeni čaj...\" \"Kar ice tea mi dajte!\" je naročil. \"Žal, tega pa nimamo!\" ",
    "\"Natakar, po mojem zrezku se sprehaja muha!\" \"Kar brez skrbi bodite, saj si je prej umila noge v vaši juhi!\" ",
            "\"Tisti ribji file, ki sem ga jedel pri vas pred mesecem dni je bil boljši, kot ta, ki ste mi ga postregli danes,\" je gost rekel natakarju. \"Nemogoče, saj je pripravljen iz iste ribe!\" se je začudil natakar."
    };

    public static ArrayList<Joke> getGostilniskeJokes(){

        ArrayList<Joke> jokesList = new ArrayList<Joke>();

        for(int i = 0; i<jokesContent.length; i++){
            Joke joke = new Joke();
            joke.setJokeContent(jokesContent[i]);

            jokesList.add(joke);

        }

        return jokesList;
    }

}
