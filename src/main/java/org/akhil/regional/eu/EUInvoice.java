package org.akhil.regional.eu;

import org.akhil.domain.Order;
import org.akhil.regional.Invoice;

public class EUInvoice implements Invoice {
    @Override
    public String generate(Order order) {
        return order.toString(); // Sample Invoice (IRL generate a path to a file)
    }
}
