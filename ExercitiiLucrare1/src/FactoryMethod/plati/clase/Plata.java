package FactoryMethod.plati.clase;

public abstract class Plata {
    protected String emitator;
    protected String destinatar;
    protected double suma;
    protected String data;

    public Plata(String emitator, String destinatar, double suma, String data) {
        this.emitator = emitator;
        this.destinatar = destinatar;
        this.suma = suma;
        this.data = data;
    }

    public abstract void proceseazaPlata();
}
