package program;

import clase.Clasa;
import clase.Code;
import clase.Functie;

public class Main {
    public static void main(String[] args) throws Exception {
        Code clasaBaza = new Clasa("Clasa Baza");
        Code functie = new Functie("Functie primara");

        Code clasa1 = new Clasa("Clasa1");
        Code clasa2 = new Clasa("Clasa2");
        Code functie1 = new Functie("Functie1");
        Code functie2 = new Functie("Functie2");

        clasaBaza.adaugaNod(functie);
        clasa1.adaugaNod(functie1);
        clasa2.adaugaNod(functie2);
        clasaBaza.adaugaNod(clasa1);
        clasaBaza.adaugaNod(clasa2);

        clasaBaza.parsareCod();
    }
}