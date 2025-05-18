package clase;

public class Tramvai extends InfoMijloc {
    @Override
    public void recomandaTransport(int distanta) {
        if(distanta < 10) {
            System.out.println("Se recomanda utilizare tramvaiului");
        } else {
            this.getUrmatorulMijloc().recomandaTransport(distanta);
        }
    }
}
