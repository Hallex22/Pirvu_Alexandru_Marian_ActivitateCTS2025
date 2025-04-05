package factory;

import clase.Asistent;
import clase.Brancardier;
import clase.Medic;
import clase.PersonalSpital;

public class FactoryPersonalMedical implements IFactoryPersonalSpital {
    @Override
    public PersonalSpital getPersonalSpital(IPersonalSpital personalSpital, String nume, int varsta, int salariu, int extra) {
        if(personalSpital instanceof PersonalMedical){
            PersonalMedical tipPersonalMedical = (PersonalMedical) personalSpital;
            switch (tipPersonalMedical){
                case MEDIC:
                    PersonalSpital medic = new Medic(nume, varsta, salariu, extra);
                    return medic;
                case ASISTENT:
                    PersonalSpital asistent = new Asistent(nume, varsta, salariu, extra);
                    return asistent;
                case BRANCARDIER:
                    PersonalSpital brancardier = new Brancardier(nume, varsta, salariu, extra);
                    return brancardier;
                default:
                    return null;
            }
        }
        return null;
    }
}
