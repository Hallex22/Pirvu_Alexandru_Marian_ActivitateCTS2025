package seminar04.SimpleFactory.clase;

public class SupaCiuperci extends Supa {

    private double cantitateCiuperci;

    public SupaCiuperci(int gramaj, double pretSutaGr, String ingrediente, double cantitateCiuperci) {
        super(gramaj, pretSutaGr, ingrediente);
        this.cantitateCiuperci = cantitateCiuperci;
    }

    @Override
    public double calculeazaPret() {
        return super.calculeazaPret() + (cantitateCiuperci / 100) * getPretSutaGr();
    }
    @Override
    public void preparareSupa() {
        System.out.println("Supa de ciuperci in cantitatea " + cantitateCiuperci + " este preparata.");
    }
}
