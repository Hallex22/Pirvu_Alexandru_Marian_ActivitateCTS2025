package clase;

public interface Subiect {
    void adaugaObservator(Observer observer);
    void stergeObservator(Observer observer);
    void trimiteMesaj(String mesaj);
}
