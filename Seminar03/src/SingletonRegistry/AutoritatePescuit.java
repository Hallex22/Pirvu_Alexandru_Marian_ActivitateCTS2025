package SingletonRegistry;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class AutoritatePescuit {
    private String denumire;
    private String website;
    private int nrAngajati;

    private static AutoritatePescuit instance = null;

    private AutoritatePescuit(String denumire, String website, int nrAngajati) {
        this.denumire = denumire;
        this.website = website;
        this.nrAngajati = nrAngajati;
    }

    public static AutoritatePescuit getInstance() {
        if(instance == null){
            instance = new AutoritatePescuit("Autoritate", "autoritate.website.ro", 10);
        }
        return instance;
    }
    private Map<String, Autorizatie> registru = new HashMap<>();
    public Autorizatie emiteAutorizatie(String numePersoana) {
        if(!registru.containsKey(numePersoana)) {
            registru.put(numePersoana, new Autorizatie(numePersoana, new Date().toString(), registru.size()+1));
        }
        return registru.get(numePersoana);
    }


}
