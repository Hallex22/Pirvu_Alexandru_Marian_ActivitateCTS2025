package clase;

public abstract class InfoMijloc {
    private InfoMijloc urmatorulMijloc;

    public InfoMijloc() {
    }

    public InfoMijloc getUrmatorulMijloc(){
        return urmatorulMijloc;
    }

    public void setUrmMijloc(InfoMijloc urmatorulMijloc) {
        this.urmatorulMijloc = urmatorulMijloc;
    }

    public abstract void recomandaTransport(int distanta);
}
