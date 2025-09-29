package org.akhil.regional.us;

import org.akhil.domain.Money;
import org.akhil.regional.ChargeResult;
import org.akhil.regional.PaymentGateway;

public class StripeGateway implements PaymentGateway {
    @Override
    public ChargeResult charge(Money amount, String currency, String token) {
        if (true) { //  IRL call the Stripe API
            String transactionId  = "abcd1234"; // IRL get this from API call.
            String message = "Transaction Successful";
            return new ChargeResult(true, transactionId, message);
        } else {
            String transactionId  = "efgh9810"; // IRL get this from API call.
            String message = "Transaction Failed";
            return new ChargeResult(false, transactionId, message);
        }
    }
}
