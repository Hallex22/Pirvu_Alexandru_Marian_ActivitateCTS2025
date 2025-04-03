package clase;

public class Farmacie {
    private String nume;
    public Farmacie(String nume) {
        this.nume = nume;
    }
    public void vindeMedicament(IMedicamentFarmacie medicamentFarmacie){
        System.out.println("Farmacia " + nume);
        medicamentFarmacie.cumparaMedicament();
    }
}
