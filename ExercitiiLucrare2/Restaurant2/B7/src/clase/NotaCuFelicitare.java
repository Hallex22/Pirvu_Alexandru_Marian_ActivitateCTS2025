package clase;

public class NotaCuFelicitare extends ANotaDePlataDecorator {
    private String mesajFelicitare;

    public NotaCuFelicitare(INotaDePlata notaDePlata, String mesajFelicitare) {
        super(notaDePlata);
        this.mesajFelicitare = mesajFelicitare;
    }

    @Override
    public void afisareNotaDePlata(String numeClient) {
        super.afisareNotaDePlata(numeClient);
        System.out.println(numeClient + ", a primit felicitarea cu mesajul: " + mesajFelicitare);
    }
}
