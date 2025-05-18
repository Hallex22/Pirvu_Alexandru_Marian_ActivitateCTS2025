package program;

import clase.*;

public class Main {
    public static void main(String[] args) {
        InfoMijloc troleibuz = new Troleibuz();
        InfoMijloc autobuz = new Autobuz();
        InfoMijloc tramvai = new Tramvai();
        InfoMijloc metrou = new Metrou();

        troleibuz.setUrmMijloc(autobuz);
        autobuz.setUrmMijloc(tramvai);
        tramvai.setUrmMijloc(metrou);

        troleibuz.recomandaTransport(7);
        troleibuz.recomandaTransport(12);
    }
}