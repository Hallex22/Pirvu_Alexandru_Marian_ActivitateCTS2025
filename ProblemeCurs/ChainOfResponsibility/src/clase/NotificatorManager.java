package clase;

public class NotificatorManager extends Notificator {
    public NotificatorManager() {
    }

    @Override
    public void setUrmatorulNotificator(Notificator urmatorulNotificator) {
        super.setUrmatorulNotificator(urmatorulNotificator);
    }

    @Override
    public void notifica(Client client, String mesaj) {
        System.out.println("Clientul " + client.getNume() + " nu are date de contact.");
    }
}
