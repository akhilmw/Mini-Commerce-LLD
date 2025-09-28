package org.akhil.pricing.shipping;

import java.util.Map;

public class ShippingProfileRegistry {
    private static final Map<String, ShippingProfile> profiles;
    static  {
        profiles = Map.of("STANDARD", new StandardShippingProfile(100, 20, 5),
                "EXPRESS", new ExpressShippingProfile(200, 25, 2));
    }

    public static ShippingProfile get(String name) {
        if (profiles.containsKey(name)) {
            return profiles.get(name).clone();
        } else {
            throw new IllegalArgumentException("Unknown shipping profile: " + name);
        }
    }


}
