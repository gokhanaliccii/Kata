package com.gokhanaliccii.kata;

public enum  MovieGenres {
    NEW(4), HORROR(2), COMEDY(6);

    private final int rentPrice;

    MovieGenres(int price){
        this.rentPrice = price;
    }

    public int getRentalPrice() {
        return rentPrice;
    }
}
