package cts.Pirvu.Alexandru_Marian.g1097.singleton;

public class AreaConnection implements RoboticArmConnection {
    private double areaSize;
    private String status;
    private static AreaConnection instance = null;
    public static AreaConnection getInstance(double areaSize, String status){
        if(instance == null){
            instance = new AreaConnection(areaSize, status);
        }
        return instance;
    }
    private AreaConnection(double areaSize, String status) {
        this.areaSize = areaSize;
        this.status = status;
    }

    @Override
    public void connect() {
        System.out.println("Area connection realized");
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AreaConnection{");
        sb.append("areaSize=").append(areaSize);
        sb.append(", status='").append(status).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
