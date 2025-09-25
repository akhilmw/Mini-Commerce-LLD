package org.akhil.pricing;

import org.akhil.domain.Money;

public interface Coupon extends Cloneable {
    Money apply(Money subTotal);
    Coupon clone();

}
