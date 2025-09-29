package org.akhil.notify;

import org.akhil.domain.Customer;

public interface Notification {
    void send(Customer to, String subject, String body);
}
