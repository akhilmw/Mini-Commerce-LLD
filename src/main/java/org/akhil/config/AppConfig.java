package org.akhil.config;

import org.akhil.domain.Region;

/**
 * Uses Singleton - DCL
 */
public class AppConfig {
    private static volatile AppConfig appConfig;
    private final Region region;
    private final String notifyType;
    private final String exporter;

    // TODO : dont hardcode use JSON loading
    private AppConfig () {
        this.region = Region.EU;
        this.notifyType = "Email";
        this.exporter = "shopify";
    }

    public static AppConfig getInstance() {
        if (appConfig == null) {
            synchronized (AppConfig.class) {
                if (appConfig == null) {
                    appConfig = new AppConfig();
                }
            }
        }
        return  appConfig;
    }

    public Region getRegion() {
        return this.region;
    }

    public String getNotifyType() {
        return this.notifyType;
    }

    public String getExporter() {
        return this.exporter;
    }
}
