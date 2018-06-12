package com.gokhanaliccii.kata;

import java.util.function.BiFunction;

public class MovieService {

    private final MovieRepository movieRepository;

    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    double calculateNewPrice(int rentedDay) {
        double price = rentedDay * movieRepository.getNewMoviePrice();

        if (rentedDay > 3) {
            price = price * 0.9;
        }

        return price;
    }

    double calculateHorrorPrice(int rentedDay) {
        double price = rentedDay * movieRepository.getHorrorPrice();

        if (rentedDay > 5) {
            price = price * 0.85;
        }

        return price;
    }

    double calculateComedyPrice(int rentedDay) {
        double price = rentedDay * movieRepository.getComedyPrice();

        if (rentedDay > 2) {
            price = price * 0.7;
        }

        return price;
    }

    double calculatePrice(BiFunction<MovieService, Integer, Double> algorithm, int rentedDay) {
        return algorithm.apply(this, rentedDay);
    }
}
