package factory;

import clase.PersonalSpital;
import clase.Registrator;
import clase.Secretar;

public class FactoryPersonalNonMedical implements IFactoryPersonalSpital {
    @Override
    public PersonalSpital getPersonalSpital(IPersonalSpital personalSpital, String nume, int varsta, int salariu, int extra) {
        if(personalSpital instanceof PersonalNonMedical){
            PersonalNonMedical tipPersonalNonMedical = (PersonalNonMedical) personalSpital;
            switch (tipPersonalNonMedical){
                case SECRETAR:
                    PersonalSpital secretar = new Secretar(nume, varsta, salariu, extra);
                    return secretar;
                case REGISTRATOR:
                    PersonalSpital registrator = new Registrator(nume, varsta, salariu, extra);
                    return registrator;
                default:
                    return null;
            }
        }
        return null;
    }
}
