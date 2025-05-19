package clase;

public class Abonat {
    private String nume;
    private IChallenge provocare;
    public Abonat(String nume) {
        this.nume = nume;
        this.provocare = new Flotari();
    }
    public void setProvocare(IChallenge provocare) {
        this.provocare = provocare;
    }
    public void executaProvocare() {
        provocare.executareExercitiu(nume);
    }
}
