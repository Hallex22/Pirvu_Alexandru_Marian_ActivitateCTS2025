package clase;

public interface IParteMeniu {
    void adaugaNod(IParteMeniu parteMeniu) throws Exception;
    void stergeNod(IParteMeniu parteMeniu) throws Exception;
    IParteMeniu getNod(int index) throws Exception;
    void afisareMeniu();
}
