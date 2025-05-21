package program;

import clase.ClientFactory;
import clase.IClient;
import clase.Rezervare;

// se repeta: nume, nrTelefon, email,
// optionale: nrMasa, nrPersoane, oraRezervare
public class Main {
    public static void main(String[] args) {
        ClientFactory clientFactory = new ClientFactory();
        IClient client1 = clientFactory.getClient("Alex", "123", "asdasd");
        IClient clientTest = clientFactory.getClient("Alex", "07n-amcartela", null);

        Rezervare rezervare1 = new Rezervare(2, 4, "12:00");
        Rezervare rezervare2 = new Rezervare(3, 5, "14:30");

        clientTest.descriereRezervare(rezervare1);
        System.out.println("-------");
        clientTest.descriereRezervare(rezervare2);


    }
}