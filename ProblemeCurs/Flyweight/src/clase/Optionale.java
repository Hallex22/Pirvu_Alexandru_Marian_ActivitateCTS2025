package clase;

public class Optionale {
    private boolean cina;
    private int nrExcursii;
    public Optionale(boolean cina, int nrExcursii) {
        this.cina = cina;
        this.nrExcursii = nrExcursii;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Optionale{");
        sb.append("cina=").append(cina);
        sb.append(", nrExcursii=").append(nrExcursii);
        sb.append('}');
        return sb.toString();
    }
}
