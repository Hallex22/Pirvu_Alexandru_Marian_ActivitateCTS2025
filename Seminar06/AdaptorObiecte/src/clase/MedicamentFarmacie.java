package clase;

public class MedicamentFarmacie {
    private String numeMedicament;
    private float pret;
    private String dataExpirare;
    private boolean esteInStoc;

    public MedicamentFarmacie(String numeMedicament, float pret, String dataExpirare, boolean esteInStoc) {
        this.numeMedicament = numeMedicament;
        this.pret = pret;
        this.dataExpirare = dataExpirare;
        this.esteInStoc = esteInStoc;
    }

    public void cumparaMedicament(){
        System.out.println("Medicamentul " + numeMedicament + " care expira la "
                + dataExpirare + " a fost cumparat la pretul de " + pret + " RON.");
    }

}
