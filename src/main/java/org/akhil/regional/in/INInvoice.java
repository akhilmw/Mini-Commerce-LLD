package org.akhil.regional.in;

import org.akhil.domain.Order;
import org.akhil.regional.Invoice;

public class INInvoice implements Invoice {
    @Override
    public String generate(Order order) {
        return order.toString(); // Sample Invoice (IRL generate a path to a file)
    }
}
