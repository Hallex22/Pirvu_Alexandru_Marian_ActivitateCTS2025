package FactoryMethod.plati.factory;

import FactoryMethod.plati.clase.Plata;

public interface FactoryPlata {
    Plata getPlata(TipPlata tipPlata, String extra);
}
