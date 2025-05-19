package clase;

public class ClipDecoratorReclama extends AClipDecorator {
    private int durataReclama;

    public ClipDecoratorReclama(IClip clipVideo, int durataReclama) {
        super(clipVideo);
        this.durataReclama = durataReclama;
    }

    @Override
    public void descriere() {
        clipVideo.descriere();
        System.out.println("De asemenea, are reclame care dureaza " + durataReclama);
    }
    public void rulareReclama() {
        System.out.println("Ruleaza reclama cu durata de " + durataReclama);
    }
}
