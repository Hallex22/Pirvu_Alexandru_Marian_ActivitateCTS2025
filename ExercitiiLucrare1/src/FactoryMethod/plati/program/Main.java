package FactoryMethod.plati.program;

import FactoryMethod.plati.clase.Plata;
import FactoryMethod.plati.factory.FactoryPlataOffline;
import FactoryMethod.plati.factory.FactoryPlataOnline;
import FactoryMethod.plati.factory.TipPlata;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        FactoryPlataOnline serviciuPlatiOnline = FactoryPlataOnline.getInstance("Alex",
                "Adi", 100, new Date().toString());
        FactoryPlataOffline plataOffline = FactoryPlataOffline.getInstance("Alex",
                "Adi", 150, new Date().toString());

        Plata plataCard = serviciuPlatiOnline.getPlata(TipPlata.CARD, "300");
        plataCard.proceseazaPlata();

        Plata plataNumerar = plataOffline.getPlata(TipPlata.NUMERAR, "Bucuresti");
        plataNumerar.proceseazaPlata();

        FactoryPlataOffline plataOffline1 = FactoryPlataOffline.getInstance("Andrei",
                "Adi", 200, new Date().toString());
        plataOffline1.setSuma(69);

        System.out.println(plataOffline1.toString());
        plataNumerar.proceseazaPlata();

    }
}
