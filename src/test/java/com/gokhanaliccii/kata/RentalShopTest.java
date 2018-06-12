package com.gokhanaliccii.kata;

import javafx.beans.binding.Bindings;
import org.hamcrest.core.IsEqual;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import static com.gokhanaliccii.kata.MovieGenres.COMEDY;
import static com.gokhanaliccii.kata.MovieGenres.HORROR;
import static com.gokhanaliccii.kata.MovieGenres.NEW;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

/**
 * [Step1]
 * Price table
 * New ----------> 4 lira for each day
 * Horror -------> 2 lira for each day
 * Comedy ----> 6 lira for each day
 * <p>
 * [Step2]
 * They came with new request. They decided
 * discount if user's will rent movie more than specified
 * <p>
 * Updated Price Table
 * New------ More Than 3 day Apply %10 discount
 * Horror--- More Than 5 day Apply %15 discount
 * Comedy--- More Than 2 day Apply %30 discount
 * <p>
 * [Step3]
 * They want to update base price
 * without new update
 */


public class RentalShopTest {

    @Mock
    public MovieRepository movieRepository;
    @Mock
    public MovieService movieService;

    private RentalShop rentalShop;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);

        movieService = new MovieService(movieRepository);
        rentalShop = new RentalShop(movieService);
    }

    @Test
    public void should_CalculateNewMoviePriceCorrectly() {
        when(movieRepository.getNewMoviePrice()).thenReturn(4d);

        final double expectedPrice = 18d;
        double actualPrice = rentalShop.calculatePrice(NEW, 5);

        assertThat(actualPrice, equalTo(expectedPrice));
    }

    @Test
    public void should_CalculateHorrorMovieRentPriceCorrectly() {
        when(movieRepository.getHorrorPrice()).thenReturn(2d);

        final double expectedPrice = 17d;
        double actualPrice = rentalShop.calculatePrice(HORROR, 10);

        assertThat(actualPrice, equalTo(expectedPrice));
    }

    @Test
    public void should_CalculateFantasticMovieRentPriceCorrectly() {
        when(movieRepository.getComedyPrice()).thenReturn(6d);

        final double expectedPrice = 21;
        double actualPrice = rentalShop.calculatePrice(COMEDY, 5);

        assertThat(actualPrice, equalTo(expectedPrice));
    }

}