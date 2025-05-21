package clase;

public class AutobuzNoapte implements IAutobuzNoapte {
    private int nrLinie;
    private int nrPasageri;
    private boolean esteRetras;

    public AutobuzNoapte(int nrLinie, int nrPasageri) {
        this.nrLinie = nrLinie;
        this.nrPasageri = nrPasageri;
        esteRetras = false;
    }

    @Override
    public void oprireInStatie() {
        if (!esteRetras) {
            System.out.println("Autobuzul de pe linia " + nrLinie + " a oprit in statie.");
        }
    }

    public int getNrLinie() {
        return nrLinie;
    }

    public int getNrPasageri() {
        return nrPasageri;
    }

    public boolean isEsteRetras() {
        return esteRetras;
    }

    public void setEsteRetras(boolean esteRetras) {
        this.esteRetras = esteRetras;
    }
}
