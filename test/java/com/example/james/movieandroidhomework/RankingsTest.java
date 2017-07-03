package com.example.james.movieandroidhomework;

import org.junit.Test;
import org.junit.Before;

import static org.junit.Assert.*;

/**
 * Created by james on 03/07/2017.
 */

public class RankingsTest {

    private Rankings rankings;

    @Before
    public void setup(){
        Movie[] movies = {
            new Movie("The Wizard Of Oz", Genre.FANTASY),
            new Movie("Death Note", Genre.MYSTERY),
            new Movie("Your Name", Genre.ROMANCE),
            new Movie("The Boy and the Beast", Genre.ACTION),
            new Movie("Lord of the Rings", Genre.FANTASY),
            new Movie("Forest Gump", Genre.COMEDY),
            new Movie("Star Wars", Genre.SCIENCE_FICTION),
            new Movie("Back to The Future", Genre.SCIENCE_FICTION),
            new Movie("Inception", Genre.ACTION),
            new Movie("Goodfellas", Genre.DRAMA),
            new Movie("The Lion King", Genre.ADVENTURE)
        };
        rankings = new Rankings(movies);
    }



}
