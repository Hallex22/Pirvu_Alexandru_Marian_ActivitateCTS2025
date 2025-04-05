package clase;

public class BuilderPacient implements IBuilderPacient {
    private Pacient pacient;

    public BuilderPacient() {
        this.pacient = new Pacient();
    }

    public BuilderPacient setNume(String nume){
        pacient.setNume(nume);
        return this;
    }

    public BuilderPacient setArePatRabatabil(boolean arePatRabatabil){
        pacient.setArePatRabatabil(arePatRabatabil);
        return this;
    }

    public BuilderPacient setAreMicDejun(boolean areMicDejun){
        pacient.setAreMicDejun(areMicDejun);
        return this;
    }

    public BuilderPacient setArePapuciCamera(boolean arePapuciCamera){
        pacient.setArePapuciCamera(arePapuciCamera);
        return this;
    }

    public BuilderPacient setAreHalatInterior(boolean areHalatInterior){
        pacient.setAreHalatInterior(areHalatInterior);
        return this;
    }

    @Override
    public Pacient build(String nume) {
        pacient.setNume(nume);
        return pacient;
    }
}
