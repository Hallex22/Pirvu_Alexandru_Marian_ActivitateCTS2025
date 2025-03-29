package Singleton.Registry;

public class Main {
    public static void main(String[] args) {
        ANPC anpc = ANPC.getInstance("Piedone", 100, "www.ANPC.ro");
        anpc.emiteProcesVerbal("KFC", 1000);
        ProcesVerbal procesKFC = anpc.emiteProcesVerbal("KFC", 100);
        System.out.println(procesKFC);
        System.out.println(anpc.toString());
    }
}
