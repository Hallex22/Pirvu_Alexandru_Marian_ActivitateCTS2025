package main;

import clase.AdaptorMedicamentClase;
import clase.Farmacie;
import clase.MedicamentFarmacie;

public class Main {
    public static void main(String[] args) {
        Farmacie catena = new Farmacie("Catena");

        MedicamentFarmacie medicamentFarmacie = new MedicamentFarmacie("Parasinus",
                49.99f,
                "04.05.2027",
                true);
        MedicamentFarmacie medicamentFarmacie2 = new MedicamentFarmacie("Tantum Verde",
                39.99f,
                "04.05.2027",
                true);
        catena.vindeMedicament(medicamentFarmacie);
        catena.vindeMedicament(medicamentFarmacie2);

        AdaptorMedicamentClase adaptorMedicamentClase =
                new AdaptorMedicamentClase("Parasinus", 49.99f);

        catena.vindeMedicament(adaptorMedicamentClase);
    }
}