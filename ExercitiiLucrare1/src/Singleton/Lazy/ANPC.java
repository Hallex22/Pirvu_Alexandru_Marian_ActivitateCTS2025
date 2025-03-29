package Singleton.Lazy;

public class ANPC {
    private String presedinte;
    private int nrAngajati;
    private String website;
    private static ANPC instance = null;
    private ANPC(String presedinte, int nrAngajati, String website) {
        this.presedinte = presedinte;
        this.nrAngajati = nrAngajati;
        this.website = website;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ANPC{");
        sb.append("presedinte='").append(presedinte).append('\'');
        sb.append(", nrAngajati=").append(nrAngajati);
        sb.append(", website='").append(website).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public static synchronized ANPC getInstance(String presedinte, int nrAngajati, String website) {
        if (instance == null) {
            instance = new ANPC(presedinte, nrAngajati, website);
        }
        return instance;
    }
    public String getPresedinte() {
        return presedinte;
    }
    public void setPresedinte(String presedinte) {
        this.presedinte = presedinte;
    }
    public int getNrAngajati() {
        return nrAngajati;
    }
    public void setNrAngajati(int nrAngajati) {
        this.nrAngajati = nrAngajati;
    }
    public String getWebsite() {
        return website;
    }
    public void setWebsite(String website) {
        this.website = website;
    }
    public void angajeaza(int nrPersoane) {
        this.nrAngajati += nrPersoane;
    }
    public void concediaza(int nrPersoane) {
        this.nrAngajati -= nrPersoane;
        if(this.nrAngajati < 0) {
            this.nrAngajati = 0;
        }
    }
    public void suspendaActivitatea(String denumireFirma) {
        System.out.println("ANPC a dispus suspendarea firmei " +
                denumireFirma +
                " si amenda in cuantum maxim."
        );
    }
}