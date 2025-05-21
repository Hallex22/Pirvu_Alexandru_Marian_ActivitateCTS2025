package program;

import clase.AutobuzNoapte;
import clase.IAutobuzNoapte;
import clase.ProxyAutobuzNoapte;

public class Main {
    public static void main(String[] args) {
        IAutobuzNoapte autobuzNoapte = new AutobuzNoapte(97, 0);
        autobuzNoapte.oprireInStatie();

        IAutobuzNoapte autobuzNoapteProxy = new ProxyAutobuzNoapte(autobuzNoapte);
        autobuzNoapteProxy.oprireInStatie();
    }
}