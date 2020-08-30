package com.notifications.app.library;

import com.notifications.app.library.exceptions.NotNotifierMethodSetException;

public class NotifierBuilder {

    private BaseNotifier notifier = null;

    public NotifierBuilder Skype() {
        notifier = new SkypeNotifier(notifier);
        return this;
    }

    public NotifierBuilder Facebook() {
        notifier = new FacebookNotifier(notifier);
        return this;
    }

    public NotifierBuilder Mail() {
        notifier = new MailNotifier(notifier);
        return this;
    }

    public NotifierBuilder Sms() {
        notifier = new SmsNotifier(notifier);
        return this;
    }

    public BaseNotifier build() {
        if(notifier == null) {
            throw new NotNotifierMethodSetException("No notification method set");
        }
        return notifier;
    }
}
