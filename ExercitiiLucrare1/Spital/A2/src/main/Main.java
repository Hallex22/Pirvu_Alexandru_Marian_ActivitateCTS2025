package main;

import clase.PersonalSpital;
import factory.FactoryPersonalSpital;
import factory.TipPersonalSpital;

public class Main {
    public static void main(String[] args) {
        FactoryPersonalSpital spital = new FactoryPersonalSpital();
        PersonalSpital medic = spital.getPersonalSpital(TipPersonalSpital.MEDIC,
                "Maria", 27, 5800, 300);
        PersonalSpital asistent = spital.getPersonalSpital(TipPersonalSpital.ASISTENT,
                "George", 32, 4800, 200);
        PersonalSpital brancardier = spital.getPersonalSpital(TipPersonalSpital.BRANCARDIER,
                "Costel", 44, 3200, 600);
        brancardier.descriere();

    }
}