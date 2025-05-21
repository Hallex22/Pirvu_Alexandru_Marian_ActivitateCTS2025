package program;

import clase.Client;
import clase.IPlata;
import clase.PlataCard;
import clase.PlataCash;

public class Main {
    public static void main(String[] args) {
        IPlata plataCash = new PlataCash();
        IPlata plataCard = new PlataCard();

        Client client = new Client("Alex");
        client.plateste(10);

        client.setMetodaPlata(plataCard);
        client.plateste(5.2);
    }
}