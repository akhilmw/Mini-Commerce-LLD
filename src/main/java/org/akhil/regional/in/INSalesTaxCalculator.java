package org.akhil.regional.in;

import org.akhil.domain.LineItem;
import org.akhil.domain.Money;
import org.akhil.domain.Order;
import org.akhil.regional.TaxCalculator;

import java.util.List;

public class INSalesTaxCalculator implements TaxCalculator {

    private final static double TAX_RATE = 0.18;

    @Override
    public Money taxFor(Order order) {
        long subTotal = 0L;
        List<LineItem> lineItems = order.getLineItems();
        for (LineItem lineItem : lineItems) {
            subTotal += lineItem.lineTotal().getAmountMinor();
        }
        long taxAmount = Math.round(subTotal * TAX_RATE);
        return new Money(taxAmount, "INR");
    }
}
