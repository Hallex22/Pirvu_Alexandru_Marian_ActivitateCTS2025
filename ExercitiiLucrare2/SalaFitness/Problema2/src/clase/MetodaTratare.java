package clase;

public abstract class MetodaTratare {
    MetodaTratare urmatorulPas;
    public MetodaTratare() {
        this.urmatorulPas = null;
    }

    public void setUrmatorulPas(MetodaTratare urmatorulPas) {
        this.urmatorulPas = urmatorulPas;
    }

    public abstract FisaMedicala gestioneazaAccidentare(String nume, int gravitate);

}
