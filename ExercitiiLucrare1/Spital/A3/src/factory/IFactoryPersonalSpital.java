package factory;

import clase.PersonalSpital;

public interface IFactoryPersonalSpital {
    PersonalSpital getPersonalSpital(IPersonalSpital personalSpital, String nume, int varsta, int salariu, int extra);
}
