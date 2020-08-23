package com.notifications.app.decorator.implementations;

import com.notifications.app.decorator.BaseNotifier;

public class DanielaNotifier extends BaseNotifier {

    public DanielaNotifier() {
        super();
    }

    public DanielaNotifier(BaseNotifier notifier) {
        super(notifier);
    }

    @Override
    public void send(String message) {
        sendNotifier(message);
        System.out.println("Hello from DanielaNotifier " + message);
    }
}
