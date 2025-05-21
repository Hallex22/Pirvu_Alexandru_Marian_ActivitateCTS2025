package clase;

public class PlataCash implements IPlata {
    @Override
    public void efectuarePlata(double suma) {
        System.out.println("S-a efectuat plata cash in valoare de " + suma + " RON.");
    }
}
