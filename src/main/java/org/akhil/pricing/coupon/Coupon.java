package org.akhil.pricing.coupon;

import org.akhil.domain.Money;

public interface Coupon extends Cloneable {
    Money apply(Money subTotal);
    Coupon clone();

}
