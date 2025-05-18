package program;

import clase.Calator;
import clase.CardCalatorie;
import clase.IMetodaPlata;

public class Main {
    public static void main(String[] args) {
        IMetodaPlata cardCalatorie = new CardCalatorie(0);
        Calator calator = new Calator("Alex");
        calator.platesteBilet(3);

        calator.setMetodaPlata(cardCalatorie);
        calator.platesteBilet(3);

    }
}