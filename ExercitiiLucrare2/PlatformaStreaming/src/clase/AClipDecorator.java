package clase;

public abstract class AClipDecorator implements IClip {
    protected IClip clipVideo;

    public AClipDecorator(IClip clipVideo) {
        this.clipVideo = clipVideo;
    }

    public abstract void descriere();
}
