package flyweight.clase;

public class Pacient implements PacientAbstract {
    private String nume;
    private String nrTelefon;
    private String adresaEmail;

    protected Pacient(String nume, String nrTelefon, String adresaEmail) {
        this.nume = nume;
        this.nrTelefon = nrTelefon;
        this.adresaEmail = adresaEmail;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Pacient{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", nrTelefon='").append(nrTelefon).append('\'');
        sb.append(", adresaEmail='").append(adresaEmail).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void afiseazaPacient(Spitalizare spitalizare) {
        System.out.println(this.toString());
        System.out.println(spitalizare);
    }
}
