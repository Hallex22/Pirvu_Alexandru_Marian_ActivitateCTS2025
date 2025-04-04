package factory;

import clase.FelMancare;
import clase.SupaLegume;
import clase.SupaVita;


public class FactorySupa implements IFactoryFelMancare {
    private double pret;
    private String dataPreparare;

    private static FactorySupa instance = null;

    public static FactorySupa getInstance(double pret, String dataPreparare){
        if(instance == null){
            instance = new FactorySupa(pret, dataPreparare);
        }
        return instance;
    }

    private FactorySupa(double pret, String dataPreparare) {
        this.pret = pret;
        this.dataPreparare = dataPreparare;
    }

    @Override
    public FelMancare getFelMancare(IFeluriMancare felMancare, int extra) {
        if (felMancare instanceof TipuriSupe){
            TipuriSupe tipSupa = (TipuriSupe) felMancare;
            switch (tipSupa){
                case LEGUME:
                    FelMancare supa = new SupaLegume(pret, dataPreparare, 20, extra);
                    return supa;
                    case VITA:
                    FelMancare supa1 = new SupaVita(pret, dataPreparare, 25, extra);
                    return supa1;
                    default:
                    return null;
            }
        }
        return null;
    }
}
