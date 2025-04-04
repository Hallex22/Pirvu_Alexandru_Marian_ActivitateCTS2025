package clase;

public abstract class FelMancare {
    private double pret;
    private String dataPreparare;
    public FelMancare(double pret, String dataPreparare) {
        this.pret = pret;
        this.dataPreparare = dataPreparare;
    }

    public double getPret() {
        return pret;
    }

    public String getDataPreparare() {
        return dataPreparare;
    }

    public abstract void prepara();
}
