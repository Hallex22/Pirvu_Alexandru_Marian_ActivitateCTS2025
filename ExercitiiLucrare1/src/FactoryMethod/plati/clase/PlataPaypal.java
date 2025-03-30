package FactoryMethod.plati.clase;

public class PlataPaypal extends Plata {
    private String email;

    public PlataPaypal(String emitator, String destinatar, double suma, String data, String email) {
        super(emitator, destinatar, suma, data);
        this.email = email;
    }
    @Override
    public void proceseazaPlata() {
        System.out.println(emitator + " a efectuat plata catre " + destinatar +
                " in cuantum de " + suma + " in data de " + data +
                " prin metoda paypal, avand email-ul: " + email);
    }
}
