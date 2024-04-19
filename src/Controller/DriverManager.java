package Controller;

import Models.Driver;
//import Models.driver;

import java.util.HashMap;

public class DriverManager {
    HashMap<String, Driver> driverHashMap = new HashMap<>();

    private DriverManager() {
    }
    private static DriverManager instance;


    public static DriverManager getInstance(){
        if (instance == null) {
            synchronized (DriverManager.class){
                if(instance==null)
                    instance = new DriverManager();
            }

        }
        return instance;
    }


    public void setDriver(String name,Driver driver)
    {
        driverHashMap.put(name,driver);
    }
    public Driver getDriver(String name) {
        return driverHashMap.get(name);
    }



    public HashMap<String, Driver> getDriverHashMap() {
        return driverHashMap;
    }
}
