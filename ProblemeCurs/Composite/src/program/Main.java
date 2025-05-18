package program;

import clase.Categorie;
import clase.ItemMeniu;
import clase.OptiuneMeniu;

public class Main {
    public static void main(String[] args) throws Exception {
        OptiuneMeniu garnituri = new Categorie("Garnituri");
        OptiuneMeniu cartofi = new ItemMeniu("Cartofi");
        OptiuneMeniu salata = new ItemMeniu("Salata");

        garnituri.adaugaOptiune(cartofi);
        garnituri.adaugaOptiune(salata);

        garnituri.getOptiune(1).descriere();
        garnituri.descriere();
        garnituri.stergeOptiune(salata);
        garnituri.descriere();
    }
}