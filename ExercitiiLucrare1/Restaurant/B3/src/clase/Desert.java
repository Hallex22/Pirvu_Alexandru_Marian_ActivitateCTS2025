package clase;

public abstract class Desert extends FelMancare {
    private String topping;

    public Desert(double pret, String dataPreparare, String topping) {
        super(pret, dataPreparare);
        this.topping = topping;
    }
}
