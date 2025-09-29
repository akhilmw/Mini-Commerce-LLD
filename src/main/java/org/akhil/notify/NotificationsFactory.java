package org.akhil.notify;

import java.util.Map;
import java.util.function.Supplier;

public class NotificationsFactory {
    private static final Map<String, Supplier<Notification>> notifications = Map.of("EMAIL", EmailNotification::new , "SMS", SmsNotification::new);

    public static Notification get(String type) {
        if (notifications.containsKey(type)) {
            return notifications.get(type).get();
        } else {
            throw new IllegalArgumentException("Requested Notification Type does not exist!" + type);
        }
    }

}
