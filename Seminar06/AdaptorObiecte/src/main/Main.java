package main;

import clase.AdaptorMedicamente;
import clase.MedicamentFarmacie;
import clase.MedicamentSpital;

public class Main {
    public static void vindeMedicament(MedicamentFarmacie medicamentFarmacie) {
        System.out.println("Bine ati venit la farmacia Dr. Max");
        medicamentFarmacie.cumparaMedicament();
    }

    public static void main(String[] args) {
        MedicamentFarmacie medicamentFarmacie1 = new MedicamentFarmacie("Supramax", 44.99f, "06.05.2025", true);
        MedicamentFarmacie medicamentFarmacie2 = new MedicamentFarmacie("Nurofen", 25.99f, "06.05.2025", true);
        vindeMedicament(medicamentFarmacie1);

        MedicamentSpital medicamentSpital = new MedicamentSpital("VitaminaC", 99.99f);
        AdaptorMedicamente adaptorMedicamente = new AdaptorMedicamente(medicamentSpital);

        vindeMedicament(new AdaptorMedicamente(medicamentSpital));
    }
}