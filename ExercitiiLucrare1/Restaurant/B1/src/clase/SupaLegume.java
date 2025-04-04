package clase;

public class SupaLegume extends Supa {
    private int cantitateLegume;
    public SupaLegume(double pret, String dataPreparare, int cantitateLegume) {
        super(pret, dataPreparare);
        this.cantitateLegume = cantitateLegume;
    }

    @Override
    public void prepara() {
        System.out.println("Supa de legume cu pretul " + pret +
                " a fost preparata in data de " + dataPreparare);
    }
}
