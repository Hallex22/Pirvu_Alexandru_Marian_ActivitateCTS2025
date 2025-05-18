package cts.Pirvu.Alexandru_Marian.g1097.factory;

public class SuccessReport implements TestReport {
    private int id;
    private String message;

    public SuccessReport(int id, String message) {
        this.id = id;
        this.message = message;
    }

    @Override
    public void descriere() {
        System.out.println("Report with id " + id + " is a success, with the message: " + message);
    }
}
