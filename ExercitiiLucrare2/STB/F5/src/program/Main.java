package program;

import clase.*;

public class Main {
    public static void main(String[] args) {
        IUsa usaFata = new UsaFata();
        IUsa usaMijloc = new UsaMijloc();
        IUsa usaSpate = new UsaSpate();

        FacadeUsi facadeUsi = new FacadeUsi(usaFata, usaMijloc, usaSpate);
        facadeUsi.forteazaUsa();
        facadeUsi.toggleEsteModulLiber();

        usaFata.descriereUsa();
    }
}