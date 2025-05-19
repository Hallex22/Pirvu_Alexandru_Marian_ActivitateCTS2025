package clase;

public class NotificatorEmail extends Notificator {
    public NotificatorEmail() {
    }

    @Override
    public void setUrmatorulNotificator(Notificator urmatorulNotificator) {
        super.setUrmatorulNotificator(urmatorulNotificator);
    }

    @Override
    public void notifica(Client client, String mesaj) {
        if (client.getEmail() != null) {
            System.out.println("Clientul " + client.getNume() + "primeste notificarea: "
                    + mesaj + " prin email.");
        } else {
            urmatorulNotificator.notifica(client, mesaj);
        }
    }
}
