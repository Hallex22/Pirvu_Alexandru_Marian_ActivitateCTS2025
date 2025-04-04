package builder;

import clase.Rezervare;

public class BuilderRezervare implements IBuilderRezervare {
    private boolean areAsezareLaGeam;
    private boolean areScauneErgonomice;
    private boolean areMasaDecorata;
    private boolean areMuzicaPersonalizata;
    private String genMuzical;
    public BuilderRezervare() {
        this.areAsezareLaGeam = false;
        this.areScauneErgonomice = false;
        this.areMasaDecorata = false;
        this.areMuzicaPersonalizata = false;
        this.genMuzical = "Pop";
    }
    public BuilderRezervare setAreAsezareLaGeam(boolean areAsezareLaGeam){
        this.areAsezareLaGeam = areAsezareLaGeam;
        return this;
    }
    public BuilderRezervare setAreScauneErgonomice(boolean areScauneErgonomice){
        this.areScauneErgonomice = areScauneErgonomice;
        return this;
    }
    public BuilderRezervare setAreMasaDecorata(boolean areMasaDecorata){
        this.areMasaDecorata = areMasaDecorata;
        return this;
    }
    public BuilderRezervare setAreMuzicaPersonalizata(boolean areMuzicaPersonalizata){
        this.areMuzicaPersonalizata = areMuzicaPersonalizata;
        return this;
    }
    public BuilderRezervare setGenMuzical(String genMuzical){
        this.genMuzical = genMuzical;
        return this;
    }

    @Override
    public Rezervare build() {
        return new Rezervare(this.areAsezareLaGeam, this.areScauneErgonomice,
                this.areMasaDecorata, this.areMuzicaPersonalizata, this.genMuzical);
    }
}
