package clase;

public class PachetCazare extends PachetTuristic {
    public PachetCazare(int codPachet) {
        super(codPachet);
    }

    @Override
    public void cautareCazare(int codPachet) {
        System.out.println("S-a gasit cazare pentru pachetul " + codPachet);
    }

    @Override
    public void cautareTransport(int codPachet) {

    }

    @Override
    public void rezervaPachet(int codPachet) {
        System.out.println("A fost rezervat pachetul cu codul " + codPachet);
    }

    @Override
    public void platirePachet(int codPachet) {
        System.out.println("S-a efectuat plata pentru pachetul cu codul " + codPachet);
    }
}
