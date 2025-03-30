package FactoryMethod.plati.factory;

import FactoryMethod.plati.clase.Plata;
import FactoryMethod.plati.clase.PlataNumerar;
import FactoryMethod.plati.clase.PlataOP;

public class FactoryPlataOffline implements FactoryPlata {
    private String emitator;
    private String destinatar;
    private double suma;
    private String data;

    public FactoryPlataOffline(String emitator, String destinatar, double suma, String data) {
        this.emitator = emitator;
        this.destinatar = destinatar;
        this.suma = suma;
        this.data = data;
    }

    @Override
    public Plata getPlata(TipPlata tipPlata, String extra) {
        switch (tipPlata) {
            case NUMERAR:
                return new PlataNumerar(emitator, destinatar, suma, data, extra);
            case OP:
                return new PlataOP(emitator, destinatar, suma, data, extra);
            default:
                return null;
        }
    }
}
