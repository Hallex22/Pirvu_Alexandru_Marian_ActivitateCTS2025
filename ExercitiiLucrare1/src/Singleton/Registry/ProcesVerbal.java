package Singleton.Registry;

public class ProcesVerbal {
    private String denumireFirma;
    private String dataEmitere;
    private double amenda;

    public ProcesVerbal(String denumireFirma, String dataEmitere, double amenda) {
        this.denumireFirma = denumireFirma;
        this.dataEmitere = dataEmitere;
        this.amenda = amenda;
    }

    public String getDenumireFirma() {
        return denumireFirma;
    }

    public void setDenumireFirma(String denumireFirma) {
        this.denumireFirma = denumireFirma;
    }

    public String getDataEmitere() {
        return dataEmitere;
    }

    public void setDataEmitere(String dataEmitere) {
        this.dataEmitere = dataEmitere;
    }

    public double getAmenda() {
        return amenda;
    }

    public void setAmenda(double amenda) {
        this.amenda = amenda;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ProcesVerbal{");
        sb.append("denumireFirma='").append(denumireFirma).append('\'');
        sb.append(", dataEmitere='").append(dataEmitere).append('\'');
        sb.append(", amenda=").append(amenda);
        sb.append('}');
        return sb.toString();
    }
}
