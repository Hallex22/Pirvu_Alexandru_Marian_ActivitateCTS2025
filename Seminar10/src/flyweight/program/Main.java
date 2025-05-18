package flyweight.program;

import flyweight.clase.FabricaPacienti;
import flyweight.clase.Pacient;
import flyweight.clase.PacientAbstract;
import flyweight.clase.Spitalizare;

public class Main {
    public static void main(String[] args) throws Exception {
        FabricaPacienti fabrica = new FabricaPacienti();

        PacientAbstract pacient = fabrica.getPacient("0755278045", "Alex", "alex@yahoo.com");
        Spitalizare spitalizare1 = new Spitalizare(5, 7, 3);
        Spitalizare spitalizare2 = new Spitalizare(8, 3, 5);

        pacient.afiseazaPacient(spitalizare1);
        pacient.afiseazaPacient(spitalizare2);

        Spitalizare spitalizare3 = new Spitalizare(7, 6, 7);
        Spitalizare spitalizare4 = new Spitalizare(9, 2, 6);

        fabrica.getPacient("12345678", "Ioana", "ioana@gmail.com").afiseazaPacient(spitalizare3);
        fabrica.getPacient("0755278045").afiseazaPacient(spitalizare4);
    }
}
