package org.akhil.regional;

public class ChargeResult {
    private final boolean success;
    private final String transactionId;
    private final String message;

    public ChargeResult(boolean success, String transactionId, String message) {
        this.success = success;
        this.transactionId = transactionId;
        this.message = message;
    }


}
