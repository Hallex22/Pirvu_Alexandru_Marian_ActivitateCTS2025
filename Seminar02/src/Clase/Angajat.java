package Clase;

import java.util.Arrays;

public class Angajat extends Aplicant{
    private String ocupatie;
    private int salariu;
    private static float sumaFinantata = 10;
    public Angajat() {
        super();

    }
    public Angajat(String nume, String prenume, int varsta, int punctaj, int nrProiecte, String[] denumire_Proiecte,int salariu,String ocupatie) {
        super(nume,prenume,varsta,punctaj,nrProiecte,denumire_Proiecte);
        this.salariu = salariu;
        this.ocupatie = ocupatie;
    }
    public String getOcupatie() {
        return ocupatie;
    }
    public void setOcupatie(String ocupatie) {
        this.ocupatie = ocupatie;
    }
    public int getSalariu() {
        return salariu;
    }
    public void setSalariu(int salariu) {
        this.salariu = salariu;
    }

    @Override
    public String toString() {
        return "Angajat: Nume=" + nume + ", Prenume=" + prenume
                + ", Varsta=" + varsta + ", Punctaj=" + punctaj + ", Nr Proiecte=" + nrProiecte + ", DenumireProiect="
                + Arrays.toString(denumireProiect) + "Ocupatie=" + ocupatie + ", salariu=" + salariu;
    }

    public void afiseazaFinantare() {
        // TODO Auto-generated method stub
        System.out.println("Angajatul " + getNume() + " " + getPrenume() + " primeste" + sumaFinantata + " Euro/zi in proiect.");
    }

}
