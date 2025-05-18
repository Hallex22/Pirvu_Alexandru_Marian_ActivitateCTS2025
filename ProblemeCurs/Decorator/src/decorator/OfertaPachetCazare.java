package decorator;

import clase.PachetTuristic;

public class OfertaPachetCazare extends OfertaPachetTuristic {

    public OfertaPachetCazare(PachetTuristic pachetTuristic) {
        super(pachetTuristic);
    }

    @Override
    public void anulareRezervare() {
        System.out.println("Rezervarea efectuata a fost anulata.");
    }
}
