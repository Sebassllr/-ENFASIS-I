package com.notifications.app.library;

class MailNotifier extends BaseNotifier {

    public MailNotifier(BaseNotifier notifier) {
        super(notifier);
    }

    @Override
    public void send(String message) {
        sendNotifier(message);
        System.out.println("Hello from MailNotifier " + message);
    }
}
