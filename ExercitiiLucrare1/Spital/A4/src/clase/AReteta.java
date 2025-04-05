package clase;

public abstract class AReteta {
    protected String denumire;
    protected double cantitateApa;
    protected double cantitateSubstanta;

    public AReteta() {
        this.denumire = "N/A";
        this.cantitateApa = 0;
        this.cantitateSubstanta = 0;
    }

    public AReteta(String denumire, double cantitateApa, double cantitateSubstanta) {
        try {
            Thread.sleep(3000);
            this.denumire = denumire;
            this.cantitateApa = cantitateApa;
            this.cantitateSubstanta = cantitateSubstanta;
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public abstract void afiseazaReteta();
    public abstract AReteta cloneaza();
}
