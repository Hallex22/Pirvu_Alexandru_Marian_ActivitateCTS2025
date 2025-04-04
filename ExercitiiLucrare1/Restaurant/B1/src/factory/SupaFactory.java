package factory;

import clase.Supa;
import clase.SupaCiuperci;
import clase.SupaLegume;
import clase.SupaVita;

import java.util.Date;

public class SupaFactory {
    private double pret;
    private int extra;

    public SupaFactory(double pret, int extra) {
        this.pret = pret;
        this.extra = extra;
    }

    public void setPret(double pret) {
        this.pret = pret;
    }

    public void setExtra(int extra) {
        this.extra = extra;
    }

    public Supa getSupa(TipuriSupe tipSupa){
        switch (tipSupa){
            case LEGUME:
                Supa supa = new SupaLegume(pret, new Date().toString(), extra);
                return supa;
            case CIUPERCI:
                Supa supa1 = new SupaCiuperci(pret, new Date().toString(), extra);
                return supa1;
            case VITA:
                Supa supa2 = new SupaVita(pret, new Date().toString(), extra);
                return supa2;
            default:
                return null;
        }
    }
}
