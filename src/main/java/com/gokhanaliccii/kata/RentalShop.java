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

    public double calculatePrice(MovieGenres genres, int rentedDay) {
        double price = genres.getRentalPrice() * rentedDay;


        if (NEW == genres) {
            if (rentedDay > 3) {
                price = price * 0.9;
            }
        } else if (HORROR == genres) {
            if (rentedDay > 5) {
                price = price * 0.85;
            }
        } else if (COMEDY == genres) {
            if (rentedDay > 2) {
                price = price * 0.7;
            }
        }

        return price;
    }
}
