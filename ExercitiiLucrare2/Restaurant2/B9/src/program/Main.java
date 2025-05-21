package program;

import clase.IRezervare;
import clase.ProxyRezervare;
import clase.Rezervare;

public class Main {
    public static void main(String[] args) {
        IRezervare rezervare = new Rezervare();
        rezervare.efectuareRezervare(3);

        IRezervare rezervareProxy = new ProxyRezervare(rezervare);
        rezervareProxy.efectuareRezervare(3);
    }
}