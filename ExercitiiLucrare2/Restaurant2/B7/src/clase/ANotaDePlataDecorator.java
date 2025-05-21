package clase;

public abstract class ANotaDePlataDecorator implements INotaDePlata {
    INotaDePlata notaDePlata;

    public ANotaDePlataDecorator(INotaDePlata notaDePlata) {
        this.notaDePlata = notaDePlata;
    }

    @Override
    public void afisareNotaDePlata(String numeClient) {
        notaDePlata.afisareNotaDePlata(numeClient);
    }
}
