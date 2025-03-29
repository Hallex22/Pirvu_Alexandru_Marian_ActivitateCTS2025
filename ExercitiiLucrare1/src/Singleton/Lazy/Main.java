package Singleton.Lazy;

public class Main {
    public static void main(String[] args) {
        ANPC agentie = ANPC.getInstance("Piedone", 100, "www.ANPC.ro");
        ANPC agentie2 = ANPC.getInstance("Alex", 100, "www.ANPC.ro");

        System.out.println(agentie2);

        agentie.concediaza(10);
        System.out.println(agentie2);
    }
}
