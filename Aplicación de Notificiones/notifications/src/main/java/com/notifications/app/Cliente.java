package com.notifications.app;

import com.notifications.app.library.NotifierBuilder;

public class Cliente {

    static Boolean cbSkype=false, cbMail=false, cbFacebook=true, cbSms=false;

    public static void main(String[] args) {
        NotifierBuilder notifierBuilder = new NotifierBuilder();
        if(cbSkype) notifierBuilder.Skype();
        if(cbMail) notifierBuilder.Mail();
        if(cbFacebook) notifierBuilder.Facebook();
        if(cbSms) notifierBuilder.Sms();

        notifierBuilder.build().send("Notificación");

        new NotifierBuilder().Facebook().Sms().Mail().Skype().build().send("Otra notificación");
    }
}
