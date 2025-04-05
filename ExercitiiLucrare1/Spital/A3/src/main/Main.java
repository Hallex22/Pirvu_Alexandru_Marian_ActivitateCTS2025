package main;

import clase.PersonalSpital;
import factory.FactoryPersonalMedical;
import factory.FactoryPersonalNonMedical;
import factory.PersonalMedical;
import factory.PersonalNonMedical;

public class Main {
    public static void main(String[] args) {
        FactoryPersonalMedical factoryPersonalMedical = new FactoryPersonalMedical();
        FactoryPersonalNonMedical factoryPersonalNonMedical = new FactoryPersonalNonMedical();

        PersonalSpital medic = factoryPersonalMedical.getPersonalSpital(PersonalMedical.MEDIC,
                "Vasile", 40, 7800, 1200);
        PersonalSpital secretar = factoryPersonalNonMedical.getPersonalSpital(PersonalNonMedical.SECRETAR,
                "Alex", 21, 5400, 2);

        medic.descriere();
        secretar.descriere();
    }
}