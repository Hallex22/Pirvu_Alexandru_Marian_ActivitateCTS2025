package clase;

public class MedicamentSpital {
    private String numeMedicament;
    private float pret;

    public MedicamentSpital(String numeMedicament, float pret) {
        this.numeMedicament = numeMedicament;
        this.pret = pret;
    }

    public String getNumeMedicament() {
        return numeMedicament;
    }

    public float getPret() {
        return pret;
    }

    public void achizitioneazaMedicament() {
        prezintaReteta();
        System.out.println("Medicamentul " + numeMedicament + " a fost cumparat la pretul de " +
                pret + " RON.");
    }
    public void prezintaReteta() {
        System.out.println("Este prezentata reteta pentru medicamentul " + numeMedicament);
    }
}
