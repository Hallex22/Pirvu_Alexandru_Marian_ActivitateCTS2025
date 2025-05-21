package clase;

public class Rezervare implements IRezervare {
    @Override
    public void efectuareRezervare(int nrPersoane) {
        System.out.println("S-a efectuat o rezervare pentru " + nrPersoane + " persoane.");
    }
}
