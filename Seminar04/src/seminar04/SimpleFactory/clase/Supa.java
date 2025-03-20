package seminar04.SimpleFactory.clase;

public abstract class Supa {
    private int gramaj;
    private double pretSutaGr;
    private String ingrediente;

    public Supa(int gramaj, double pretSutaGr, String ingrediente) {
        this.gramaj = gramaj;
        this.pretSutaGr = pretSutaGr;
        this.ingrediente = ingrediente;
    }

    public int getGramaj() {
        return gramaj;
    }

    public double getPretSutaGr() {
        return pretSutaGr;
    }

    public String getIngrediente() {
        return ingrediente;
    }

    public abstract void preparareSupa();
    public double calculeazaPret() {
        return pretSutaGr * gramaj / 100;
    }
}
