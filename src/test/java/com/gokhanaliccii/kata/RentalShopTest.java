package com.gokhanaliccii.kata;

import org.hamcrest.core.IsEqual;
import org.junit.Test;

import static com.gokhanaliccii.kata.MovieGenres.NEW;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.*;

/**
 * Price table
 * New ----------> 4 lira for each day
 * Horror -------> 2 lira for each day
 * Fantastic ----> 6 lira for each day
 */
public class RentalShopTest {

    @Test
    public void should_CalculateNewMoviePriceCorrectly() {
        final double expectedPrice = 8d;
        RentalShop rentalShop = new RentalShop();
        double actualPrice = rentalShop.calculatePrice(NEW,2);

        assertThat(actualPrice, equalTo(expectedPrice));
    }


}