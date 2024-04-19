package Services;

public class PriceCalculatorFactory {
    public  static PriceCalculatorStrategy getPriceCalculatorStrategy(){
        return new RatingBasedPriceCalculatorStrategy();
    }
}
