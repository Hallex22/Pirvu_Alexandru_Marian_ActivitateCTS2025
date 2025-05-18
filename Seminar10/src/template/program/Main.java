package template.program;

import template.clase.Pacient;
import template.clase.SpitalPrivat;
import template.clase.SpitalPublic;
import template.clase.TemplateInternare;

public class Main {
    public static void main(String[] args) {
        Pacient pacient = new Pacient("Alex", 5);
        TemplateInternare spitalGeneral = new SpitalPublic("Fundeni");
        TemplateInternare spitalPrivat = new SpitalPrivat();
        spitalGeneral.internare(pacient);
        System.out.println("------------------");
        spitalPrivat.internare(pacient);
    }
}
