package org.akhil.pricing.shipping;

import org.akhil.domain.Money;

public interface ShippingProfile extends Cloneable {
    Money costFor(long weightKg, Money subTotal);
    ShippingProfile clone();
    String getName();
    int getSlaDays();

}
