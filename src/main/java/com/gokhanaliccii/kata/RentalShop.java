package com.gokhanaliccii.kata;

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
        if (NEW == genres) {
            double price = rentedDay * 4;

            if (rentedDay > 3) {
                price = price * 0.9;
            }

            return price;
        }else if (HORROR == genres) {
            double price = rentedDay * 2;

            if (rentedDay > 5) {
                price = price * 0.85;
            }

            return price;
        }


        return genres.getRentalPrice() * rentedDay;
    }
}
