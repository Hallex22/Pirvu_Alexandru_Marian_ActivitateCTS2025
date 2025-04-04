package main;

import clase.ACont;
import clase.Cont;


public class Main {
    public static void main(String[] args) {
        ACont cont = new Cont("Vasile", "vasile@gmail.com", "1234");

        ACont cont2 = cont.copiaza();
        cont2.rezerva();
    }
}