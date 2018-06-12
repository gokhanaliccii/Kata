package com.gokhanaliccii.kata;

public class MovieService {

    private final MovieRepository movieRepository;

    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    double calculateNewPrice(int rentedDay) {
        double price = rentedDay * movieRepository.getComedyPrice();

        if (rentedDay > 3) {
            price = price * 0.9;
        }

        return price;
    }

    double calculateHorrorPrice(int rentedDay) {
        double price = rentedDay * movieRepository.getHorrorPrice();

        if (rentedDay > 3) {
            price = price * 0.9;
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


}
