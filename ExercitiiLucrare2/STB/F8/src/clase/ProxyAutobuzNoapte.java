package clase;

public class ProxyAutobuzNoapte implements IAutobuzNoapte {
    private IAutobuzNoapte autobuzNoapte;

    public ProxyAutobuzNoapte(IAutobuzNoapte autobuzNoapte) {
        this.autobuzNoapte = autobuzNoapte;
    }

    @Override
    public void oprireInStatie() {
        AutobuzNoapte autobuzNoapte1 = (AutobuzNoapte) autobuzNoapte;
        if(autobuzNoapte1.getNrPasageri() == 0) {
            autobuzNoapte1.setEsteRetras(true);
            System.out.println("Autobuzul s-a retras");
        } else {
            autobuzNoapte1.oprireInStatie();
        }
    }
}
