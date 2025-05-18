package cts.Pirvu.Alexandru_Marian.g1097.singleton;

public class InternetConnection implements RoboticArmConnection {
    public String method;
    public String status;

    private static InternetConnection instance = null;
    public static InternetConnection getInstance(String method, String status){
        if (instance == null){
            instance = new InternetConnection(method, status);
        }
        return instance;
    }

    private InternetConnection(String method, String status) {
        this.method = method;
        this.status = status;
    }

    @Override
    public void connect() {
        System.out.println("Internet connection done");
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("InternetConnection{");
        sb.append("method='").append(method).append('\'');
        sb.append(", status='").append(status).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
