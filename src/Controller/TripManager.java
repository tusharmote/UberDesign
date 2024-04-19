package Controller;

import Models.*;
import Services.DriverMatchingStartegyFactory;
import Services.DriverMatchingStrategy;
import Services.PriceCalculatorFactory;
import Services.PriceCalculatorStrategy;

import java.util.HashMap;

public class TripManager {
    HashMap <Integer,Trip> tripHashMap=new HashMap<>();
    private TripManager(){

    }
    private static TripManager instance=null;
    public static TripManager getInstance(){
        if (instance == null) {
            synchronized (Class.class){
                if(instance==null)
                    return new TripManager();
            }

        }
        return instance;
    }



      public void createTrip(Rider rider, Location starting_location,Location destination_location){
          TripMetaData metaData=new TripMetaData(rider.getRating(),starting_location,destination_location);
            PriceCalculatorStrategy priceCalculatorStrategy=PriceCalculatorFactory.getPriceCalculatorStrategy();
            int price=priceCalculatorStrategy.calculatePrice(rider,starting_location,destination_location);

          DriverManager driverManager=DriverManager.getInstance();

            DriverMatchingStrategy driverMatchingStrategy= DriverMatchingStartegyFactory.getDriverMatchingStrategy();
            System.out.println("hello tushar"+driverManager.getDriverHashMap().size());
            Driver driver=driverMatchingStrategy.MatchDriver(metaData);
            Trip trip=new Trip(rider,driver,starting_location,destination_location,price,priceCalculatorStrategy,driverMatchingStrategy);
            tripHashMap.put(trip.getTrip_id(), trip);
      }

    public HashMap<Integer, Trip> getTripHashMap() {
        return tripHashMap;
    }
}
