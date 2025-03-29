package Singleton.Eager;

public class Main {
    public static void main(String[] args) {
        ANPC agentie = ANPC.getInstance();
        System.out.println(agentie.toString());
        agentie.suspendaActivitatea("McDonald's");

        //
        ANPC agentie2 = ANPC.getInstance();
        agentie2.angajeaza(10);
        System.out.println(agentie.toString());

    }
}
