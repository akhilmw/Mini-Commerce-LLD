package org.akhil.pricing;

import org.akhil.domain.Money;

public class FlatCoupon implements Coupon {

    private final long cap; // maxDiscount
    private final long amount;

    public FlatCoupon(long amount, long cap) {
        this.amount = amount;
        this.cap = cap;
    }
    @Override
    public Money apply(Money subTotal) {

        long discountAmount = Math.min(amount, cap);
        long finalAmount = Math.max(0, subTotal.getAmountMinor() - discountAmount);
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
