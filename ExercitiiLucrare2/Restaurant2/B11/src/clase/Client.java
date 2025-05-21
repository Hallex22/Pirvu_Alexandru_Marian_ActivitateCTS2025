package clase;

public class Client {
    private String nume;
    private IPlata metodaPlata;

    public Client(String nume) {
        this.nume = nume;
        this.metodaPlata = new PlataCash();
    }

    public void setMetodaPlata(IPlata metodaPlata) {
        this.metodaPlata = metodaPlata;
    }

    public void plateste(double suma) {
        metodaPlata.efectuarePlata(suma);
    }
}
