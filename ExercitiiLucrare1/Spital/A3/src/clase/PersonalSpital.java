package clase;

public abstract class PersonalSpital {
    protected String nume;
    protected int varsta;
    protected int salariu;

    public PersonalSpital(String nume, int varsta, int salariu) {
        this.nume = nume;
        this.varsta = varsta;
        this.salariu = salariu;
    }

    public abstract void descriere();
}
