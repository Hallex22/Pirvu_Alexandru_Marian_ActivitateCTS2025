package clase;

import java.util.HashMap;

public class FabricaLinii {
    private HashMap<Integer, AutobuzLinie> linii;

    public FabricaLinii() {
        this.linii = new HashMap<Integer, AutobuzLinie>();
    }

    public AutobuzLinie getLinie(int nrLinie, String primaStatie, String ultimaStatie) {
        if (linii.containsKey(nrLinie)) {
            return linii.get(nrLinie);
        } else {
            return linii.put(nrLinie, new Linie(nrLinie, primaStatie, ultimaStatie));
        }
    }
}
