package program;

import clase.*;

public class Main {
    public static void main(String[] args) {
        Client client = new Client("Alex", null, null);

        Notificator notificatorSMS = new NotificatorSMS();
        Notificator notificatorEmail = new NotificatorEmail();
        Notificator notificatorManager = new NotificatorManager();
        notificatorSMS.setUrmatorulNotificator(notificatorEmail);
        notificatorEmail.setUrmatorulNotificator(notificatorManager);

        notificatorSMS.notificaClient(client, "Oferta la calamari!");
    }
}