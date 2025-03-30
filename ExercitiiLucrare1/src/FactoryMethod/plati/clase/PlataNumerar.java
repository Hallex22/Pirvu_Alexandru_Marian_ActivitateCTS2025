package FactoryMethod.plati.clase;

public class PlataNumerar extends Plata {
    private String locatie;

    public PlataNumerar(String emitator, String destinatar, double suma, String data, String locatie) {
        super(emitator, destinatar, suma, data);
        this.locatie = locatie;
    }

    @Override
    public void proceseazaPlata() {
        System.out.println(emitator + " a efectuat plata catre " + destinatar +
                " in cuantum de " + suma + " in data de " + data +
                " prin metoda numerar in locatia: " + locatie);
    }
}
