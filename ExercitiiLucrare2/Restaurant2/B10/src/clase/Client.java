package clase;

public class Client implements IClient {
    private String nume;
    private String nrTelefon;
    private String email;

    public Client(String nume, String nrTelefon, String email) {
        this.nume = nume;
        this.nrTelefon = nrTelefon;
        this.email = email;
    }

    @Override
    public void descriereRezervare(Rezervare rezervare) {
        System.out.println("Clientul " + nume + ", cu nr. de telefon "
                + nrTelefon  + " a rezervat masa: " + rezervare.getNrMasa()
                + " cu " + rezervare.getNrPersoane() + " persoane, la ora "
                + rezervare.getOraRezervare());
    }
}
