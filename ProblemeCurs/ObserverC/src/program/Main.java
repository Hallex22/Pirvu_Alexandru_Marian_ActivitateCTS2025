package program;

import clase.Agentie;
import clase.Client;
import clase.Observer;
import clase.Subject;

public class Main {
    public static void main(String[] args) {
        Subject agentie = new Agentie("TurismForAll");
        Observer client1 = new Client("Marcel");
        Observer client2 = new Client("Ion");
        Observer client3 = new Client("Alex");

        agentie.adaugaObserver(client1);
        agentie.adaugaObserver(client2);
        agentie.adaugaObserver(client3);
        agentie.trimiteNotificare("Oferta noua pentru vacanta in Grecia");

        System.out.println("--------------------");
        agentie.stergeObserver(client3);
        agentie.trimiteNotificare("Oferta noua pentru vacanta in Tenerife");
    }
}