package clase;

public class NotificatorSMS extends Notificator{
    public NotificatorSMS() {
    }

    @Override
    public void setUrmatorulNotificator(Notificator urmatorulNotificator) {
        super.setUrmatorulNotificator(urmatorulNotificator);
    }

    @Override
    public void notifica(Client client, String mesaj) {
        if (client.getNrTelefon() != null) {
            System.out.println("Clientul " + client.getNume() + "primeste notificarea: "
                    + mesaj + " prin SMS.");
        } else {
            urmatorulNotificator.notifica(client, mesaj);
        }
    }
}
