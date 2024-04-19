package Services;

public class DriverMatchingStartegyFactory {
    public static DriverMatchingStrategy getDriverMatchingStrategy(){
        return new leastTimeBasedDriverMatchingStrategy();
    }
}
