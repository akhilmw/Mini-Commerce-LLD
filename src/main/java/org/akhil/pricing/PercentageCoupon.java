package org.akhil.pricing;

import org.akhil.domain.Money;

public class PercentageCoupon implements Coupon{


    private final int cap; // max percentage discount
    private final int percentage;


    public PercentageCoupon(int percent, int cap) {
        this.percentage = percent;
        this.cap = cap;

    }
    @Override
    public Money apply(Money subTotal) {

        int percentAmount = Math.min(percentage, cap);
        long discount = subTotal.getAmountMinor() * percentAmount / 100;
        long finalAmount = Math.max(0, subTotal.getAmountMinor() - discount);
        return new Money(finalAmount, subTotal.getCurrency());
    }

    @Override
    public Coupon clone() {
        try {
            return (Coupon) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Clone failed", e);
        }
    }
}
