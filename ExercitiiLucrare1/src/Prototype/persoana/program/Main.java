package Prototype.persoana.program;

import Prototype.persoana.clase.APersoana;
import Prototype.persoana.clase.Persoana;

public class Main {
    public static void main(String[] args) {
        APersoana persoanaPrototip = new Persoana(1.98, 77, "saten", "verde");
        APersoana persoana = persoanaPrototip.copiaza();
        System.out.println(persoana.toString());

        persoana.setInaltime(2.01);
        persoana.descriere();

        APersoana persoana2 = persoanaPrototip.copiaza();
        System.out.println(persoana2);
    }
}
