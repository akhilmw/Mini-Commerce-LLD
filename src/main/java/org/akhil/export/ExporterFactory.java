package org.akhil.export;

import org.akhil.export.shopify.ShopifyExporter;
import org.akhil.export.woo.WooExporter;

import java.util.Map;
import java.util.function.Supplier;

public class ExporterFactory {
    private static final Map<String, Supplier<Exporter>> exporters = Map.of("shopify", ShopifyExporter::new, "woo", WooExporter::new);

    public static Exporter create(String exporter) {
        if (exporters.containsKey(exporter)) {
            return exporters.get(exporter).get();
        }else {
            throw new IllegalArgumentException("Unknown exporter: " + exporter);
        }
    }

}
