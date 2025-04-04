package main;

import builder.BuilderRezervare;
import builder.IBuilderRezervare;
import clase.Rezervare;

public class Main {
    public static void main(String[] args) {
        BuilderRezervare builder = new BuilderRezervare();
        Rezervare rezervareDefault = builder.build();
        System.out.println(rezervareDefault.toString());

        builder.setAreMuzicaPersonalizata(true).setGenMuzical("Rock");
        Rezervare rezervare1 = builder.build();
        System.out.println(rezervare1.toString());
    }
}