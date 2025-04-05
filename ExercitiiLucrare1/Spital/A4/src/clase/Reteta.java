package clase;

public class Reteta extends AReteta {
    public Reteta() {
    }

    public Reteta(String denumire, double cantitateApa, double cantitateSubstanta) {
        super(denumire, cantitateApa, cantitateSubstanta);
    }

    @Override
    public AReteta cloneaza() {
        AReteta reteta = new Reteta();
        reteta.denumire = this.denumire;
        reteta.cantitateApa = this.cantitateApa;
        reteta.cantitateSubstanta = this.cantitateSubstanta;
        return reteta;
    }

    @Override
    public void afiseazaReteta() {
        System.out.println("Reteta " + denumire + " foloseste " + cantitateApa + "g apa si "
                + cantitateSubstanta + "g substanta activa.");
    }
}
