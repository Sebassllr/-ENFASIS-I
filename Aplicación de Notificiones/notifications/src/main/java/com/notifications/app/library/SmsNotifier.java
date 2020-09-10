package com.notifications.app.library;

class SmsNotifier extends BaseNotifier {

    public SmsNotifier(BaseNotifier notifier) {
        super(notifier);
    }

    @Override
    public void send(String message) {
        sendNotifier(message);
        System.out.println("Hello from SmsNotifier " + message);
    }
}
