package cts.Pirvu.Alexandru_Marian.g1097.factory;

public class WarningReport implements TestReport {
    private int id;
    private String message;

    public WarningReport(int id, String message) {
        this.id = id;
        this.message = message;
    }

    @Override
    public void descriere() {
        System.out.println("Report with id " + id + " returned a warning, with the message: " + message);
    }
}
