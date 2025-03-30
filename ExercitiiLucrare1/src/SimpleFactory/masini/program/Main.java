package SimpleFactory.masini.program;

import SimpleFactory.masini.clase.Masina;
import SimpleFactory.masini.factory.Factory;
import SimpleFactory.masini.factory.TipuriMasini;

public class Main {
    public static void main(String[] args) {
        Factory fabricaMasini = Factory.getInstance(10);
        Masina masina1 = fabricaMasini.getMasina(TipuriMasini.ELECTRICA, "Tesla",
                "B100ZEU", 2020, 4);
        Masina masina2 = fabricaMasini.getMasina(TipuriMasini.COMBUSTIE, "OpelAstra", "" +
                "SV25PAM", 2006, 7);

        masina1.cumpara();
        masina2.cumpara();

        Factory fabricaMasini2 = Factory.getInstance(20);
        System.out.println(fabricaMasini2.toString());
    }
}
