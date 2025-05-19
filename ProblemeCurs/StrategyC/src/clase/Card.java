package clase;

public class Card implements ModPlata {
    @Override
    public void plateste(String numeClient, double pret) {
        System.out.println("Clientul " + numeClient + " a efectuat plata in valoare de "
                + pret + " cu cardul");
    }
}
