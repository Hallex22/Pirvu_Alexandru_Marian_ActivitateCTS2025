package clase;

public class Item implements IParteMeniu {
    private String denumireItem;

    public Item(String denumireItem) {
        this.denumireItem = denumireItem;
    }

    @Override
    public void adaugaNod(IParteMeniu parteMeniu) throws Exception {
        throw new Exception("Nu este implementant!");
    }

    @Override
    public void stergeNod(IParteMeniu parteMeniu) throws Exception {
        throw new Exception("Nu este implementant!");
    }

    @Override
    public IParteMeniu getNod(int index) throws Exception {
        throw new Exception("Nu este implementant!");
    }

    @Override
    public void afisareMeniu() {
        System.out.println("        " + denumireItem);
    }
}
