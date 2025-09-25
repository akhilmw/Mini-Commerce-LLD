package org.akhil.domain;

import java.util.UUID;

public class Customer {

    private final UUID id;
    private final String name;
    private final  String email;
    private final String phone;

    public Customer(UUID id, String name, String email, String phone) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    // getters
    public UUID getId() { return id; }

    public String getName() { return name; }

    public String getEmail() { return email; }

    public String getPhone() { return phone; }


}
