package clase;

public class FacadeUsi {
    private IUsa usaFata;
    private IUsa usaMijloc;
    private IUsa usaSpate;

    public FacadeUsi(IUsa usaFata, IUsa usaMijloc, IUsa usaSpate) {
        this.usaFata = usaFata;
        this.usaMijloc = usaMijloc;
        this.usaSpate = usaSpate;
    }

    public void toggleEsteModulLiber() {
        usaFata.toggleEsteModulLiber();
        usaMijloc.toggleEsteModulLiber();
        usaSpate.toggleEsteModulLiber();
    }

    public void forteazaUsa() {
        usaFata.forteazaUsa();
        usaMijloc.forteazaUsa();
        usaSpate.forteazaUsa();
    }
}
