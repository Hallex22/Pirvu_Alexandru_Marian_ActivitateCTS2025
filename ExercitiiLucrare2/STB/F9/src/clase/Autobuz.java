package clase;

public class Autobuz {
    private String model;
    private int anFabricatie;
    private int nrLocuri;

    public Autobuz(String model, int anFabricatie, int nrLocuri) {
        this.model = model;
        this.anFabricatie = anFabricatie;
        this.nrLocuri = nrLocuri;
    }

    public String getModel() {
        return model;
    }

    public int getAnFabricatie() {
        return anFabricatie;
    }

    public int getNrLocuri() {
        return nrLocuri;
    }
}
