package org.akhil.regional;

import org.akhil.domain.Money;
import org.akhil.domain.Order;

public interface TaxCalculator {
    Money taxFor(Order order);
}
