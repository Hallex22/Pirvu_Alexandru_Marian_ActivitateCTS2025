package clase;

public abstract class ACont {
    protected String nume;
    protected String email;
    protected String parola;

    public ACont() {
        this.nume = "N/A";
        this.email = "N/A";
        this.parola = "N/A";
    }

    public ACont(String nume, String email, String parola) {
        try {
            Thread.sleep(3000);
            this.nume = nume;
            this.email = email;
            this.parola = parola;
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public abstract void rezerva();
    public abstract ACont copiaza();
}
