package org.akhil.regional.us;

import org.akhil.regional.Invoice;
import org.akhil.regional.PaymentGateway;
import org.akhil.regional.RegionalServicesFactory;
import org.akhil.regional.TaxCalculator;

public class USFactory implements RegionalServicesFactory {
    @Override
    public PaymentGateway paymentGateway() {
        return new StripeGateway();
    }

    @Override
    public Invoice invoice() {
        return new USInvoice();
    }

    @Override
    public TaxCalculator taxCalculator() {
        return new USSalesTaxCalculator();
    }
}
