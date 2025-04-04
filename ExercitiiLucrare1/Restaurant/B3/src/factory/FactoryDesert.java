package factory;

import clase.Clatite;
import clase.FelMancare;
import clase.Papanasi;

public class FactoryDesert implements IFactoryFelMancare {
    private double pret;
    private String dataPreparare;

    public FactoryDesert(double pret, String dataPreparare) {
        this.pret = pret;
        this.dataPreparare = dataPreparare;
    }

    @Override
    public FelMancare getFelMancare(IFeluriMancare felMancare, int extra) {
        if(felMancare instanceof TipuriDesert){
            TipuriDesert tipDesert = (TipuriDesert) felMancare;
            switch (tipDesert){
                case PAPANASI:
                    FelMancare papanasi = new Papanasi(pret, dataPreparare, "afine", extra);
                    return papanasi;
                case CLATITE:
                    FelMancare clatite = new Clatite(pret, dataPreparare, "capsuni", extra);
                    return clatite;
                default:
                    return null;
            }
        }
        return null;
    }
}
