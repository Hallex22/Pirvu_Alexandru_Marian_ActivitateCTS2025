package clase;

public class ItemMeniu implements OptiuneMeniu {

    private String numeItem;

    public ItemMeniu(String numeItem) {
        this.numeItem = numeItem;
    }

    @Override
    public void adaugaOptiune(OptiuneMeniu optiune) throws Exception {
        throw new Exception("Nu este implementata");
    }

    @Override
    public OptiuneMeniu getOptiune(int index) throws Exception {
        throw new Exception("Nu este implementata");
    }

    @Override
    public void stergeOptiune(OptiuneMeniu optiune) throws Exception {
        throw new Exception("Nu este implementata");
    }

    @Override
    public void descriere() {
        System.out.println("    Item " + numeItem);
    }
}
