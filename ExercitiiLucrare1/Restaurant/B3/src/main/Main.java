package main;

import clase.FelMancare;
import factory.FactoryDesert;
import factory.FactorySupa;
import factory.TipuriDesert;
import factory.TipuriSupe;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        FactorySupa restaurantSupe = FactorySupa.getInstance(25, new Date().toString());
        FactoryDesert restaurantDeserturi = new FactoryDesert(59.99, new Date().toString());

        FelMancare supa1 = restaurantSupe.getFelMancare(TipuriSupe.LEGUME, 100);
        FelMancare supa2 = restaurantSupe.getFelMancare(TipuriSupe.VITA, 60);
        supa1.prepara();
        supa2.prepara();

        FelMancare desert1 = restaurantDeserturi.getFelMancare(TipuriDesert.PAPANASI, 4);
        FelMancare desert2 = restaurantDeserturi.getFelMancare(TipuriDesert.CLATITE, 3);
        desert1.prepara();
        desert2.prepara();
    }
}