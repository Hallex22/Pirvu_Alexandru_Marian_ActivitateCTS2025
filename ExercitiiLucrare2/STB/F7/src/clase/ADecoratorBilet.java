package clase;

public abstract class ADecoratorBilet implements IPrintare {
    protected IPrintare bilet;

    public ADecoratorBilet(IPrintare bilet) {
        this.bilet = bilet;
    }

    @Override
    public abstract void printareBilet();
}
