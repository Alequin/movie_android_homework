package com.example.james.movieandroidhomework;

import org.junit.Test;
import org.junit.Before;

import static org.junit.Assert.*;

/**
 * Created by james on 03/07/2017.
 */

public class RankingsTest {

    private Rankings rankings;
    private Movie[] movies;

    @Before
    public void setup(){
        Movie[] temp = {
            new Movie("The Wizard Of Oz", Genre.FANTASY),
            new Movie("Death Note", Genre.MYSTERY),
            new Movie("Your Name", Genre.ROMANCE),
            new Movie("The Boy and the Beast", Genre.ACTION),
            new Movie("Lord of the Rings", Genre.FANTASY),
            new Movie("Forest Gump", Genre.COMEDY),
            new Movie("Star Wars", Genre.SCIENCE_FICTION),
            new Movie("Back to The Future", Genre.SCIENCE_FICTION),
            new Movie("Inception", Genre.ACTION),
            new Movie("Goodfellas", Genre.DRAMA)
        };
        movies = temp;
        rankings = new Rankings(movies);
    }

    @Test
    public void getMovieByRanking(){
        Movie result = null;
        result = rankings.getMovieByRank(1);
        assert(movies[0].equals(result));
        result = rankings.getMovieByRank(2);
        assert(movies[1].equals(result));
        result = rankings.getMovieByRank(3);
        assert(movies[2].equals(result));
    }

    @Test
    public void cangetMovieByTitleIfMovieIsPresent(){
        String title = "The Wizard Of Oz";
        Movie result = rankings.getMovieByTitle(title);
        assert(result.equals(movies[0]));
    }

    @Test
    public void cannotGetMovieByTitleIfMovieIsNotPresent(){
        String title = "The great movie of movies";
        Movie result = rankings.getMovieByTitle(title);
        assertEquals(null, result);
    }

    @Test
    public void canReplaceMovieAtSpecificRanking(){
        Movie extraMovie = new Movie("12 Angry Men", Genre.DRAMA);
        rankings.replaceAtRanking(3, extraMovie);
        assert(extraMovie.equals(rankings.getMovieByRank(3)));
    }

    @Test
    public void canReplaceMovieInLastPlace(){
        Movie extraMovie = new Movie("12 Angry Men", Genre.DRAMA);
        rankings.replaceLastPlace(extraMovie);
        assert(extraMovie.equals(rankings.getMovieByRank(10)));
    }
}
