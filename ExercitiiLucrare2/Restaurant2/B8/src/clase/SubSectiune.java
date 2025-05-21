package clase;

import java.util.ArrayList;
import java.util.List;

public class SubSectiune implements IParteMeniu {
    private String denumireSubSectiune;
    private List<IParteMeniu> listaItemMeniu;

    public SubSectiune(String denumireSubSectiune) {
        this.denumireSubSectiune = denumireSubSectiune;
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
        System.out.println("    " + denumireSubSectiune);
        for (IParteMeniu item : listaItemMeniu) {
            item.afisareMeniu();
        }
    }
}
