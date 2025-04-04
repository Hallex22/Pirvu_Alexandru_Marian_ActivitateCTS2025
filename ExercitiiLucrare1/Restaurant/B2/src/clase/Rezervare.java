package clase;

public class Rezervare {
    private boolean areAsezareLaGeam;
    private boolean areScauneErgonomice;
    private boolean areMasaDecorata;
    private boolean areMuzicaPersonalizata;
    private String genMuzical;

    public Rezervare(boolean areAsezareLaGeam, boolean areScauneErgonomice, boolean areMasaDecorata, boolean areMuzicaPersonalizata, String genMuzical) {
        this.areAsezareLaGeam = areAsezareLaGeam;
        this.areScauneErgonomice = areScauneErgonomice;
        this.areMasaDecorata = areMasaDecorata;
        this.areMuzicaPersonalizata = areMuzicaPersonalizata;
        this.genMuzical = genMuzical;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rezervare{");
        sb.append("areAsezareLaGeam=").append(areAsezareLaGeam);
        sb.append(", areScauneErgonomice=").append(areScauneErgonomice);
        sb.append(", areMasaDecorata=").append(areMasaDecorata);
        sb.append(", areMuzicaPersonalizata=").append(areMuzicaPersonalizata);
        sb.append(", genMuzical='").append(genMuzical).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
