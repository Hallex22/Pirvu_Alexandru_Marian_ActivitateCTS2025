package clase;

public class AdaptorMedicamentClase extends MedicamentSpital implements IMedicamentFarmacie {
    public AdaptorMedicamentClase(String numeMedicament, float pret) {
        super(numeMedicament, pret);
    }
    @Override
    public void cumparaMedicament() {
        super.achizitioneazaMedicament();
    }
}
