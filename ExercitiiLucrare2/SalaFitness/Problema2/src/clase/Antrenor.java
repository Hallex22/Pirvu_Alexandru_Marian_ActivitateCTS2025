package clase;

public class Antrenor extends MetodaTratare {
    public Antrenor() {
    }
    @Override
    public FisaMedicala gestioneazaAccidentare(String nume, int gravitate) {
        if (gravitate <= 1) {
            System.out.println("Antrenorul a decis ca nu este vorba despre o accidentare");
            return null;
        } else {
            return urmatorulPas.gestioneazaAccidentare(nume, gravitate);
        }
    }
}
