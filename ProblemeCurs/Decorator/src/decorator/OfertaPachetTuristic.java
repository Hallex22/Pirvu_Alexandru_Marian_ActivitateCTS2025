package decorator;

import clase.PachetTuristic;

public abstract class OfertaPachetTuristic {
    private PachetTuristic pachetTuristic;

    public OfertaPachetTuristic(PachetTuristic pachetTuristic) {
        this.pachetTuristic = pachetTuristic;
    }
    public void descriere() {
        pachetTuristic.descriere();
    }
    public abstract void anulareRezervare();
}
