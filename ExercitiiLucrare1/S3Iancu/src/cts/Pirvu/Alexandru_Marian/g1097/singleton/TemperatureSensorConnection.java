package cts.Pirvu.Alexandru_Marian.g1097.singleton;

public class TemperatureSensorConnection implements RoboticArmConnection {
    private double temperature;
    private String status;
    private static TemperatureSensorConnection instance = null;
    public static TemperatureSensorConnection getInstance(double temperature, String status){
        if(instance == null){
            instance = new TemperatureSensorConnection(temperature, status);
        }
        return instance;
    }
    private TemperatureSensorConnection(double temperature, String status) {
        this.temperature = temperature;
        this.status = status;
    }

    @Override
    public void connect() {
        System.out.println("Temperature sensor connection realized");
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("TemperatureSensorConnection{");
        sb.append("temperature=").append(temperature);
        sb.append(", status='").append(status).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
