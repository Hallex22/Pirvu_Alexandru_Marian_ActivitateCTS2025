package main;

import clase.BuilderPacient;
import clase.IBuilderPacient;
import clase.Pacient;

public class Main {
    public static void main(String[] args) {
        BuilderPacient builderPacient = new BuilderPacient();
        Pacient basic = builderPacient.build("default");
        System.out.println(basic.toString());

        builderPacient.setAreMicDejun(true).setArePapuciCamera(true);
        Pacient pacient = builderPacient.build("Andrei");
        System.out.println(pacient.toString());
    }
}