package clase;

public class NotificatorManager extends Notificator {
    @Override
    public void notificaClient(Client client, String mesaj) {
        System.out.println("Clientul nu are date de contact disponibile");
    }
}
