package clase;

public abstract class Notificator {
    protected Notificator urmatorulNotificator;

    public Notificator() {
        this.urmatorulNotificator = null;
    }

    public void setUrmatorulNotificator(Notificator urmatorulNotificator) {
        this.urmatorulNotificator = urmatorulNotificator;
    }

    public abstract void notificaClient(Client client, String mesaj);
}
