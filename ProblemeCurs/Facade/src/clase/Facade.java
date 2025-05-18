package clase;

public class Facade {
    public void rezervaPachetCazareTransport() {
        Hotel hotel = new Hotel("Intercontinental", 300, 3);
        hotel.rezervaCamera();
        CompanieAeriana companieAeriana = new CompanieAeriana("Ryanair");
        System.out.println( companieAeriana.rezervaBiletAvion(20, 40));
    }
}
