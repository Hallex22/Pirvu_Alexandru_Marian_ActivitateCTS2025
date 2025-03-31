package seminar04.prototype.clase;

public class Rezervare extends ARezervare {

    public Rezervare() {
    }

    public Rezervare(String numeClient, int nrPersoane, String data, String ora) {
        super(numeClient, nrPersoane, data, ora);
    }

    @Override
    public void descriere() {
        System.out.println("Descriere");
    }
    @Override
    public ARezervare copiaza() {
        ARezervare rezervareNoua = new Rezervare();

        rezervareNoua.numeClient = this.numeClient;
        rezervareNoua.nrPersoane = this.nrPersoane;
        rezervareNoua.data = this.data;
        rezervareNoua.ora = this.ora;

        return rezervareNoua;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rezervare{");
        sb.append("numeClient='").append(numeClient).append('\'');
        sb.append(", nrPersoane=").append(nrPersoane);
        sb.append(", data='").append(data).append('\'');
        sb.append(", ora='").append(ora).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
