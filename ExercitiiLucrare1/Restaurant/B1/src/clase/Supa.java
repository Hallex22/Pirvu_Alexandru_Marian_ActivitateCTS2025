package clase;

public abstract class Supa {
    protected double pret;
    protected String dataPreparare;
    public Supa(double pret, String dataPreparare) {
        this.pret = pret;
        this.dataPreparare = dataPreparare;
    }

    public abstract void prepara();

}
