package program;

import clase.Autobuz;
import clase.Calator;
import clase.MijlocTransport;
import clase.Observer;

public class Main {
    public static void main(String[] args) {
        MijlocTransport autobuz = new Autobuz(97);

        Observer calator = new Calator("Alex");
        Observer calator2 = new Calator("Andreea");
        Observer calator3 = new Calator("LeBron");

        autobuz.adaugaObservator(calator);
        autobuz.adaugaObservator(calator2);
        autobuz.adaugaObservator(calator3);

        autobuz.pleacaDeLaCapat();
        System.out.println("-----------------------");
        autobuz.schimbaTraseu();

        autobuz.stergeObservator(calator3);
        System.out.println("-----------------------");
        autobuz.pleacaDeLaCapat();
    }
}