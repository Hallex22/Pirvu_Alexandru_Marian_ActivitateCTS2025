package seminar04.prototype.clase;

public class Main {
    public static void main(String[] args) {
        ARezervare rezervare =  new Rezervare("LeBron James", 10, "20.03.2025", "14:00");
        ARezervare rezervare1 = rezervare.copiaza();

        System.out.println(rezervare.toString());
        System.out.println(rezervare1.toString());

    }
}
