package Services;

import Models.Location;
import Models.Rider;

public interface PriceCalculatorStrategy {
    int  calculatePrice(Rider rider, Location starting_location, Location destination_location);

}
