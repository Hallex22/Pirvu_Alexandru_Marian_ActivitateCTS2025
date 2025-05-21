package program;

import adapter.AdaptorRestaurant;
import bar.Produs;
import printare.Factura;

public class Main {
    public static void main(String[] args) {

        Produs produs = new Produs("Mar", 2);

        AdaptorRestaurant adapter = new AdaptorRestaurant(produs);
        adapter.printeaza();
    }
}