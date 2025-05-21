package bar;

public class Produs {
    private String denumire;
    private double pret;

    public Produs(String denumire, double pret) {
        this.denumire = denumire;
        this.pret = pret;
    }

    public void vanzare() {
        System.out.println("Produsul " + denumire + ",avand pretul " + pret
                + " RON a fost vandut");
    }

    public String getDenumire() {
        return denumire;
    }

    public double getPret() {
        return pret;
    }
}
