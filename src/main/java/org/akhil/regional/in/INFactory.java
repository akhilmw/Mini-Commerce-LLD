package org.akhil.regional.in;

import org.akhil.regional.Invoice;
import org.akhil.regional.PaymentGateway;
import org.akhil.regional.RegionalServicesFactory;
import org.akhil.regional.TaxCalculator;

public class INFactory implements RegionalServicesFactory {
    @Override
    public PaymentGateway paymentGateway() {
        return new RazorPayGateway();
    }

    @Override
    public Invoice invoice() {
        return new INInvoice();
    }

    @Override
    public TaxCalculator taxCalculator() {
        return new INSalesTaxCalculator();
    }
}
