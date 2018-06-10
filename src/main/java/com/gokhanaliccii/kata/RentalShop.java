package com.gokhanaliccii.kata;

/**
 * Movie Genres  [New, Horror, Fantastic]
 * Price table
 * New ----------> 4 lira for each day
 * Horror -------> 2 lira for each day
 * Fantastic ----> 6 lira for each day
 */
public class RentalShop {


    public double calculatePrice(MovieGenres genres, int rentedDay) {
        if (genres == MovieGenres.NEW)
            return rentedDay * 4;
        else if (genres == MovieGenres.HORROR)
            return rentedDay * 2;

        return 0;
    }
}
