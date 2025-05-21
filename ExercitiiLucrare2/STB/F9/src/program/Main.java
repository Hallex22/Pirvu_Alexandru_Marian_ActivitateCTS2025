package program;

import clase.Autobuz;
import clase.AutobuzLinie;
import clase.FabricaLinii;

public class Main {
    public static void main(String[] args) {
        FabricaLinii fabrica = new FabricaLinii();

        AutobuzLinie autobuzLinie = fabrica.getLinie(97, "Sfintii Voievozi", "Arena Nationala");
        AutobuzLinie autobuzLinie1 = fabrica.getLinie(97, "test", "test2");

        Autobuz autobuz1 = new Autobuz("Mercedes", 2020, 20);
        Autobuz autobuz2 = new Autobuz("Sollar", 2022, 19);

        autobuzLinie1.descriereAutobuzLinie(autobuz1);
        autobuzLinie1.descriereAutobuzLinie(autobuz2);
    }
}