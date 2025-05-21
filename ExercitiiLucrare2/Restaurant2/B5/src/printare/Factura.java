package printare;

public class Factura implements IPrintare {
    private double pret;
    private String data;

    public Factura(double pret, String data) {
        this.pret = pret;
        this.data = data;
    }
    @Override
    public void printeaza() {
        System.out.println("Factura in valoare de " + pret + " RON a fost printata la data de "
                + data);
    }

    public double getPret() {
        return pret;
    }

    public String getData() {
        return data;
    }
}
