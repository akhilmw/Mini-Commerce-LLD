package org.akhil.regional;

import org.akhil.domain.Money;

public interface PaymentGateway {
    ChargeResult charge(Money amount, String currency, String token);

}
