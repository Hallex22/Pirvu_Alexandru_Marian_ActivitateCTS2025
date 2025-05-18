package clase;

import java.util.ArrayList;
import java.util.List;

public class Categorie implements OptiuneMeniu {
    private List<OptiuneMeniu> optiuni;
    private String numeCategorie;

    public Categorie(String numeCategorie) {
        this.numeCategorie = numeCategorie;
        this.optiuni = new ArrayList<OptiuneMeniu>();
    }

    @Override
    public void adaugaOptiune(OptiuneMeniu optiune) throws Exception {
        optiuni.add(optiune);
    }

    @Override
    public OptiuneMeniu getOptiune(int index) throws Exception {
        return optiuni.get(index);
    }

    @Override
    public void stergeOptiune(OptiuneMeniu optiune) throws Exception {
        optiuni.remove(optiune);
    }

    @Override
    public void descriere() {
        System.out.println("Categoria " + numeCategorie);
        for (OptiuneMeniu o : optiuni){
            o.descriere();
        }
    }
}
