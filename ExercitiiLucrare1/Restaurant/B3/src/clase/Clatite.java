package clase;

public class Clatite extends Desert {
    private int nrClatite;
    public Clatite(double pret, String dataPreparare, String topping, int nrClatite) {
        super(pret, dataPreparare, topping);
        this.nrClatite = nrClatite;
    }
    @Override
    public void prepara() {
        System.out.println("Clatitele cu pretul " + getPret() +
                " avand " + nrClatite + " bucati au fost preparate la data de "
                + getDataPreparare());
    }
}
