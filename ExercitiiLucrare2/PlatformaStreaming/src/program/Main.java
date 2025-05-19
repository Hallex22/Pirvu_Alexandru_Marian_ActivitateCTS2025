package program;

import clase.AClipDecorator;
import clase.ClipDecoratorReclama;
import clase.ClipVideo;
import clase.IClip;

public class Main {
    public static void main(String[] args) {
        IClip clipVideo = new ClipVideo(10);
        ClipDecoratorReclama clipCuReclame = new ClipDecoratorReclama(clipVideo, 2);

        clipVideo.descriere();
        System.out.println("-----------");
        clipCuReclame.descriere();
        clipCuReclame.rulareReclama();
    }
}