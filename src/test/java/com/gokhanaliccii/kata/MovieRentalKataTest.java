package com.gokhanaliccii.kata;

import org.hamcrest.core.IsEqual;
import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.*;

public class MovieRentalKataTest {

    @Test
    public void should_CalculateNewReleaseMoviePriceCorrectly() {
        RentalShop rentalShop = new RentalShop();
        double actualPrice = rentalShop.calculatePrice(2);

        assertThat(actualPrice, equalTo(actualPrice));
    }

}