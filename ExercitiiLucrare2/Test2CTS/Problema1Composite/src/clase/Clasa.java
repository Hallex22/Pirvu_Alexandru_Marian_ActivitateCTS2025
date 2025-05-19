package clase;

import java.util.ArrayList;
import java.util.List;

public class Clasa implements Code {
    private String numeClasa;
    private List<Code> continut;

    public Clasa(String numeClasa) {
        this.numeClasa = numeClasa;
        this.continut = new ArrayList<Code>();
    }
    @Override
    public void adaugaNod(Code code) {
        continut.add(code);
    }
    @Override
    public void stergeNod(Code code) {
        continut.remove(code);
    }
    @Override
    public Code getNod(int index) {
        return continut.get(index);
    }
    @Override
    public void parsareCod() {
        System.out.println("Clasa " + numeClasa + " a fost parsata");
        for (Code code : continut) {
            code.parsareCod();
        }
    }
}
