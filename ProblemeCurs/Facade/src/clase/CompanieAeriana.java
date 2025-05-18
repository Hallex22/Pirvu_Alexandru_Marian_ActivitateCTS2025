package clase;

public class CompanieAeriana {
    private String denumire;

    public CompanieAeriana(String denumire) {
        this.denumire = denumire;
    }

    public Zbor rezervaBiletAvion(int loc, double pret) {
        return new Zbor(loc, pret);
    }
}
