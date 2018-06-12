package com.gokhanaliccii.kata;

import static com.gokhanaliccii.kata.MovieGenres.COMEDY;
import static com.gokhanaliccii.kata.MovieGenres.HORROR;
import static com.gokhanaliccii.kata.MovieGenres.NEW;

/**
 * Movie Genres  [New, Horror, Fantastic]
 * Price table
 * New ----------> 4 lira for each day
 * Horror -------> 2 lira for each day
 * Comedy -------> 6 lira for each day
 */
public class RentalShop {

    private MovieService movieService;

    public RentalShop(MovieService movieService) {
        this.movieService = movieService;
    }

    public double calculatePrice(MovieGenres genres, int rentedDay) {
        return movieService.calculatePrice(genres.getAlgorithm(), rentedDay);
    }
}