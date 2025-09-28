package org.akhil.pricing.shipping;

import org.akhil.domain.Money;

public class StandardShippingProfile implements ShippingProfile {
    private static final String NAME = "STANDARD";
    private final long baseCost;
    private final long variablePerKg;
    private final int slaDays;


    public StandardShippingProfile (long baseCost, long variablePerKg, int slaDays) {
        this.baseCost = baseCost;
        this.variablePerKg = variablePerKg;
        this.slaDays = slaDays;
    }
    @Override
    public Money costFor(long weightKg, Money subTotal) {
        long cost = baseCost + variablePerKg * weightKg;
        return new Money(cost, subTotal.getCurrency());
    }

    @Override
    public ShippingProfile clone() {
        try {
            return (ShippingProfile) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public int getSlaDays() {
        return slaDays;
    }
}
