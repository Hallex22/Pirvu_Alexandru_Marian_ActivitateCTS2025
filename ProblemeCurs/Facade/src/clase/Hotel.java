package clase;

public class Hotel {
    private String denumire;
    private double pret;
    private int nrNopti;

    public Hotel(String denumire, double pret, int nrNopti) {
        this.denumire = denumire;
        this.pret = pret;
        this.nrNopti = nrNopti;
    }

    public void rezervaCamera() {
        System.out.println("A fost rezervata o camera la hotelul " + denumire
                + "pentru " + nrNopti + " nopti la pretul de " + pret);
    }
}
