package clase;

public class Papanasi extends Desert{
    private int nrPapanasi;

    public Papanasi(double pret, String dataPreparare, String topping, int nrPapanasi) {
        super(pret, dataPreparare, topping);
        this.nrPapanasi = nrPapanasi;
    }

    @Override
    public void prepara() {
        System.out.println("Papanasii cu pretul " + getPret() +
                " avand " + nrPapanasi +" bucati de papanasi au fost preparati la data de "
                + getDataPreparare());
    }
}
