package clase;

public class Bilet implements IPrintare {
    private String detinator;
    private double pret;

    public Bilet(String detinator, double pret) {
        this.detinator = detinator;
        this.pret = pret;
    }

    @Override
    public void printareBilet() {
        System.out.println(detinator + " are un bilet in valoare de " + pret + " RON.");
    }
}
