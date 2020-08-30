package com.notifications.app.library;

class FacebookNotifier extends BaseNotifier {

    public FacebookNotifier() {
        super();
    }

    public FacebookNotifier(BaseNotifier notifier) {
        super(notifier);
    }

    @Override
    public void send(String message) {
        sendNotifier(message);
        System.out.println("Hello from FacebookNotifier " + message);
    }
}
