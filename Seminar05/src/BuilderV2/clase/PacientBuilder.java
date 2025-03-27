package BuilderV2.clase;

public class PacientBuilder implements AbstractBuilder {
    private String nume;
    private boolean arePatRabatabil;
    private boolean areMicDejunInclus;
    private boolean arePapuciDeCamera;
    private boolean areHalatDeInterior;
    private String numeInsotitor;

    public PacientBuilder(){

        this.nume = "N/A";
        this.arePatRabatabil = false;
        this.areMicDejunInclus = false;
        this.arePapuciDeCamera = false;
        this.areHalatDeInterior = false;
        this.numeInsotitor = "N/A";

    }

    public PacientBuilder setArePatRabatabil(boolean arePatRabatabil){
        this.arePatRabatabil = arePatRabatabil;
        return this;
    }

    public PacientBuilder setAreMicDejun(boolean areMicDejun){
        this.areMicDejunInclus = areMicDejun;
        return this;
    }

    public PacientBuilder setArePapuciDeCamera(boolean arePapuciDeCamera){
        this.arePapuciDeCamera = arePapuciDeCamera;
        return this;
    }

    public PacientBuilder setAreHalatDeInterior(boolean areHalatDeInterior){
        this.areHalatDeInterior = areHalatDeInterior;
        return this;
    }

    public PacientBuilder setNumeInsotitor(String numeInsotitor){
        this.numeInsotitor = numeInsotitor;
        return this;
    }

    @Override
    public Pacient build(String numePacient) {
        return new Pacient(numePacient, this.arePatRabatabil, this.areMicDejunInclus, this.arePapuciDeCamera, this.areHalatDeInterior, this.numeInsotitor);
    }
}