package clase;

public class Autobuz extends InfoMijloc {
    @Override
    public void recomandaTransport(int distanta) {
        if (distanta < 5) {
            System.out.println("Se recomanda utilizarea autobuzului.");
        } else {
            this.getUrmatorulMijloc().recomandaTransport(distanta);
        }
    }
}
