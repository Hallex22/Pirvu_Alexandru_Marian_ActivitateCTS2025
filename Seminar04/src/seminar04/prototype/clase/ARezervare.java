package seminar04.prototype.clase;

public abstract class ARezervare {
    protected String numeClient;
    protected int nrPersoane;
    protected String data;
    protected String ora;

    public ARezervare() {
        this.numeClient = "N/A";
        this.nrPersoane = 2;
        this.data = "01.01.2025";
        this.ora = "12:00";
    }

    public ARezervare(String numeClient, int nrPersoane, String data, String ora) {
        if(numeClient.length() > 3){
            this.numeClient = numeClient;
        } else {
            this.numeClient="N/A";
        }
        if (nrPersoane > 2) {
            this.nrPersoane = nrPersoane;
        } else {
            this.nrPersoane = 2;
        }
        this.data = data;
        this.ora = ora;
    }

    public abstract void descriere();
    public abstract ARezervare copiaza();

}
