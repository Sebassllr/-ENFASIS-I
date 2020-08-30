package com.notifications.app.library;

public abstract class BaseNotifier {

    protected BaseNotifier notifier;

    public BaseNotifier() {}

    public BaseNotifier(BaseNotifier notifier) {
        this.notifier = notifier;
    }

    public abstract void send(String message);

    protected void sendNotifier(String message) {
        if(this.notifier != null) this.notifier.send(message);
    }
}
