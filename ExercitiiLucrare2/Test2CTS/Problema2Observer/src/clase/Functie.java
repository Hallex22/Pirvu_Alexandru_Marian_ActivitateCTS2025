package clase;

public class Functie implements CodeSubject {
    private String numeFunctie;
    public Functie(String numeFunctie) {
        this.numeFunctie = numeFunctie;
    }
    @Override
    public void adaugaNod(CodeSubject code) throws Exception {
        throw new Exception("Nu este implementat");
    }
    @Override
    public void stergeNod(CodeSubject code) throws Exception {
        throw new Exception("Nu este implementat");
    }
    @Override
    public CodeSubject getNod(int index) throws Exception {
        throw new Exception("Nu este implementat");
    }
    @Override
    public void parsareCod() {
        System.out.println("    Functia " + numeFunctie + " a fost parsata");
    }

    @Override
    public void notificareObservatori() {

    }
}
