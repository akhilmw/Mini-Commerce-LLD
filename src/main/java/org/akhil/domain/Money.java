package org.akhil.domain;

public class Money {

    private long amountMinor;
    private final String currency;


    public Money(long amountMinor, String currency) {
        this.amountMinor = amountMinor;
        this.currency = currency;
    }

    // getters

    public long getAmountMinor() {
        return amountMinor;
    }

    public String getCurrency() {
        return currency;
    }
}
