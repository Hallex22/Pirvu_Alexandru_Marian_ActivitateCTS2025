package clase;

public class ProxyRezervare implements IRezervare {
    IRezervare rezervare;

    public ProxyRezervare(IRezervare rezervare) {
        this.rezervare = rezervare;
    }

    public void setRezervare(IRezervare rezervare) {
        this.rezervare = rezervare;
    }

    @Override
    public void efectuareRezervare(int nrPersoane) {
        if(nrPersoane < 4) {
            System.out.println("Nu este nevoie de rezervare, va puteti prezenta direct la restaurant.");
        } else {
            rezervare.efectuareRezervare(nrPersoane);
        }
    }
}
