package clase;

public class PlataSMS implements IMetodaPlata {
    public PlataSMS() {
    }

    @Override
    public void plateste(float pretBilet) {
        System.out.println("S-a efectuat plata prin SMS, in valoare de " + pretBilet);
    }
}
