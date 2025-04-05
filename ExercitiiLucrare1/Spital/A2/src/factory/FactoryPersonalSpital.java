package factory;

import clase.Asistent;
import clase.Brancardier;
import clase.Medic;
import clase.PersonalSpital;

public class FactoryPersonalSpital {
    public PersonalSpital getPersonalSpital(TipPersonalSpital tipPersonalSpital, String nume, int varsta, double salariu, int spor){
        switch (tipPersonalSpital){
            case MEDIC:
                PersonalSpital medic = new Medic(nume, varsta, salariu, spor);
                return medic;
            case ASISTENT:
                PersonalSpital asistent = new Asistent(nume, varsta, salariu, spor);
                return asistent;
            case BRANCARDIER:
                PersonalSpital brancardier = new Brancardier(nume, varsta, salariu, spor);
                return brancardier;
            default:
                return null;
        }
    }
}
