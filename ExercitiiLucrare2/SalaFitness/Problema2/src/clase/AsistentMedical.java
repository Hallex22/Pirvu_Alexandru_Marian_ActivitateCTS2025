package clase;

public class AsistentMedical extends MetodaTratare {
    @Override
    public FisaMedicala gestioneazaAccidentare(String nume, int gravitate) {
        if (gravitate <= 3) {
            return new FisaMedicala(nume, gravitate,
                    "Asistentul medical trateaza accidentarea minora.");
        } else {
           return urmatorulPas.gestioneazaAccidentare(nume, gravitate);
        }
    }
}
