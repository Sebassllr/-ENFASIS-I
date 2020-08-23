package com.notifications.app.decorator.implementations;

import com.notifications.app.decorator.BaseNotifier;

public class SkypeNotifier extends BaseNotifier {

    public SkypeNotifier() {
        super();
    }

    public SkypeNotifier(BaseNotifier notifier) {
        super(notifier);
    }

    @Override
    public void send(String message) {
        sendNotifier(message);
        System.out.println("Hello from SkypeNotifier " + message);
    }
}
