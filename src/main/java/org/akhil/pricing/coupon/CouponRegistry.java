package org.akhil.pricing.coupon;

import org.akhil.domain.Money;
import java.util.Map;

public class CouponRegistry {
    private static final Map<String, Coupon> coupons;

    static {
        coupons = Map.of("BF25", new PercentageCoupon(25, 50), "FLAT10", new FlatCoupon(1000L, 2000L));
    }

    public static Coupon get(String couponCode) {
        if (coupons.containsKey(couponCode)) {
            return coupons.get(couponCode).clone();
        } else {
            throw new IllegalArgumentException("coupon code does not exist");
        }
    }


    // temporary API : to be deleted
    @Deprecated
    public static Money applyCoupon(String couponCode, Money amount) {
        if (coupons.containsKey(couponCode)) {
            Coupon coupon = coupons.get(couponCode).clone();
            return coupon.apply(amount);
        } else {
            throw new IllegalArgumentException("coupon code does not exist");
        }
    }
}
