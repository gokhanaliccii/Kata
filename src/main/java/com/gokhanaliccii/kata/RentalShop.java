package com.gokhanaliccii.kata;

/**
 * Movie Genres  [New, Horror, Fantastic]
 * Price table
 * New ----------> 4 lira for each day
 * Horror -------> 2 lira for each day
 * Comedy -------> 6 lira for each day
 */
public class RentalShop {

    public double calculatePrice(MovieGenres genres, int rentedDay) {
        return genres.getRentalPrice() * rentedDay;
    }
}
