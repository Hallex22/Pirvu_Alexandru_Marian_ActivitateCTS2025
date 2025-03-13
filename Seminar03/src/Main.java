import Clase.AutoritatePescuitEager;
import Clase.AutoritatePescuitLazy;

public class Main {
    public static void main(String[] args) {
        // AutoritatePescuitEager
        AutoritatePescuitEager autoritate = AutoritatePescuitEager.getInstance();
        autoritate.concediaza(2);
        System.out.println(autoritate.toString());

        autoritate.setDenumire("ANpPA");
        autoritate.setWebSite("www.AnpPA.ro");
        System.out.println(autoritate.toString());

        autoritate.emiteAutorizatie("Cristian Popescu Piedone");
        System.out.println(autoritate.toString());

        AutoritatePescuitEager autoritate2 = AutoritatePescuitEager.getInstance();
        autoritate2.emiteAutorizatie("LeBron James");
        System.out.println(autoritate2.toString());

        // AutoritatePescuitLazy
        System.out.println("------------------------------------------------");
        AutoritatePescuitLazy lazyInstance = AutoritatePescuitLazy.getInstance("ANPA", "www.nba.ro", 10, 100);
        System.out.println(lazyInstance);
        AutoritatePescuitLazy lazyInstance2 = AutoritatePescuitLazy.getInstance("ANPA", "www.nba.ro", 10, 100);
        lazyInstance2.emiteAutorizatie("Michael Jordan");
        System.out.println(lazyInstance);
    }
}