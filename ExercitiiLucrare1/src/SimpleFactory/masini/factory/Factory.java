package SimpleFactory.masini.factory;

import SimpleFactory.masini.clase.Masina;
import SimpleFactory.masini.clase.MasinaCombustie;
import SimpleFactory.masini.clase.MasinaElectrica;

public class Factory {
    private int codFabrica;

    private Factory(int codFabrica) {
        this.codFabrica = codFabrica;
    }

    private static Factory instance = null;

    public static Factory getInstance(int codFabrica){
        if (instance == null){
            instance = new Factory(codFabrica);
        }
        return instance;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Factory{");
        sb.append("codFabrica=").append(codFabrica);
        sb.append('}');
        return sb.toString();
    }

    public Masina getMasina(TipuriMasini tipMasina, String denumire, String nrInmatriculare, int anFabricatie, int extra){

        switch (tipMasina){
            case COMBUSTIE:
                Masina masina = new MasinaCombustie(denumire, nrInmatriculare, anFabricatie, extra);
                return masina;
            case ELECTRICA:
                Masina masina1 = new MasinaElectrica(denumire, nrInmatriculare, anFabricatie, extra);
                return masina1;
            default:
                return null;
        }

    }
}
