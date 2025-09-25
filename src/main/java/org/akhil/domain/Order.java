package org.akhil.domain;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public final class Order {

    // mandatory
    private final UUID id;
    private final Customer customer;
    private final Region region;
    private final List<LineItem> lineItems;

    // optionals
    private final String couponCode;
    private final String shippingProfileKey;
    private final String giftMessage;
    private final String notes;
    private final Instant createdAt;

    // private constructor
    private Order(Builder orderBuilder) {
        this.id = orderBuilder.id;
        this.lineItems = List.copyOf(orderBuilder.lineItems);
        this.region = orderBuilder.region;
        this.customer = orderBuilder.customer;
        this.couponCode = orderBuilder.couponCode;
        this.giftMessage = orderBuilder.giftMessage;
        this.notes = orderBuilder.notes;
        this.shippingProfileKey = orderBuilder.shippingProfileKey;
        this.createdAt = orderBuilder.createdAt == null ? Instant.now() : orderBuilder.createdAt;
    }

    // getters for order


    public UUID getId() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Region getRegion() {
        return region;
    }

    public List<LineItem> getLineItems() {
        return lineItems;
    }

    public String getCouponCode() {
        return couponCode;
    }

    public String getShippingProfileKey() {
        return shippingProfileKey;
    }

    public String getGiftMessage() {
        return giftMessage;
    }

    public String getNotes() {
        return notes;
    }

    public Instant getCreatedAt() {
        return createdAt;
    }

    public static class Builder {
        // mandatory
        private UUID id;
        private final Customer customer;
        private final Region region;
        private final List<LineItem> lineItems = new ArrayList<>();

        // optionals
        private String couponCode;
        private  String shippingProfileKey;
        private  String giftMessage;
        private  String notes;
        private Instant createdAt;

        public Builder(Customer customer, Region region) {
            this.customer = customer;
            this.region = region;

        }

        // APIs to build other optionals

        public Builder addItem(LineItem lineItem) {
            if (lineItem != null) {
                this.lineItems.add(lineItem);
                return  this;
            } else {
                throw new IllegalArgumentException("line item cannot be null");
            }
        }

        public Builder addCoupon(String couponCode) {
            this.couponCode = couponCode;
            return this;
        }

        public Builder addShippingProfileKey(String shippingProfileKey) {
            this.shippingProfileKey = shippingProfileKey;
            return this;
        }

        public Builder addGiftMessage(String giftMessage) {
            this.giftMessage = giftMessage;
            return  this;
        }

        public Builder addNotes(String notes) {
            this.notes = notes;
            return  this;
        }

        public  Builder createdAt(Instant instant) {
            this.createdAt = instant;
            return this;
        }

        public Order build() {
            if (customer == null) {
                throw new IllegalArgumentException("customer required");
            }
            if (region == null) {
                throw new IllegalArgumentException("region required");
            }
            if (lineItems.isEmpty() ){
                throw new IllegalArgumentException("at least one line item required");
            }
            this.id = UUID.randomUUID();
            return new Order(this);
        }


    }

}
