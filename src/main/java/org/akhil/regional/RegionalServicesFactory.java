package org.akhil.regional;

public interface RegionalServicesFactory {
    PaymentGateway paymentGateway();
    Invoice invoice();
    TaxCalculator taxCalculator();
}
