package clase;

public class Medic extends PersonalSpital {
    private int spor;

    public Medic(String nume, int varsta, int salariu, int spor) {
        super(nume, varsta, salariu);
        this.spor = spor;
    }

    @Override
    public void descriere() {
        System.out.println(nume + " cu postul de medic, avand varsta "
                + varsta + " este angajatul spitalului, avand salariul "
                + salariu + " cu sporul " + spor + " .");
    }
}
