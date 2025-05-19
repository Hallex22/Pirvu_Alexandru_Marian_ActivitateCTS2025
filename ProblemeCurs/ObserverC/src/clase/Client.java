package clase;

public class Client implements Observer {
    private String nume;

    public Client(String nume) {
        this.nume = nume;
    }

    @Override
    public void receptionareMesaj(String mesaj) {
        System.out.println("Salut, " + nume + ". Ai primit mesajul: " + mesaj);
    }
}
