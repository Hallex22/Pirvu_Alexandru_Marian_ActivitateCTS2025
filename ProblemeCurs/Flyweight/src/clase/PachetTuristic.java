package clase;

public class PachetTuristic implements IPachetTuristic {
    private int codPachet;
    private String hotel;
    private String destinatie;
    private boolean micDejun;

    public PachetTuristic(int codPachet, String hotel, String destinatie, boolean micDejun) {
        this.codPachet = codPachet;
        this.hotel = hotel;
        this.destinatie = destinatie;
        this.micDejun = micDejun;
    }

    @Override
    public void descrierePachetTuristic(Optionale optionale) {
        System.out.println("Pachetul: " + codPachet + " la hotelul " + hotel
                + ", destinatia: " + destinatie + " cu mic dejun? " + micDejun +
                optionale.toString());
    }
}
