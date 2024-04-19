package Services;

import Models.Location;
import Models.Rating;
import Models.Rider;

public class RatingBasedPriceCalculatorStrategy implements PriceCalculatorStrategy{
    @Override
    public int calculatePrice(Rider rider, Location starting_location,Location destination_location) {
        if(rider.getRating()== Rating.GOOD||rider.getRating()==Rating.AVERAGE){
            return 55;
        }
        else return 65;
    }
}
