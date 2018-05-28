package devfoundry.price_calculator;

import devfoundry.price_calculator.princing_strategy.PricingStrategy;

public class PriceCalculator {
    private PricingStrategy pricingStrategy;

    public void calculate(int price, boolean isSignedUpForNewsletter) {
        this.pricingStrategy.calculatePrice(price, isSignedUpForNewsletter);
    }

    public void setPricingStrategy(PricingStrategy pricingStrategy) {
        this.pricingStrategy = pricingStrategy;
    }
}