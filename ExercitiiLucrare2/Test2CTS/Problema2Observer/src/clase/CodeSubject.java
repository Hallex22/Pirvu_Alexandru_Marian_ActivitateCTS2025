package clase;

public interface CodeSubject {
    void adaugaNod(CodeSubject code) throws Exception;
    void stergeNod(CodeSubject code) throws Exception;
    CodeSubject getNod(int index) throws Exception;
    void parsareCod();
    void notificareObservatori();
}
