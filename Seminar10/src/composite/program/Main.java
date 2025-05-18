package composite.program;

import composite.clase.Departament;
import composite.clase.Sectie;
import composite.clase.Structura;

public class Main {
    public static void main(String[] args) {
        Structura departament1 = new Departament("pediatrie", 34);
        Structura departament2 = new Departament("icu", 23);
        Structura departament3 = new Departament("general", 14);

        Structura sectie1 = new Sectie("sectie1");
        Structura sectie2 = new Sectie("sectie2");
        Structura sectie3 = new Sectie("sectie3");

        try {
            departament3.adaugaStructura(departament1);
            departament3.adaugaStructura(departament2);

            departament1.adaugaStructura(sectie1);
            departament2.adaugaStructura(sectie2);
            departament3.adaugaStructura(sectie3);

            departament3.afiseazaDescriere();

        } catch (Exception e) {
            System.out.println("Exceptie aruncata: " + e.toString());
        }
    }
}