package clase;

public class BiletZileSpeciale extends ADecoratorBilet {
    private String mesajSpecial;
    public BiletZileSpeciale(IPrintare bilet, String mesajSpecial) {
        super(bilet);
        this.mesajSpecial = mesajSpecial;
    }

    @Override
    public void printareBilet() {
        bilet.printareBilet();
        System.out.println(mesajSpecial);
    }
}
