package clase;

public class ClipVideo implements IClip {
    private int durata;

    public ClipVideo(int durata) {
        this.durata = durata;
    }

    @Override
    public void descriere() {
        System.out.println("Clipul video are durata de " + durata + " minute.");
    }
}
