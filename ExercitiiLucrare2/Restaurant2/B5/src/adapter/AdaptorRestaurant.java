package adapter;

import bar.Produs;
import printare.Factura;
import printare.IPrintare;

import java.util.Date;

public class AdaptorRestaurant implements IPrintare {
    Produs produs;

    public AdaptorRestaurant(Produs produs) {
        this.produs = produs;
    }

    @Override
    public void printeaza() {
        Factura factura = new Factura(produs.getPret(), new Date().toString());
        factura.printeaza();
    }
}
