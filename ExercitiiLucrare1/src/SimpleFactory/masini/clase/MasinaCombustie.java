package SimpleFactory.masini.clase;

public class MasinaCombustie extends Masina {
    private int consum;
    public MasinaCombustie(String denumire, String nrInmatriculare, int anFabricatie, int consum) {
        super(denumire, nrInmatriculare, anFabricatie);
        this.consum = consum;
    }

    public int getConsum() {
        return consum;
    }

    public void setConsum(int consum) {
        this.consum = consum;
    }

    @Override
    public void cumpara() {
        System.out.println("Masina " + denumire + " cu nr. de inmatriculare " +
                nrInmatriculare +  " cu motorizare pe combustie a fost achizitionata.");
    }
}
