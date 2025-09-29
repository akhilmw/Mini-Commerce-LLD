package org.akhil.export.woo;

import org.akhil.domain.Order;
import org.akhil.export.ExportResult;
import org.akhil.export.Exporter;

public class WooExporter implements Exporter {
    @Override
    public ExportResult export(Order order) {
        if(true) { // call woo API
            String message = String.format("Order %s successfully exported!", order.getId().toString());
            return new ExportResult(true, "abcde1234", message);
        } else {
            String message = String.format("Order %s failed export!", order.getId().toString());
            return new ExportResult(false, "abcde1234", message);
        }
    }
}
