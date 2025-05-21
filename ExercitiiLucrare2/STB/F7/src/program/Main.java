package program;

import clase.ADecoratorBilet;
import clase.Bilet;
import clase.BiletZileSpeciale;
import clase.IPrintare;

public class Main {
    public static void main(String[] args) {
        IPrintare bilet = new Bilet("Alex", 3);
        bilet.printareBilet();

        System.out.println("--------------");
        ADecoratorBilet biletSpecial = new BiletZileSpeciale(bilet, "La multi ani");
        biletSpecial.printareBilet();
    }
}