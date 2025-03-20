package seminar04.SimpleFactory.clase;

import seminar04.SimpleFactory.clase.factory.Factory;
import seminar04.SimpleFactory.clase.factory.TipuriSupe;

public class Main {
    public static void main(String[] args) {
        Factory restaurant = new Factory(300, 5);
        Supa supa1 = restaurant.getSupa(TipuriSupe.LEGUME, "rosii, ceapa", 10);
        Supa supa2 = restaurant.getSupa(TipuriSupe.VITA, "ardei", 8);
        Supa supa3 = restaurant.getSupa(TipuriSupe.CIUPERCI, "opintici", 12);

        supa1.preparareSupa();
        supa2.preparareSupa();
        supa3.preparareSupa();
        System.out.println(supa1.calculeazaPret());
    }
}