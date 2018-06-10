package com.gokhanaliccii.kata;

public enum  MovieGenres {
    NEW(4){
        @Override
        double calculatePrice(int rentedDay) {
            double price = rentedDay * getRentalPrice();

            if (rentedDay > 3) {
                price = price * 0.9;
            }

            return price;
        }
    }
    , HORROR(2){
        @Override
        double calculatePrice(int rentedDay) {
            double price = rentedDay * getRentalPrice();

            if (rentedDay > 5) {
                price = price * 0.85;
            }

            return price;
        }
    }
    , COMEDY(6){
        @Override
        double calculatePrice(int rentedDay) {
            double price = rentedDay * getRentalPrice();

            if (rentedDay > 2) {
                price = price * 0.7;
            }

            return price;
        }
    };

    private final int rentPrice;

    MovieGenres(int price){
        this.rentPrice = price;
    }

    public int getRentalPrice() {
        return rentPrice;
    }


    abstract double calculatePrice(int rentedDay);

}
