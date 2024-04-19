package Services;

import Controller.DriverManager;
import Models.Driver;
import Models.TripMetaData;

public class leastTimeBasedDriverMatchingStrategy implements DriverMatchingStrategy{

    @Override
    public Driver MatchDriver(TripMetaData tripMetaData) {
        DriverManager driverManager=DriverManager.getInstance();
        if(driverManager.getDriverHashMap().isEmpty()){
            System.out.println(driverManager.getDriverHashMap().size());
            System.out.println("No Drivers Available");
        }
        else{
            return driverManager.getDriverHashMap().get("Aniket");
        }
        Driver o = null;
        return o;
    }
}
