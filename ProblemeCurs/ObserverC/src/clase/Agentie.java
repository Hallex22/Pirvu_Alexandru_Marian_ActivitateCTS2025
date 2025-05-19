package clase;

import java.util.ArrayList;
import java.util.List;

public class Agentie implements Subject {
    private String numeAgentie;
    private List<Observer> clientiFideli;

    public Agentie(String numeAgentie) {
        this.numeAgentie = numeAgentie;
        this.clientiFideli = new ArrayList<Observer>();
    }

    @Override
    public void adaugaObserver(Observer observer) {
        clientiFideli.add(observer);
    }

    @Override
    public void stergeObserver(Observer observer) {
        clientiFideli.remove(observer);
    }

    @Override
    public void trimiteNotificare(String mesaj) {
        for (Observer observer : clientiFideli) {
            observer.receptionareMesaj(mesaj);
        }
    }
}
