package program;

import clase.PachetCazare;
import clase.PachetCazareTransport;
import clase.PachetTransport;
import clase.PachetTuristic;

public class Main {
    public static void main(String[] args) {
        PachetTuristic pachetCazare = new PachetCazare(1);
        PachetTuristic pachetTransport = new PachetTransport(2);
        PachetTuristic pachetCazareTransport = new PachetCazareTransport(3);

        pachetCazare.vindePachet();
        System.out.println("-------------------------");
        pachetTransport.vindePachet();
        System.out.println("-------------------------");
        pachetCazareTransport.vindePachet();
    }
}