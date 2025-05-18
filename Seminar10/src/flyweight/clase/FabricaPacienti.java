package flyweight.clase;

import java.util.HashMap;

public class FabricaPacienti {
    private HashMap<String, PacientAbstract> colectiePacienti;

    public FabricaPacienti() {
        this.colectiePacienti = new HashMap<String, PacientAbstract>();
    }

    public PacientAbstract getPacient(String nrTelefon) throws Exception {
        PacientAbstract pacientAbstract = colectiePacienti.get(nrTelefon);
        if(pacientAbstract == null){
            throw new Exception("Nr. de telefon nu exista");
        }
        return pacientAbstract;
    }

    public PacientAbstract getPacient(String nrTelefon, String nume, String adresaEmail){
        PacientAbstract pacient = colectiePacienti.get(nrTelefon);
        if(pacient == null) {
            pacient = new Pacient(nume, nrTelefon, adresaEmail);
            colectiePacienti.put(nrTelefon, pacient);
        }
        return pacient;
    }
}
