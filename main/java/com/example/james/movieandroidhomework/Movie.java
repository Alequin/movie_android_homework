package com.example.james.movieandroidhomework;

/**
 * Created by james on 03/07/2017.
 */

public class Movie {

    private String title;
    private Genre genre;
    private int ranking;

    public Movie(String title, Genre genre){
        this.title = title;
        this.genre = genre;
        this.setRanking(0);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public int getRanking() {
        return ranking;
    }

    public void setRanking(int ranking) {
        if(ranking < 0 || ranking > 10){
            String message = "Ranking of " + ranking + " not valid";
            throw new IllegalArgumentException(message);
        }
        this.ranking = ranking;
    }

    public void resetRanking() {
        this.setRanking(0);
    }

    @Override
    public String toString() {
        String rankingText = "no ranking";
        if(this.ranking != 0){
            rankingText = Integer.toString(this.ranking);
        }
        String genreText = this.genre.toString().toLowerCase();
        return "Title - " + title + ", Genre - " + genreText + ", Ranking - " + rankingText;
    }
}
