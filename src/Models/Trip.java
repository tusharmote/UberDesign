package Models;

import Services.DriverMatchingStrategy;
import Services.PriceCalculatorStrategy;

public class Trip {
    int trip_id;
    Rider rider;
    Driver driver;
    Location starting_location;
   Location destination_location;
    int price;
    PriceCalculatorStrategy priceCalculatorStrategy;
    DriverMatchingStrategy nearestDriverStrategy;
    int next_trip_id=1;

    public Trip(Rider rider, Driver driver, Location starting_location, Location destination_location, int price, PriceCalculatorStrategy priceCalculatorStrategy, DriverMatchingStrategy nearestDriverStrategy) {
        this.rider = rider;
        this.driver = driver;
        this.starting_location = starting_location;
        this.destination_location = destination_location;
        this.price = price;
        this.priceCalculatorStrategy = priceCalculatorStrategy;
        this.nearestDriverStrategy = nearestDriverStrategy;
        trip_id=next_trip_id;
        next_trip_id++;
    }

    public int getTrip_id() {
        return trip_id;
    }
    public void displayTripDetails(){
        System.out.println("Trip ID--- "+trip_id);
        System.out.println("Rider--- "+rider.getName());
        System.out.println("Driver--- "+driver.getName());
        System.out.println("Starting From--- "+starting_location.toString());
        System.out.println("Rider--- "+destination_location.toString());
        System.out.println("Price for the trip--- "+price);

    }
}
