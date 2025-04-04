package clase;

public class SupaCiuperci extends Supa{
    private int cantitateCiuperci;

    public SupaCiuperci(double pret, String dataPreparare, int cantitateCiuperci) {
        super(pret, dataPreparare);
        this.cantitateCiuperci = cantitateCiuperci;
    }

    @Override
    public void prepara() {
        System.out.println("Supa de ciuperci cu pretul " + pret +
                " a fost preparata in data de " + dataPreparare);
    }
}
