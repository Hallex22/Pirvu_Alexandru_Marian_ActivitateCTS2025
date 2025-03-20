package seminar04.SimpleFactory.clase.factory;

import seminar04.SimpleFactory.clase.Supa;
import seminar04.SimpleFactory.clase.SupaCiuperci;
import seminar04.SimpleFactory.clase.SupaLegume;
import seminar04.SimpleFactory.clase.SupaVita;

public class Factory {

    private int gramaj;
    private double pretPerSutaGr;

    public Factory(int gramaj, double pretPerSutaGr) {
        this.gramaj = gramaj;
        this.pretPerSutaGr = pretPerSutaGr;
    }

    public Supa getSupa(TipuriSupe supa, String ingrediente, double extraSupa) {
        switch (supa){
            case LEGUME:
                SupaLegume supaLegume = new SupaLegume(gramaj, pretPerSutaGr, ingrediente, extraSupa);
                return supaLegume;
            case CIUPERCI:
                SupaCiuperci supaCiuperci = new SupaCiuperci(gramaj, pretPerSutaGr, ingrediente, extraSupa);
                return supaCiuperci;
            case VITA:
                SupaVita supaVita = new SupaVita(gramaj, pretPerSutaGr, ingrediente, extraSupa);
                return supaVita;
            default:
                return null;
        }
    }
}
