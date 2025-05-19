package program;

import clase.IPachetTuristic;
import clase.PachetTransport;
import clase.Persoana;
import clase.ProxyPachet;

public class Main {
    public static void main(String[] args) {
        Persoana persoana = new Persoana("Marcel", 68);
        Persoana persoana1 = new Persoana("Alex", 22);

        IPachetTuristic pachetTransport = new PachetTransport(persoana);
        IPachetTuristic pachetTransport1 = new PachetTransport(persoana1);

        IPachetTuristic pachetProxy = new ProxyPachet(pachetTransport);
        IPachetTuristic pachetProxy1 = new ProxyPachet(pachetTransport1);

        pachetProxy.rezervaPachet();
        pachetProxy1.rezervaPachet();

    }
}