package main;

import clase.AReteta;
import clase.Reteta;

public class Main {
    public static void main(String[] args) {
        AReteta prototip = new Reteta("Paracetamol", 10, 0.8);
        AReteta clonaPrototip = prototip.cloneaza();

        clonaPrototip.afiseazaReteta();
    }
}