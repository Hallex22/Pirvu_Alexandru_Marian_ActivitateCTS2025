package clase;

import java.util.ArrayList;
import java.util.List;

public class Sectiune implements IParteMeniu {
    private String denumireSectiune;
    private List<IParteMeniu> listaItemMeniu;

    public Sectiune(String denumireSectiune) {
        this.denumireSectiune = denumireSectiune;
        this.listaItemMeniu = new ArrayList<IParteMeniu>();
    }

    @Override
    public void adaugaNod(IParteMeniu parteMeniu) {
        listaItemMeniu.add(parteMeniu);
    }

    @Override
    public void stergeNod(IParteMeniu parteMeniu) {
        listaItemMeniu.remove(parteMeniu);
    }

    @Override
    public IParteMeniu getNod(int index) {
        return listaItemMeniu.get(index);
    }

    @Override
    public void afisareMeniu() {
        System.out.println(denumireSectiune);
        for (IParteMeniu item : listaItemMeniu) {
            item.afisareMeniu();
        }
    }
}
