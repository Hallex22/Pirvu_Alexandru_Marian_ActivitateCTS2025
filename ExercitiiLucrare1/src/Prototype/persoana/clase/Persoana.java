package Prototype.persoana.clase;

public class Persoana extends APersoana {
    public Persoana() {
    }
    public Persoana(double inaltime, int greutate, String culoarePar, String culoareOchi) {
        super(inaltime, greutate, culoarePar, culoareOchi);
    }
    @Override
    public void descriere() {
        System.out.println("Persoana are inaltimea: " + inaltime + "m cu greutatea de "
                + greutate + " de kg si culoarea parului " + culoarePar +
                ", culoarea ochilor " + culoareOchi + ".");
    }
    @Override
    public APersoana copiaza() {
        APersoana persoana = new Persoana();
        persoana.setInaltime(this.inaltime);
        persoana.setGreutate(this.getGreutate());
        persoana.setCuloarePar(this.getCuloarePar());
        persoana.setCuloareOchi(this.getCuloareOchi());
        return persoana;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Persoana{");
        sb.append("inaltime=").append(inaltime);
        sb.append(", greutate=").append(greutate);
        sb.append(", culoarePar='").append(culoarePar).append('\'');
        sb.append(", culoareOchi='").append(culoareOchi).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
