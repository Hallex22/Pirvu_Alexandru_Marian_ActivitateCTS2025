package clase;

public class OcupareExterior extends TemplateOcupareMasa {
    @Override
    public void curatareMasa() {
        System.out.println("Se curata masa din exterior");
    }

    @Override
    public void asezareServetele() {
        System.out.println("Sunt asezate servetele sa nu fie suflate de vant");
    }

    @Override
    public void asezareTacamuri() {
        System.out.println("Sunt asezate tacamurile corespunzator");
    }

    @Override
    public void invitarePersoane() {
        System.out.println("Persoanele sunt invitate sa se aseze la masa");
    }
}
