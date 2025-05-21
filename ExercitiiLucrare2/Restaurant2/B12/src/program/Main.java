package program;

import clase.Client;
import clase.Restaurant;
import clase.Subject;

public class Main {
    public static void main(String[] args) {
        Subject restaurant = new Restaurant();

        Client client1 = new Client("George");
        Client client2 = new Client("Ciolacu");
        Client client3 = new Client("Andrei");

        restaurant.adaugaAbonat(client1);
        restaurant.adaugaAbonat(client2);
        restaurant.adaugaAbonat(client3);
        restaurant.trimiteNotificare("Va pwp pe toti");

        System.out.println("----------");
        restaurant.stergeAbonat(client2);
        restaurant.trimiteNotificare("Hatz Johnule");

    }
}