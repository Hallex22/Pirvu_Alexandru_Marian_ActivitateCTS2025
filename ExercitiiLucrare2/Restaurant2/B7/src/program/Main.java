package program;

import clase.ANotaDePlataDecorator;
import clase.INotaDePlata;
import clase.NotaCuFelicitare;
import clase.NotaDePlata;

public class Main {
    public static void main(String[] args) {
        INotaDePlata notaDePlata = new NotaDePlata(50);
        notaDePlata.afisareNotaDePlata("Alex");

        System.out.println("------------");
        ANotaDePlataDecorator notaCuFelicitare = new NotaCuFelicitare(notaDePlata, "La multi ani!");
        notaCuFelicitare.afisareNotaDePlata("Alex");
    }
}