package program;

import clase.*;

public class Main {
    public static void main(String[] args) {
        IChallenge flotari = new Flotari();
        IChallenge salturi = new Salturi();
        IChallenge genoflexiuni = new Genoflexiuni();

        Abonat abonat = new Abonat("Andrei");
        abonat.executaProvocare();

        abonat.setProvocare(salturi);
        abonat.executaProvocare();
    }
}