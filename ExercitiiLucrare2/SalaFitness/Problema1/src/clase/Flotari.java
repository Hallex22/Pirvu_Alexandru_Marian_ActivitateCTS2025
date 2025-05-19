package clase;

public class Flotari implements IChallenge {
    @Override
    public void executareExercitiu(String nume) {
        System.out.println("Participantul " + nume + " a executat 100 de flotari");
    }
}
