package clase;

public class NotificatorSMS extends Notificator {
    @Override
    public void notificaClient(Client client, String mesaj) {
        if(client.getNrTelefon() != null) {
            System.out.println("Clientul " + client.getNume() + " a primit mesajul " +
                    mesaj + " prin SMS.");
        } else {
            urmatorulNotificator.notificaClient(client, mesaj);
        }
    }
}
