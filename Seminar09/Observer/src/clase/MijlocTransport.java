package clase;

import java.util.ArrayList;
import java.util.List;

public abstract class MijlocTransport implements Subiect {
    protected int nrLinie;
    protected List<Observer> calatori;

    public MijlocTransport(int nrLinie) {
        this.nrLinie = nrLinie;
        calatori = new ArrayList<Observer>();
    }

    @Override
    public void adaugaObservator(Observer observer) {
        this.calatori.add(observer);
    }

    @Override
    public void stergeObservator(Observer observer) {
        this.calatori.remove(observer);
    }

    @Override
    public void trimiteMesaj(String mesaj) {
        for (Observer calator : calatori) {
            calator.primesteMesaj(mesaj);
        }
    }

    public abstract void pleacaDeLaCapat();
    public abstract void schimbaTraseu();
}
