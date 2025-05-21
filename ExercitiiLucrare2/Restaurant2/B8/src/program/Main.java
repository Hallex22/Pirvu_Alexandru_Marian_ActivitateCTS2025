package program;

import clase.IParteMeniu;
import clase.Item;
import clase.Sectiune;
import clase.SubSectiune;

public class Main {
    public static void main(String[] args) throws Exception {
        IParteMeniu sectiune = new Sectiune("Bauturi");
        IParteMeniu subSectiune1 = new SubSectiune("Sucuri");
        IParteMeniu subSectiune2 = new SubSectiune("Cafea");
        IParteMeniu item1 = new Item("Coca-Cola");
        IParteMeniu item2 = new Item("Pepsi");
        IParteMeniu item3 = new Item("Cappucino");

        subSectiune1.adaugaNod(item1);
        subSectiune1.adaugaNod(item2);
        subSectiune2.adaugaNod(item3);
        sectiune.adaugaNod(subSectiune1);
        sectiune.adaugaNod(subSectiune2);

        sectiune.afisareMeniu();
    }
}