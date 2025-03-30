package FactoryMethod.plati.factory;

import FactoryMethod.plati.clase.Plata;
import FactoryMethod.plati.clase.PlataNumerar;
import FactoryMethod.plati.clase.PlataOP;

public class FactoryPlataOffline implements FactoryPlata {
    private String emitator;
    private String destinatar;
    private double suma;
    private String data;

    private static FactoryPlataOffline instance = null;

    private FactoryPlataOffline(String emitator, String destinatar, double suma, String data) {
        this.emitator = emitator;
        this.destinatar = destinatar;
        this.suma = suma;
        this.data = data;
    }

    public static FactoryPlataOffline getInstance(String emitator, String destinatar, double suma, String data){
        if (instance==null){
            instance = new FactoryPlataOffline(emitator, destinatar, suma, data);
        }
        return instance;
    }

    public String getEmitator() {
        return emitator;
    }

    public void setEmitator(String emitator) {
        this.emitator = emitator;
    }

    public String getDestinatar() {
        return destinatar;
    }

    public void setDestinatar(String destinatar) {
        this.destinatar = destinatar;
    }

    public double getSuma() {
        return suma;
    }

    public void setSuma(double suma) {
        this.suma = suma;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("FactoryPlataOffline{");
        sb.append("emitator='").append(emitator).append('\'');
        sb.append(", destinatar='").append(destinatar).append('\'');
        sb.append(", suma=").append(suma);
        sb.append(", data='").append(data).append('\'');
        sb.append('}');
        return sb.toString();
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
