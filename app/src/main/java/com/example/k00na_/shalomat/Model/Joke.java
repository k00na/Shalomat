package com.example.k00na_.shalomat.Model;

/**
 * Created by k00na_ on 25.8.2015.
 */
public class Joke {

    private String jokeContent;
    private int timesFavorited;
    private double userRating;
    private boolean isFavorited = false;


    public Joke(String content, double userR, boolean favOrNot){

        jokeContent = content;
        userRating = userR;
        isFavorited = favOrNot;

    }



    /*
        GETTERS AND SETTERS
     */

    public boolean isFavorited() {
        return isFavorited;
    }

    public void setIsFavorited(boolean isFavorited) {
        this.isFavorited = isFavorited;
    }

    public String getJokeContent() {
        return jokeContent;
    }

    public void setJokeContent(String jokeContent) {
        this.jokeContent = jokeContent;
    }

    public int getTimesFavorited() {
        return timesFavorited;
    }

    public void setTimesFavorited(int timesFavorited) {
        this.timesFavorited = timesFavorited;
    }

    public double getUserRating() {
        return userRating;
    }

    public void setUserRating(double userRating) {
        this.userRating = userRating;
    }
}
