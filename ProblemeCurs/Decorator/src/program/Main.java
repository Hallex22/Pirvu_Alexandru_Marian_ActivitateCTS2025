package program;

import clase.PachetCazare;
import clase.PachetTuristic;
import decorator.OfertaPachetCazare;
import decorator.OfertaPachetTuristic;

public class Main {
    public static void main(String[] args) {
        PachetTuristic pachetTuristic = new PachetCazare();
        pachetTuristic.descriere();

        OfertaPachetTuristic ofertaPachetTuristic = new OfertaPachetCazare(pachetTuristic);
        ofertaPachetTuristic.anulareRezervare();


    }
}