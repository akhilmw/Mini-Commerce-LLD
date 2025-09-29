package org.akhil.export;

public class ExportResult {

    private final boolean success;
    private final String refId;
    private final String message;

    public ExportResult(boolean success, String refId, String message) {
        this.success = success;
        this.refId = refId;
        this.message = message;
    }
}
