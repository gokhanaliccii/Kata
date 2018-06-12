package com.gokhanaliccii.kata;

import java.util.function.BiFunction;

public enum MovieGenres {
    NEW(MovieService::calculateNewPrice),
    HORROR(MovieService::calculateHorrorPrice),
    COMEDY(MovieService::calculateComedyPrice);

    MovieGenres(BiFunction<MovieService, Integer, Double> algorithm) {
        this.algorithm = algorithm;
    }

    private final BiFunction<MovieService, Integer, Double> algorithm;

    public BiFunction<MovieService, Integer, Double> getAlgorithm() {
        return algorithm;
    }
}
