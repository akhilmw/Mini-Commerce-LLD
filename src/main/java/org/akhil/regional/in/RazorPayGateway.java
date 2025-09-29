package org.akhil.regional.in;

import org.akhil.domain.Money;
import org.akhil.regional.ChargeResult;
import org.akhil.regional.PaymentGateway;

public class RazorPayGateway implements PaymentGateway {
    @Override
    public ChargeResult charge(Money amount, String currency, String token) {
        if (true) { //  IRL call the Razorpay API
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
