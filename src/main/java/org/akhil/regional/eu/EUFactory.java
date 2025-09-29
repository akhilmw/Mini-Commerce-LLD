package org.akhil.regional.eu;

import org.akhil.regional.Invoice;
import org.akhil.regional.PaymentGateway;
import org.akhil.regional.RegionalServicesFactory;
import org.akhil.regional.TaxCalculator;

public class EUFactory implements RegionalServicesFactory {
    @Override
    public PaymentGateway paymentGateway() {
        return new AydenGateway();
    }

    @Override
    public Invoice invoice() {
        return new EUInvoice();
    }

    @Override
    public TaxCalculator taxCalculator() {
        return new EUSalesTaxCalculator();
    }
}
