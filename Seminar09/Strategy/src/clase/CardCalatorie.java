package clase;

public class CardCalatorie implements IMetodaPlata {
    private int nrCalatorii;

    public CardCalatorie(int nrCalatorii) {
        this.nrCalatorii = nrCalatorii;
    }

    @Override
    public void plateste(float pretBilet) {
        if(nrCalatorii > 0) {
            System.out.println("S-a efectuat plata cu cardul de calatorie in valoare de "
                    + pretBilet + " .");
            nrCalatorii--;
        }
        else {
            System.out.println("Nu mai ai calatorii ramase");
        }
    }
}
