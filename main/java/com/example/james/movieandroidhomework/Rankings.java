package com.example.james.movieandroidhomework;

/**
 * Created by james on 03/07/2017.
 */

public class Rankings {

    private Movie[] topMovies;

    public Rankings(Movie[] moviesToAdd){
        this.topMovies = new Movie[10];
        this.setUpTopMovies(moviesToAdd);
    }

    private void setUpTopMovies(Movie[] movies){
        final int length = this.topMovies.length;
        for(int j=0; j<length; j++){
            Movie movie = movies[j];
            movie.setRanking(j+1);
            topMovies[j] = movie;
        }
    }

    public Movie getMovieByRank(int rank){
        return new Movie(topMovies[rank - 1]);
    }
}
