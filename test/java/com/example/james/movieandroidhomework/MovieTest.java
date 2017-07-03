package com.example.james.movieandroidhomework;

import org.junit.Test;
import org.junit.Before;

import static org.junit.Assert.*;

/**
 * Created by james on 03/07/2017.
 */

public class MovieTest {

    private Movie movie;

    @Before
    public void setup(){
        movie = new Movie("The Movie", Genre.ACTION);
    }

    @Test
    public void canGetDetailsFromToStringWhenRankingZero(){
        String expected = "Title - The Movie, Genre - action, Ranking - no ranking";
        String result = movie.toString();
        assertEquals(expected, result);
    }

    @Test
    public void testRankingStartsAtZero(){
        assertEquals(0, movie.getRanking());
    }

    @Test
    public void resetRanking(){
        movie.resetRanking();
        assertEquals(0, movie.getRanking());
    }

    @Test
    public void canSetRankingBetweenOneAndTen(){
        for(int rank=1; rank <=10; rank++){
            movie.setRanking(rank);
            assertEquals(rank, movie.getRanking());
        }
    }

    @Test
    public void cannotSetRankingLessThanOne(){
        boolean pass = false;
        try {
            movie.setRanking(0);
        }catch(IllegalArgumentException ex){
            pass = true;
        }
        assert(pass);
    }

    @Test
    public void cannotSetRankingMoreThanTen(){
        boolean pass = false;
        try {
            movie.setRanking(11);
        }catch(IllegalArgumentException ex){
            pass = true;
        }
        assert(pass);
    }

    @Test
    public void canGetDetailsFromToStringWhenRankingfive(){
        movie.setRanking(5);
        String expected = "Title - The Movie, Genre - action, Ranking - 5";
        String result = movie.toString();
        assertEquals(expected, result);
    }

    @Test
    public void canCompareMovies(){
        Movie movie2 = movie = new Movie("The Movie", Genre.ACTION);
        assert(movie.equals(movie2));
    }
}
