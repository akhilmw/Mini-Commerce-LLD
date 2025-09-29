package org.akhil.notify;

import org.akhil.domain.Customer;

public class SmsNotification implements Notification {
    @Override
    public void send(Customer to, String subject, String body) {
        System.out.printf("Sending sms notification to %s on number %s : ", to.getName(), to.getPhone());
    }
}
