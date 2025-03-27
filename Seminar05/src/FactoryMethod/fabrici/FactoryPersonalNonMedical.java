package FactoryMethod.fabrici;
import FactoryMethod.clase.Angajat;
import FactoryMethod.clase.Asistent;
import FactoryMethod.clase.Portar;
import FactoryMethod.clase.Secretar;


import static FactoryMethod.fabrici.TipPersonalNonMedical.PORTAR;
import static FactoryMethod.fabrici.TipPersonalNonMedical.SECRETAR;

public class FactoryPersonalNonMedical implements FactoryPersonal {
    private int vechime;

    public FactoryPersonalNonMedical(int vechime) {
        this.vechime = vechime;
    }

    public void setVechime(int vechime) {
        this.vechime = vechime;
    }

    @Override
    public Angajat creareAngajat(TipPersonalNonMedical tipPersonal, String nume, double salariu) {
        switch (tipPersonal) {
            case PORTAR:
                return new Portar(nume, salariu, vechime);
            case SECRETAR:
                return new Secretar(nume, salariu, vechime);
            default:
                return null;
        }
    }
}
