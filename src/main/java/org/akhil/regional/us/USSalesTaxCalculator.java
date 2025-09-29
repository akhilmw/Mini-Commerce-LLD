package org.akhil.regional.us;

import org.akhil.domain.LineItem;
import org.akhil.domain.Money;
import org.akhil.domain.Order;
import org.akhil.regional.TaxCalculator;

import java.util.List;

public class USSalesTaxCalculator implements TaxCalculator {

    private final static double TAX_RATE = 0.07;
    @Override
    public Money taxFor(Order order) {
        long subTotal = 0L;
        List<LineItem> lineItems = order.getLineItems();
        for (LineItem lineItem : lineItems) {
            subTotal += lineItem.lineTotal().getAmountMinor();
        }
        long taxAmount = Math.round(subTotal * TAX_RATE);
        return new Money(taxAmount, "USD");
    }
}
