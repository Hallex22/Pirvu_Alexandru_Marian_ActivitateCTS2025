package cts.Pirvu.Alexandru_Marian.g1097.factory;

public class ErrorReport implements TestReport {
    private int id;
    private String message;

    public ErrorReport(int id, String message) {
        this.id = id;
        this.message = message;
    }

    @Override
    public void descriere() {
        System.out.println("Report with id " + id + " returned an error, with the message: " + message);
    }
}
