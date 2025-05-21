package clase;

public class NotificatorEmail extends Notificator {
    @Override
    public void notificaClient(Client client, String mesaj) {
        if(client.getEmail() != null) {
            System.out.println("Clientul " + client.getNume() + " a primit mesajul " +
                    mesaj + " prin E-Mail.");
        } else {
            urmatorulNotificator.notificaClient(client, mesaj);
        }
    }
}
