package clase;

public class PachetTransport implements IPachetTuristic {
    private Persoana persoana;

    public PachetTransport(Persoana persoana) {
        this.persoana = persoana;
    }

    public Persoana getPersoana() {
        return persoana;
    }

    @Override
    public void descriere() {
        System.out.println("Acesta este un pachet de transport");
    }

    @Override
    public void rezervaPachet() {
        System.out.println("Persoana " + persoana.getNume()
                + " cu varsta " + persoana.getVarsta()
                + " a rezervat pachetul de transport");
    }
}
