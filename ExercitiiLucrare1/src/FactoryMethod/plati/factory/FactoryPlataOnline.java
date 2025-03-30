package FactoryMethod.plati.factory;

import FactoryMethod.plati.clase.Plata;
import FactoryMethod.plati.clase.PlataCard;
import FactoryMethod.plati.clase.PlataPaypal;

public class FactoryPlataOnline implements FactoryPlata {
    private String emitator;
    private String destinatar;
    private double suma;
    private String data;

    private static FactoryPlataOnline instance = null;

    public static FactoryPlataOnline getInstance(String emitator, String destinatar, double suma, String data){
        if(instance == null) {
            instance = new FactoryPlataOnline(emitator, destinatar, suma, data);
        }
        return instance;
    }

    private FactoryPlataOnline(String emitator, String destinatar, double suma, String data) {
        this.emitator = emitator;
        this.destinatar = destinatar;
        this.suma = suma;
        this.data = data;
    }

    @Override
    public Plata getPlata(TipPlata tipPlata, String extra) {
        switch (tipPlata){
            case CARD:
                Plata plataCard = new PlataCard(emitator, destinatar, suma, data, extra);
                return plataCard;
            case PAYPAL:
                Plata plataPaypal = new PlataPaypal(emitator, destinatar, suma, data, extra);
                return plataPaypal;
            default:
                return null;
        }
    }
}
