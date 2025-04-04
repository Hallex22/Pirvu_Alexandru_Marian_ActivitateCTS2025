package Singleton.StaticBlock;

public class Main {
    public static void main(String[] args) {
        ANPC agentie = ANPC.getInstance();
        agentie.suspendaActivitatea("KFC");
        System.out.println(agentie.toString());
    }
}
