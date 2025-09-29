package org.akhil.export;

import org.akhil.domain.Order;

public interface Exporter {
    ExportResult export(Order order);
}
