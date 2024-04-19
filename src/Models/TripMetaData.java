package Models;

public class TripMetaData {
    Rating riderRating;
    Rating driverRating;
    Location starting_location;
    Location destination_location;

    public TripMetaData(Rating riderRating, Location starting_location, Location destination_location) {
        this.riderRating = riderRating;
        driverRating = Rating.AVERAGE;
        this.starting_location = starting_location;
        this.destination_location = destination_location;
    }

    public Rating getRiderRating() {
        return riderRating;
    }

    public void setRiderRating(Rating riderRating) {
        this.riderRating = riderRating;
    }

    public Rating getDriverRating() {
        return driverRating;
    }

    public void setDriverRating(Rating driverRating) {
        this.driverRating = driverRating;
    }

    public Location getStarting_location() {
        return starting_location;
    }

    public void setStarting_location(Location starting_location) {
        this.starting_location = starting_location;
    }

    public Location getDestination_location() {
        return destination_location;
    }

    public void setDestination_location(Location destination_location) {
        this.destination_location = destination_location;
    }
}
