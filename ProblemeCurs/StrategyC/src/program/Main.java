package program;

import clase.*;

public class Main {
    public static void main(String[] args) {
        ModPlata paypal = new PayPal();
        ModPlata cash = new Cash();
        ModPlata card = new Card();

        Client client = new Client("Alex");
        client.plateste(10);

        client.setModPlata(card);
        client.plateste(8);

        client.setModPlata(cash);
        client.plateste(10);
    }
}