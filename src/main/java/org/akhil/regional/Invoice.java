package org.akhil.regional;

import org.akhil.domain.Order;

public interface Invoice {
    String generate(Order order);
}
