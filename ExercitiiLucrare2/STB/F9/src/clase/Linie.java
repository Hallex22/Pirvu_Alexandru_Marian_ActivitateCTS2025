package clase;

public class Linie implements AutobuzLinie {
    private int nrLinie;
    private String primaStatie;
    private String ultimaStatie;

    public Linie(int nrLinie, String primaStatie, String ultimaStatie) {
        this.nrLinie = nrLinie;
        this.primaStatie = primaStatie;
        this.ultimaStatie = ultimaStatie;
    }

    public void descriereAutobuzLinie(Autobuz autobuz) {
        System.out.println("Autobuzul " + autobuz.getModel() + ", cu anul de fabricatie "
                + autobuz.getAnFabricatie() + " si nr. de locuri " + autobuz.getNrLocuri()
                + " circula pe linia " + nrLinie + ", avand prima statie: " + primaStatie
                + " si ultima statie " + ultimaStatie + ".");
    }
}
