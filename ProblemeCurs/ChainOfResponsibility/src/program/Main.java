package program;

import clase.*;

public class Main {
    public static void main(String[] args) {
        Notificator notificatorSms = new NotificatorSMS();
        Notificator notificatorEmail = new NotificatorEmail();
        Notificator notificatorManager = new NotificatorManager();
        notificatorSms.setUrmatorulNotificator(notificatorEmail);
        notificatorEmail.setUrmatorulNotificator(notificatorManager);

        Client c1 = new Client("Alex", null, null);
        notificatorSms.notifica(c1, "Salut");
    }
}