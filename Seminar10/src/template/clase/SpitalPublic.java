package template.clase;

public class SpitalPublic extends TemplateInternare {
    private String denumire;

    public SpitalPublic(String denumire) {
        this.denumire = denumire;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    int analizareDificultate(Pacient pacient) {
        return pacient.getGradDificultate();
    }

    @Override
    void verificareDisponibilitate() {
        System.out.println("Nu avem paturi suficiente in spitalul " + this.denumire);
    }

    @Override
    void emitereFisa(Pacient pacient) {
        System.out.println("Pacientul " + pacient.getNume() + " a fost internat la privat.");
    }
}
