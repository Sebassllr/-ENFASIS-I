package com.notifications.app;

import com.notifications.app.library.BaseNotifier;
import com.notifications.app.library.NotifierBuilder;

public class App {

    static Boolean cbSkype=true, cbMail=false, cbFacebook=true, cbSms=false;

    public static void main(String[] args) {
        NotifierBuilder notifierBuilder = new NotifierBuilder();
        if(cbSkype) notifierBuilder.Skype();
        if(cbMail) notifierBuilder.Mail();
        if(cbFacebook) notifierBuilder.Facebook();
        if(cbSms) notifierBuilder.Sms();
        notifierBuilder.build().send("Notificación");
    }
}
