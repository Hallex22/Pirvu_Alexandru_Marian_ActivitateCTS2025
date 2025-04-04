package main;

import clase.Supa;
import factory.SupaFactory;
import factory.TipuriSupe;

public class Main {
    public static void main(String[] args) {
        SupaFactory supaFactory = new SupaFactory(24, 50);
        Supa supaLegume = supaFactory.getSupa(TipuriSupe.LEGUME);
        Supa supaCiuperci = supaFactory.getSupa(TipuriSupe.CIUPERCI);

        supaLegume.prepara();
        supaCiuperci.prepara();
    }
}