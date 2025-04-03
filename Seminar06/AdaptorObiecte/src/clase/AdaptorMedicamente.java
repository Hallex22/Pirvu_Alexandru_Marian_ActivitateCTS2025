package clase;

public class AdaptorMedicamente extends MedicamentFarmacie {
    private MedicamentSpital medicamentSpital;

   public AdaptorMedicamente(MedicamentSpital medicamentSpital) {
       super(medicamentSpital.getNumeMedicament(), medicamentSpital.getPret(), "04.04.2025", true);
       this.medicamentSpital = medicamentSpital;
   }
    @Override
    public void cumparaMedicament() {
        medicamentSpital.achizitioneazaMedicament();
    }
}
