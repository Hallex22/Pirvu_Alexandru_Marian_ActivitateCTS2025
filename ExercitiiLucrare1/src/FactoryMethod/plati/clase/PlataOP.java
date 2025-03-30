package FactoryMethod.plati.clase;

public class PlataOP extends Plata {
    private String numeBanca;
    public PlataOP(String emitator, String destinatar, double suma, String data, String numeBanca) {
        super(emitator, destinatar, suma, data);
        this.numeBanca = numeBanca;
    }
    @Override
    public void proceseazaPlata() {
        System.out.println(emitator + " a efectuat plata catre " + destinatar +
                " in cuantum de " + suma + " in data de " + data +
                " prin metoda OP (ordin de plata) la banca: " + numeBanca);
    }
}
