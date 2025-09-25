package org.akhil.domain;



// A LineItem is just “one entry in an order” = a product + quantity.
public class LineItem {
    private final Product product;
    private final int quantity;

    public LineItem(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public Money lineTotal() {
        return  new Money(product.getPrice().getAmountMinor() * quantity, product.getPrice().getCurrency());
    }
}
