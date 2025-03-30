package FactoryMethod.plati.clase;

public class PlataCard extends Plata {
    private String codCVV;
    public PlataCard(String emitator, String destinatar, double suma, String data, String codCVV) {
        super(emitator, destinatar, suma, data);
        this.codCVV = codCVV;
    }
    @Override
    public void proceseazaPlata() {
        System.out.println(emitator + " a efectuat plata catre " + destinatar +
                " in cuantum de " + suma + " in data de " + data +
                " prin metoda card cu codul CVV: " + codCVV);
    }
}
