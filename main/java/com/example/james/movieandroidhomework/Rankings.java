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
        movieToInsert.setRanking(rank);
        this.topMovies[rank - 1] = movieToInsert;
    }

    public void increaseRank(Movie movie){
        alterRank(movie, true);
    }

    public void decreaseRank(Movie movie){
        alterRank(movie, false);
    }

    private void alterRank(Movie movie, boolean increaseRank){
        int indexOfMovie = movie.getRanking() - 1;
        if(indexOfMovie == 0){
            return;
        }
        int swapIndex = increaseRank ? indexOfMovie - 1 : indexOfMovie + 1;
        swapMovies(indexOfMovie, swapIndex);
    }

    private void swapMovies(int index1, int index2){
        Movie temp = this.topMovies[index1];
        this.topMovies[index1] = this.topMovies[index2];
        this.topMovies[index2] = temp;
        Movie.swapMoviesRankingValues(topMovies[index1], topMovies[index2]);
    }

    private Movie getClonedMovie(Movie movie){
        return new Movie(movie);
    }

}
