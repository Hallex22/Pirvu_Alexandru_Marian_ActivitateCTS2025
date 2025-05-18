package program;

import clase.FabricaDePachete;
import clase.IPachetTuristic;
import clase.Optionale;
import clase.PachetTuristic;

public class Main {
    public static void main(String[] args) {
        FabricaDePachete fabricaDePachete = new FabricaDePachete();
        Optionale optional1 = new Optionale(true, 4);
        Optionale optional2 = new Optionale(false, 3);
        Optionale optional3 = new Optionale(true, 2);
        IPachetTuristic pachetTuristic = (PachetTuristic) fabricaDePachete.getPachetTuristic(1);
        pachetTuristic.descrierePachetTuristic(optional2);
        pachetTuristic.descrierePachetTuristic(optional3);
    }
}