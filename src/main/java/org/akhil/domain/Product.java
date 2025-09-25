package org.akhil.domain;
import java.util.Map;
import java.util.UUID;

public class Product {

    private final UUID id;
    private final String name;

    private final Money price;

    // optionals - additional product attributes
    private final Map<String, String> attributes;

    public Product(UUID id, String name, Money price, Map<String, String> attributes) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.attributes = attributes == null ? Map.of() : Map.copyOf(attributes);
    }

    // getters
    public Money getPrice() {
        return price;
    }

}
