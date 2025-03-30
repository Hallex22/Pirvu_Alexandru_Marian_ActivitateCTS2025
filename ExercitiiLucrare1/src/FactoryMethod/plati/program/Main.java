package FactoryMethod.plati.program;

import FactoryMethod.plati.clase.Plata;
import FactoryMethod.plati.factory.FactoryPlataOffline;
import FactoryMethod.plati.factory.FactoryPlataOnline;
import FactoryMethod.plati.factory.TipPlata;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        FactoryPlataOnline serviciuPlatiOnline = new FactoryPlataOnline("Alex",
                "Adi", 100, new Date().toString());
        FactoryPlataOffline plataOffline = new FactoryPlataOffline("Alex",
                "Adi", 150, new Date().toString());

        Plata plataCard = serviciuPlatiOnline.getPlata(TipPlata.CARD, "300");
        plataCard.proceseazaPlata();

        Plata plataNumerar = plataOffline.getPlata(TipPlata.NUMERAR, "Bucuresti");
        plataNumerar.proceseazaPlata();

    }
}
