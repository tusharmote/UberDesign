package Services;

import Models.Driver;
import Models.TripMetaData;

public interface DriverMatchingStrategy {
    Driver MatchDriver(TripMetaData tripMetaData);
}
