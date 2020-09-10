package com.notifications.app.library;

public abstract class BaseNotifier {

    protected BaseNotifier notifier;

    public BaseNotifier(BaseNotifier notifier) {
        this.notifier = notifier;
    }

    public abstract void send(String message);

    /**
     * Propaga la operación de notificación al objeto que está envuelto
     * @param notificationMessage
     */
    protected void sendNotifier(String notificationMessage) {
        if(this.notifier != null) this.notifier.send(notificationMessage);
    }
}
