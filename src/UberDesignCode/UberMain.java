package UberDesignCode;

import Controller.DriverManager;
import Controller.RiderManager;
import Controller.TripManager;
import Models.*;
import java.util.*;

public class UberMain {
    public static void main(String[] args) {
        Rider tushar=new Rider(1,"Tushar", Rating.GOOD);
        Rider vaibhav=new Rider(2,"Vaibhav",Rating.AVERAGE);
        Rider shubham=new Rider(3,"Shubham",Rating.BAD);
        RiderManager riderManager= RiderManager.getInstance();
        riderManager.setRider("Tushar",tushar);
        riderManager.setRider("Vaibhav",vaibhav);
        riderManager.setRider("Shubham",shubham);

        Driver rushikesh=new Driver(1,"Rushikesh", Rating.GOOD);
        Driver aniket=new Driver(2,"Aniket", Rating.BAD);
        DriverManager driverManager=DriverManager.getInstance();
        //driverManager.getDriverHashMap().put("Aniket",aniket);

        driverManager.setDriver("Rushikesh",rushikesh);
        driverManager.setDriver("Aniket",aniket);
        System.out.println("getting size" + driverManager.getDriverHashMap().size());
        TripManager tripManager=TripManager.getInstance();
        System.out.println("Creating trip for Tushar from (0,0) to (10,10)");


        DriverManager rr = riderManager.mymethod();
        System.out.println("size is" +rr.getDriverHashMap().size());


        tripManager.createTrip(tushar,new Location(0,0),new Location(10,10));
        System.out.println("Creating trip for Vaibhav from (0,0) to (10,10)");
        tripManager.createTrip(vaibhav,new Location(0,0),new Location(10,10));
        Iterator itr=tripManager.getTripHashMap().entrySet().iterator();
        while(itr.hasNext()){
            Map.Entry mp=(Map.Entry) itr.next();
            Trip trip=(Trip)mp.getValue();
            trip.displayTripDetails();
        }
    }
}
