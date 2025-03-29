package Singleton.Registry;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class ANPC {
    private String presedinte;
    private int nrAngajati;
    private String website;
    private int nrProceseVerbaleEmise;
    private static ANPC instance = null;
    private Map<String, ProcesVerbal> registry = new HashMap<>();

    private ANPC(String presedinte, int nrAngajati, String website) {
        this.presedinte = presedinte;
        this.nrAngajati = nrAngajati;
        this.website = website;
        this.nrProceseVerbaleEmise = 0;
    }
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ANPC{");
        sb.append("presedinte='").append(presedinte).append('\'');
        sb.append(", nrAngajati=").append(nrAngajati);
        sb.append(", website='").append(website);
        sb.append(", nrProceseVerbaleEmise=").append(nrProceseVerbaleEmise).append('\'');
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
    public int getNrProceseVerbaleEmise() {
        return nrProceseVerbaleEmise;
    }
    public void setNrProceseVerbaleEmise(int nrProceseVerbaleEmise) {
        this.nrProceseVerbaleEmise = nrProceseVerbaleEmise;
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

    public ProcesVerbal emiteProcesVerbal(String denumireFirma, double amenda){
        if(!registry.containsKey(denumireFirma)){
            registry.put(denumireFirma, new ProcesVerbal(denumireFirma, new Date().toString(), amenda));
            this.nrProceseVerbaleEmise += 1;
        }
        return registry.get(denumireFirma);
    }
}
