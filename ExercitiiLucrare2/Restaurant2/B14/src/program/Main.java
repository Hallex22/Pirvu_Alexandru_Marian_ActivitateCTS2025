package program;

import clase.OcupareExterior;
import clase.OcupareInterior;
import clase.TemplateOcupareMasa;

public class Main {
    public static void main(String[] args) {
        TemplateOcupareMasa ocupareInterior = new OcupareInterior();
        TemplateOcupareMasa ocupareExterior = new OcupareExterior();

        ocupareInterior.ocupareMasa();
        System.out.println("--------------------");
        ocupareExterior.ocupareMasa();
    }
}