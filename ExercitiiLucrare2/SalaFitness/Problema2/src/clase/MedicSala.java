package clase;

public class MedicSala extends MetodaTratare {
    @Override
    public FisaMedicala gestioneazaAccidentare(String nume, int gravitate) {
        if (gravitate <= 5) {
            return new FisaMedicala(nume, gravitate,"Medicul salii trateaza accidentarea medie");
        } else {
            return urmatorulPas.gestioneazaAccidentare(nume, gravitate);
        }
    }
}
