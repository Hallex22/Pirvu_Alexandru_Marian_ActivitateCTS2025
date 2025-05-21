package clase;

public class PlataCard implements IPlata {
    @Override
    public void efectuarePlata(double suma) {
        System.out.println("S-a efectuat plata cu cardul in valoare de " + suma + " RON.");
    }
}
