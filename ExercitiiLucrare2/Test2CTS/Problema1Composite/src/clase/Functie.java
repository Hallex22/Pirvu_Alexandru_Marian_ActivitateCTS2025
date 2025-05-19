package clase;

public class Functie implements Code {
    private String numeFunctie;
    public Functie(String numeFunctie) {
        this.numeFunctie = numeFunctie;
    }
    @Override
    public void adaugaNod(Code code) throws Exception {
        throw new Exception("Nu este implementat");
    }
    @Override
    public void stergeNod(Code code) throws Exception {
        throw new Exception("Nu este implementat");
    }
    @Override
    public Code getNod(int index) throws Exception {
        throw new Exception("Nu este implementat");
    }
    @Override
    public void parsareCod() {
        System.out.println("    Functia " + numeFunctie + " a fost parsata");
    }
}
