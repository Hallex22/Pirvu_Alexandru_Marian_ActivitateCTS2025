package clase;

public class Zbor {
    private int loc;
    private double pret;

    public Zbor(int loc, double pret) {
        this.loc = loc;
        this.pret = pret;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Zbor{");
        sb.append("loc=").append(loc);
        sb.append(", pret=").append(pret);
        sb.append('}');
        return sb.toString();
    }
}
