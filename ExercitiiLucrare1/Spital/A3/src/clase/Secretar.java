package clase;

public class Secretar extends PersonalSpital {
    private int vechime;

    public Secretar(String nume, int varsta, int salariu, int vechime) {
        super(nume, varsta, salariu);
        this.vechime = vechime;
    }

    @Override
    public void descriere() {
        System.out.println(nume + " cu postul de brancardier, avand varsta "
                + varsta + " este angajatul spitalului, avand salariul "
                + salariu + " cu vechimea de " + vechime + " ani.");
    }
}
