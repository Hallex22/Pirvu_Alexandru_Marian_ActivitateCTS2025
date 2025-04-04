package clase;

public class SupaVita extends Supa {
   private int cantitateVita;

    public SupaVita(double pret, String dataPreparare, int cantitateSmantana, int cantitateVita) {
        super(pret, dataPreparare, cantitateSmantana);
        this.cantitateVita = cantitateVita;
    }

    @Override
    public void prepara() {
        System.out.println("Supa de vita cu pretul " + getPret() +
                " avand " + cantitateVita +"g vita a fost preparata la data de "
                + getDataPreparare());
    }
}
