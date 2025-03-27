package FactoryMethod.fabrici;

import FactoryMethod.clase.Angajat;

public interface FactoryPersonal {
    Angajat creareAngajat(TipPersonal tipPersonal);
}
