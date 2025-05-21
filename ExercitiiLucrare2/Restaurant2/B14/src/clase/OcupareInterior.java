package clase;

public class OcupareInterior extends TemplateOcupareMasa {
    @Override
    public void curatareMasa() {
        System.out.println("Se curata masa din interior");
    }

    @Override
    public void asezareServetele() {
        System.out.println("Se aseaza servetelele corespunzator");
    }

    @Override
    public void asezareTacamuri() {
        System.out.println("Se aseaza tacamurile corespunzator");
    }

    @Override
    public void invitarePersoane() {
        System.out.println("Persoanele au fost invitate sa se aseze la masa");
    }
}
