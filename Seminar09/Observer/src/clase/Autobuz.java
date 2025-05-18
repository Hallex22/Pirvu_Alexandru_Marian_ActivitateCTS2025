package clase;

public class Autobuz extends MijlocTransport {
    public Autobuz(int nrLinie) {
        super(nrLinie);
    }

    @Override
    public void pleacaDeLaCapat() {
        trimiteMesaj("Autobuzul cu numarul " + this.nrLinie + " pleaca de la capat.");
    }

    @Override
    public void schimbaTraseu() {
        trimiteMesaj("S-a schimbat traseul autobuzului de pe linia " + nrLinie + ".");
    }
}
