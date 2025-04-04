package clase;

public class SupaVita extends Supa {
    private int cantiateVita;

    public SupaVita(double pret, String dataPreparare, int cantiateVita) {
        super(pret, dataPreparare);
        this.cantiateVita = cantiateVita;
    }

    @Override
    public void prepara() {
        System.out.println("Supa de vita cu pretul " + pret +
                " a fost preparata in data de " + dataPreparare);
    }
}
