package clase;

import java.util.ArrayList;
import java.util.List;

public class Restaurant implements Subject {

    private List<Observer> abonati;

    public Restaurant() {
        this.abonati = new ArrayList<Observer>();
    }

    @Override
    public void adaugaAbonat(Observer observer) {
        abonati.add(observer);
    }

    @Override
    public void stergeAbonat(Observer observer) {
        abonati.remove(observer);
    }

    @Override
    public void trimiteNotificare(String mesaj) {
        for (Observer obs : abonati) {
            obs.primesteNotificare(mesaj);
        }
    }
}
