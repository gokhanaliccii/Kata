package com.gokhanaliccii.kata;

import org.hamcrest.core.IsEqual;
import org.junit.Test;

import static com.gokhanaliccii.kata.MovieGenres.COMEDY;
import static com.gokhanaliccii.kata.MovieGenres.HORROR;
import static com.gokhanaliccii.kata.MovieGenres.NEW;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.*;

/**
 * [Step1]
 * Price table
 * New ----------> 4 lira for each day
 * Horror -------> 2 lira for each day
 * Comedy ----> 6 lira for each day
 *
 * [Step2]
 * They came with new request. They decided
 * discount if user's will rent movie more than specified
 *
 * Updated Price Table
 * New------ More Than 3 day Apply %10 discount
 * Horror--- More Than 5 day Apply %15 discount
 * Comedy--- More Than 2 day Apply %3 discount
 *
 */



public class RentalShopTest {

    @Test
    public void should_CalculateNewMoviePriceCorrectly() {
        final double expectedPrice = 8d;
        RentalShop rentalShop = new RentalShop();
        double actualPrice = rentalShop.calculatePrice(NEW,2);

        assertThat(actualPrice, equalTo(expectedPrice));
    }

    @Test
    public void should_CalculateHorrorMovieRentPriceCorrectly(){
        final double expectedPrice = 10d;
        RentalShop rentalShop = new RentalShop();
        double actualPrice = rentalShop.calculatePrice(HORROR,5);

        assertThat(actualPrice, equalTo(expectedPrice));
    }

    @Test
    public void should_CalculateFantasticMovieRentPriceCorrectly(){
        final double expectedPrice = 6;
        RentalShop rentalShop = new RentalShop();
        double actualPrice = rentalShop.calculatePrice(COMEDY,1);

        assertThat(actualPrice, equalTo(expectedPrice));
    }

}