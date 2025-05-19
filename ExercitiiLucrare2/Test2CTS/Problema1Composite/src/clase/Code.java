package clase;

public interface Code {
    void adaugaNod(Code code) throws Exception;
    void stergeNod(Code code) throws Exception;
    Code getNod(int index) throws Exception;
    void parsareCod();
}
