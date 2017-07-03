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

    public Movie getMovieByTitle(String title) {
        for(Movie movie : topMovies){
            if(movie.getTitle().equals(title)){
                return getClonedMovie(movie);
            }
        }
        return null;
    }

    public Movie getMovieByRank(int rank){
        return getClonedMovie(topMovies[rank - 1]);
    }

    public void replaceLastPlace(Movie extraMovie) {
        this.replaceAtRanking(10, extraMovie);
    }

    public void replaceAtRanking(int rank, Movie movieToInsert) {
        this.topMovies[rank - 1] = movieToInsert;
    }

    private void swapMovies(int index1, int index2){
        Movie temp = this.topMovies[index1];
        this.topMovies[index1] = this.topMovies[index2];
        this.topMovies[index2] = temp;
    }

    private Movie getClonedMovie(Movie movie){
        return new Movie(movie);
    }

}
