package com.notifications.app;

import com.notifications.app.decorator.BaseNotifier;
import com.notifications.app.decorator.implementations.FacebookNotifier;
import com.notifications.app.decorator.implementations.MailNotifier;
import com.notifications.app.decorator.implementations.SkypeNotifier;
import com.notifications.app.decorator.implementations.SmsNotifier;

public class App {

    static Boolean cbSkype=true, cbMail=false, cbFacebook=true, cbSms=false;

    public static void main(String[] args) {

        BaseNotifier notifier = null;
        if(cbSkype) notifier = new SkypeNotifier(notifier);
        if(cbMail) notifier = new MailNotifier(notifier);
        if(cbFacebook) notifier = new FacebookNotifier(notifier);
        if(cbSms) notifier = new SmsNotifier(notifier);
        notifier.send("Hola Dani :)");
    }
}
