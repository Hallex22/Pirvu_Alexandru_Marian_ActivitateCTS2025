package clase;

public class Ambulanta extends MetodaTratare {
    @Override
    public FisaMedicala gestioneazaAccidentare(String nume, int gravitate) {
        return new FisaMedicala(nume, gravitate, "Persoana a fost transportata la spital");
    }
}
