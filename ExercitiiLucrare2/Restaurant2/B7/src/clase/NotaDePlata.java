package clase;

public class NotaDePlata implements INotaDePlata {
    private double pret;

    public NotaDePlata(double pret) {
        this.pret = pret;
    }

    @Override
    public void afisareNotaDePlata(String numeClient) {
        System.out.println("Clientul " + numeClient + " a achitat nota de plata in valoare de " + pret + " RON.");
    }
}
