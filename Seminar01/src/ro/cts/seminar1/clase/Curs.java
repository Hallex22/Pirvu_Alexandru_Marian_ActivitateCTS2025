package ro.cts.seminar1.clase;

import ro.cts.seminar1.interfete.IPredabil;
import ro.cts.seminar1.interfete.IPersoana;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Curs {
    private String numeCurs;
    private int credite;
    private IPredabil profesor;
    private List<Student> studenti;

    public Curs() {
        numeCurs="CTS";
        credite = 5;
        profesor = (IPredabil) new Profesor();
        studenti = new ArrayList<>();
    }

    public Curs(String numeCurs, int credite, IPredabil profesor, List<Student> studenti) {
        this.numeCurs = numeCurs;
        this.credite = credite;
        this.profesor = profesor;
        this.studenti = studenti;
    }

    public String getNumeCurs() {
        return numeCurs;
    }

    public void setNumeCurs(String numeCurs) {
        this.numeCurs = numeCurs;
    }

    public int getCredite() {
        return credite;
    }

    public void setCredite(int credite) {
        this.credite = credite;
    }

    public IPredabil getProfesor() {
        return profesor;
    }

    public void afisareDetalii()
    {
        StringBuilder sb = new StringBuilder("La cursul ").
                append(this.numeCurs).append(" cu ").append(this.credite).
                append(" puncte credit ").append(" predat de ").
                append(((IPersoana)this.profesor).getNume()).
                append(" are ").append(studenti.size()).
                append(" studenti.");
        System.out.println(sb.toString());
    }

    public void sustineExamen(String data)
    {
        // Pe data X profesorul Y sustine examen la Z cu studentii:
        StringBuilder sb = new StringBuilder("Pe data de ").
                append(data).append(" profesorul ").
                append(((IPersoana)this.profesor).getNume()).
                append(" sustine examen la ").append(this.numeCurs).
                append(" cu studentii: ");
        System.out.println(sb.toString());
        studenti.forEach(s -> System.out.println(s.getNume()));
    }
}
