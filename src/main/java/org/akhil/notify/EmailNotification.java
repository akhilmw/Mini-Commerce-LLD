package org.akhil.notify;

import org.akhil.domain.Customer;

public class EmailNotification implements Notification {

    @Override
    public void send(Customer to, String subject, String body) {
        System.out.printf("Sending email notification to %s on email %s : ", to.getName(), to.getEmail());
    }
}
