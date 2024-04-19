package Controller;

import Models.Rider;

import java.util.HashMap;

public class RiderManager {
    HashMap<String,Rider> riderHashMap=new HashMap<>();

    private RiderManager() {

    }
    private static RiderManager  instance=null;
    public static RiderManager getInstance(){
        if (instance == null) {
            synchronized (Class.class){
                if(instance==null)
                    return new RiderManager();
            }

        }
        return instance;
    }

   public DriverManager mymethod(){
        DriverManager mm =  DriverManager.getInstance();
return mm;
   }

    public HashMap<String, Rider> getRiderHashMap() {
        return riderHashMap;
    }

    public Rider getRider(String name) {
        return riderHashMap.get(name);
    }

    public void setRider(String name,Rider rider) {
        riderHashMap.put(name,rider);
    }
}
