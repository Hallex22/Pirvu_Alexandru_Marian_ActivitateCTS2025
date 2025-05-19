package program;

import clase.*;

public class Main {
    public static void main(String[] args) {
        MetodaTratare antrenor = new Antrenor();
        MetodaTratare asistentMedical = new AsistentMedical();
        MetodaTratare medicSala = new MedicSala();
        MetodaTratare ambulanta = new Ambulanta();
        antrenor.setUrmatorulPas(asistentMedical);
        asistentMedical.setUrmatorulPas(medicSala);
        medicSala.setUrmatorulPas(ambulanta);

        FisaMedicala fisa1 = antrenor.gestioneazaAccidentare("Alex", 1);
        FisaMedicala fisa2 = antrenor.gestioneazaAccidentare("Andrei", 4);
        FisaMedicala fisa3 = antrenor.gestioneazaAccidentare("Ion", 7);

        fisa2.descriere();
    }
}