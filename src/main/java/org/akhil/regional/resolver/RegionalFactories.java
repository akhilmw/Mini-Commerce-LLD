package org.akhil.regional.resolver;

import org.akhil.domain.Region;
import org.akhil.regional.RegionalServicesFactory;
import org.akhil.regional.eu.EUFactory;
import org.akhil.regional.in.INFactory;
import org.akhil.regional.us.USFactory;

public class RegionalFactories {

    private static final EUFactory EU_FACTORY = new EUFactory();
    private static final INFactory IN_FACTORY = new INFactory();
    private static final USFactory US_FACTORY = new USFactory();

    public static RegionalServicesFactory byRegion(Region region) {
        if (region == Region.EU) {
            return EU_FACTORY;
        } else if (region == Region.US) {
            return US_FACTORY;
        } else if (region == Region.IN) {
            return IN_FACTORY;
        } else {
            throw new IllegalArgumentException("Region does not exist : " + region);
        }
    }
}
