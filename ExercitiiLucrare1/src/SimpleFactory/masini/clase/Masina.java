package SimpleFactory.masini.clase;

public abstract class Masina {
    protected String denumire;
    protected String nrInmatriculare;
    protected int anFabricatie;

    public Masina(String denumire, String nrInmatriculare, int anFabricatie) {
        this.denumire = denumire;
        this.nrInmatriculare = nrInmatriculare;
        this.anFabricatie = anFabricatie;
    }

    public String getDenumire() {
        return denumire;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public String getNrInmatriculare() {
        return nrInmatriculare;
    }

    public void setNrInmatriculare(String nrInmatriculare) {
        this.nrInmatriculare = nrInmatriculare;
    }

    public int getAnFabricatie() {
        return anFabricatie;
    }

    public void setAnFabricatie(int anFabricatie) {
        this.anFabricatie = anFabricatie;
    }

    public abstract void cumpara();
}
