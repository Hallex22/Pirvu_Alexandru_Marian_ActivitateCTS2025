package clase;

import java.util.HashMap;

public class ClientFactory {

    private HashMap<String, IClient> listaClienti;

    public ClientFactory() {
        this.listaClienti = new HashMap<String, IClient>();
    }

    public IClient getClient(String nume, String nrTelefon, String email) {
        if(listaClienti.containsKey(nume)) {
            return listaClienti.get(nume);
        } else {
            return listaClienti.put(nume, new Client(nume, nrTelefon, email));
        }
    }
}
