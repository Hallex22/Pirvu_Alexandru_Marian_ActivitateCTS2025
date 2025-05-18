package clase;

public interface OptiuneMeniu {
    void adaugaOptiune(OptiuneMeniu optiune) throws Exception;
    OptiuneMeniu getOptiune(int index) throws Exception;
    void stergeOptiune(OptiuneMeniu optiune) throws Exception;
    void descriere();
}
