package clase;

public class SupaLegume extends Supa {
    private int cantitateLegume;

    public SupaLegume(double pret, String dataPreparare, int cantitateSmantana, int cantitateLegume) {
        super(pret, dataPreparare, cantitateSmantana);
        this.cantitateLegume = cantitateLegume;
    }

    @Override
    public void prepara() {
        System.out.println("Supa de legume cu pretul " + getPret() +
                " avand " + cantitateLegume +"g legume a fost preparata la data de "
                + getDataPreparare());
    }
}
