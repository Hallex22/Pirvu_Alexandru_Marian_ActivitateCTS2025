package clase;

public class FisaMedicala {
    private String numePersoana;
    private int gravitate;
    private String solutionare;

    public FisaMedicala(String numePersoana, int gravitate, String solutionare) {
        this.numePersoana = numePersoana;
        this.gravitate = gravitate;
        this.solutionare = solutionare;
    }

    public void setSolutionare(String solutionare) {
        this.solutionare = solutionare;
    }

    public void descriere() {
        if (this != null) {
            System.out.println("Fisa medicala pentru pacientul " + numePersoana);
            System.out.println("Gravitate: " + gravitate);
            System.out.println("Solutionare: " + solutionare);
        } else {
            System.out.println("Nu a fost necesara generarea unei fise medicale");
        }
    }
}
