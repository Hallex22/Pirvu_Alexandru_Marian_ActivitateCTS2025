package BuilderV2.program;

import BuilderV2.clase.Pacient;
import BuilderV2.clase.PacientBuilder;

public class Main {
    public static void main(String[] args) {
        PacientBuilder pacientBuilder = new PacientBuilder();
        pacientBuilder.setNumeInsotitor("Maricica").setAreHalatDeInterior(true).setArePapuciDeCamera(true);
        Pacient pacient1 = pacientBuilder.build("Ionica");
        System.out.println(pacient1);

    }
}
