package clase;

public class ProxyPachet implements IPachetTuristic {
    IPachetTuristic pachetTransport;

    public ProxyPachet(IPachetTuristic pachetTransport) {
        this.pachetTransport = pachetTransport;
    }

    @Override
    public void descriere() {
        pachetTransport.descriere();
    }

    @Override
    public void rezervaPachet() {
        PachetTransport pachetTransport1 = (PachetTransport) pachetTransport;
        if (pachetTransport1.getPersoana().getVarsta() >= 65) {
            pachetTransport.rezervaPachet();
        } else {
            System.out.println("Doar pensionarii pot rezerva pachet de transport");
        }
    }
}
