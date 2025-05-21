package clase;

public interface Subject {
    void adaugaAbonat(Observer observer);
    void stergeAbonat(Observer observer);
    void trimiteNotificare(String mesaj);
}
