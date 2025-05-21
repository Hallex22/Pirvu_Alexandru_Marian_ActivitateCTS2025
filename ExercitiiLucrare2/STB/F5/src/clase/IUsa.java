package clase;

public abstract class IUsa {
    private boolean estePeModulLiber;

    public IUsa() {
        this.estePeModulLiber = false;
    }

    public void toggleEsteModulLiber() {
        this.estePeModulLiber = !this.estePeModulLiber;
    }

    abstract void forteazaUsa();

    public void descriereUsa() {
        System.out.println("Usa este setata pe modul liber? " + estePeModulLiber);
    }
}
