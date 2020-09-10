package com.notifications.app.library;

class SkypeNotifier extends BaseNotifier {

    public SkypeNotifier(BaseNotifier notifier) {
        super(notifier);
    }

    @Override
    public void send(String message) {
        sendNotifier(message);
        System.out.println("Hello from SkypeNotifier " + message);
    }
}
