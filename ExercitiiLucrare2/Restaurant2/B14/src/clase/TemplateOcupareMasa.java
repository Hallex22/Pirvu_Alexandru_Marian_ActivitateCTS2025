package clase;

public abstract class TemplateOcupareMasa {
    public abstract void curatareMasa();
    public abstract void asezareServetele();
    public abstract void asezareTacamuri();
    public abstract void invitarePersoane();

    public final void ocupareMasa() {
        curatareMasa();
        asezareServetele();
        asezareTacamuri();
        invitarePersoane();
    }
}
