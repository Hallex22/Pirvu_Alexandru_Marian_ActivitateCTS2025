package seminar04.SimpleFactory.clase;

public class SupaVita extends Supa {
    private double pretSmantana;

    public SupaVita(int gramaj, double pretSutaGr, String ingrediente, double pretSmantana) {
        super(gramaj, pretSutaGr, ingrediente);
        this.pretSmantana = pretSmantana;
    }

    @Override
    public void preparareSupa() {
        System.out.println("Supa de vita cu smantana avand pretul " + pretSmantana + " se prepara.");
    }

    @Override
    public double calculeazaPret() {
        return super.calculeazaPret() + pretSmantana;
    }
}
