package seminar04.SimpleFactory.clase;

public class SupaLegume extends Supa {
    private double cantitateCrutoane;
    public SupaLegume(int gramaj, double pretSutaGr, String ingrediente, double cantitateCrutoane) {
        super(gramaj, pretSutaGr, ingrediente);
        this.cantitateCrutoane = cantitateCrutoane;
    }
    @Override
    public void preparareSupa() {
        System.out.println("Supa de legume cu " + cantitateCrutoane + " g crutoane se prepara.");
    }
    @Override
    public double calculeazaPret() {
        return super.calculeazaPret() + (cantitateCrutoane / 100) * (getPretSutaGr() * 2);
    }
}
