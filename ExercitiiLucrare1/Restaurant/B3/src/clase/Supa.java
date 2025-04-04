package clase;

public abstract class Supa extends FelMancare {
    private int cantitateSmantana;
    public Supa(double pret, String dataPreparare, int cantitateSmantana) {
        super(pret, dataPreparare);
        this.cantitateSmantana = cantitateSmantana;
    }
}
