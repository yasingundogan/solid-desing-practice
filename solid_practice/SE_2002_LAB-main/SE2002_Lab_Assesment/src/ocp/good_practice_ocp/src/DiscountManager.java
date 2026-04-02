public class DiscountManager {
    public double apply(DiscountStrategy strategy, double price) {
        return strategy.apply(price);
    }
}

