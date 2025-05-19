package clase;

import java.util.ArrayList;
import java.util.List;

public class Clasa implements CodeSubject {
    private String numeClasa;
    private List<CodeSubject> continut;

    public Clasa(String numeClasa) {
        this.numeClasa = numeClasa;
        this.continut = new ArrayList<CodeSubject>();
    }
    @Override
    public void adaugaNod(CodeSubject code) {
        continut.add(code);
    }
    @Override
    public void stergeNod(CodeSubject code) {
        continut.remove(code);
    }
    @Override
    public CodeSubject getNod(int index) {
        return continut.get(index);
    }
    @Override
    public void parsareCod() {
        System.out.println("Clasa " + numeClasa + " a fost parsata");
        for (CodeSubject code : continut) {
            code.parsareCod();
        }
    }

    @Override
    public void notificareObservatori() {

    }
}
