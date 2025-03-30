package SimpleFactory.masini.clase;

public class MasinaElectrica extends Masina {
    private int garantieBaterie;

    public MasinaElectrica(String denumire, String nrInmatriculare, int anFabricatie, int garantieBaterie) {
        super(denumire, nrInmatriculare, anFabricatie);
        this.garantieBaterie = garantieBaterie;
    }

    @Override
    public void cumpara() {
        System.out.println("Masina " + denumire + " cu nr. de inmatriculare " +
                nrInmatriculare +  " cu motorizare electrica a fost achizitionata.");
    }
}
