package clase;

public class Troleibuz extends InfoMijloc {
    @Override
    public void recomandaTransport(int distanta) {
        if(distanta < 3) {
            System.out.println("Se recomanda utilizare troleibuzului");
        } else {
            this.getUrmatorulMijloc().recomandaTransport(distanta);
        }
    }
}
