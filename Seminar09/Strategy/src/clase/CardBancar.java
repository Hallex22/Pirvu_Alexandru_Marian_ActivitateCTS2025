package clase;

public class CardBancar implements IMetodaPlata {

    private float sold;

    public CardBancar(float sold) {
        this.sold = sold;
    }

    @Override
    public void plateste(float pretBilet) {
        if (sold >= pretBilet) {
            System.out.println("S-a efectuat plata cu cardul bancar in valoare de "
                    + pretBilet + " .");
            sold -= pretBilet;
        }
        else {
            System.out.println("Nu ai sold suficient.");
        }
    }
}
