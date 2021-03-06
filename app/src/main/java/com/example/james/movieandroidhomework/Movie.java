package com.example.james.movieandroidhomework;

/**
 * Created by james on 03/07/2017.
 */

public class Movie {

    private String title;
    private Genre genre;
    private MutableInteger ranking;

    public Movie(String title, Genre genre){
        this.title = title;
        this.genre = genre;
        this.ranking = new MutableInteger(0);
    }

    public Movie(Movie toClone){
        this(toClone.getTitle(), toClone.getGenre());
        this.ranking = toClone.getRankingObj();
    }

    public static void swapMoviesRankingValues(Movie movie1, Movie movie2){
        int tempRanking = movie1.getRanking();
        movie1.setRanking(movie2.getRanking());
        movie2.setRanking(tempRanking);
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
        return this.ranking.get();
    }

    private MutableInteger getRankingObj(){
        return this.ranking;
    }

    public void setRanking(int ranking) {
        if(ranking < 0 || ranking > 10){
            String message = "Ranking of " + ranking + " not valid";
            throw new IllegalArgumentException(message);
        }
        this.ranking.set(ranking);
    }

    public void resetRanking() {
        this.setRanking(0);
    }

    @Override
    public String toString() {
        String rankingText = "no ranking";
        if(this.ranking.get() != 0){
            rankingText = this.ranking.toString();
        }
        String genreText = this.genre.toString().toLowerCase();
        return "Title - " + title + ", Genre - " + genreText + ", Ranking - " + rankingText;
    }

    public boolean equals(Movie toCompare) {
        return this.title.equals(toCompare.title) &&
            this.genre == toCompare.getGenre() &&
            this.ranking.equals(toCompare.getRanking());
    }
}
