package clase;

public abstract class PersonalSpital {
    protected String nume;
    protected int varsta;
    protected double salariu;

    public PersonalSpital(String nume, int varsta, double salariu) {
        this.nume = nume;
        this.varsta = varsta;
        this.salariu = salariu;
    }

    public abstract void descriere();
}
