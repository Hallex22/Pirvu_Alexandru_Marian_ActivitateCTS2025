package Prototype.persoana.clase;

public abstract class APersoana {
    protected double inaltime;
    protected int greutate;
    protected String culoarePar;
    protected String culoareOchi;

    public APersoana() {
        this.inaltime = 1.70;
        this.greutate = 60;
        this.culoarePar = "brunet";
        this.culoareOchi = "caprui";
    }
    public APersoana(double inaltime, int greutate, String culoarePar, String culoareOchi) {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.err.println("Constructor interrupted: " + e.getMessage());
        }
        this.inaltime = inaltime;
        this.greutate = greutate;
        this.culoarePar = culoarePar;
        this.culoareOchi = culoareOchi;
    }

    public double getInaltime() {
        return inaltime;
    }

    public void setInaltime(double inaltime) {
        this.inaltime = inaltime;
    }

    public int getGreutate() {
        return greutate;
    }

    public void setGreutate(int greutate) {
        this.greutate = greutate;
    }

    public String getCuloarePar() {
        return culoarePar;
    }

    public void setCuloarePar(String culoarePar) {
        this.culoarePar = culoarePar;
    }

    public String getCuloareOchi() {
        return culoareOchi;
    }

    public void setCuloareOchi(String culoareOchi) {
        this.culoareOchi = culoareOchi;
    }

    public abstract void descriere();
    public abstract APersoana copiaza();
}
