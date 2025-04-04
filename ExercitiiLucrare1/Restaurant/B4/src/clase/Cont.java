package clase;

public class Cont extends ACont {

    public Cont(){
    }

    public Cont(String nume, String email, String parola) {
        super(nume, email, parola);
    }

    @Override
    public ACont copiaza() {
        ACont cont = new Cont();
        cont.nume = this.nume;
        cont.email = this.email;
        cont.parola = this.parola;
        return cont;
    }

    public void rezerva(){
        System.out.println("Clientul " + nume + " cu email-ul " + email
                + " a rezervat o masa.");
    }
}
