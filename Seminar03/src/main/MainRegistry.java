package main;

import SingletonRegistry.AutoritatePescuit;
import SingletonRegistry.Autorizatie;

public class MainRegistry {
    public static void main(String[] args) {
        AutoritatePescuit autoritatePescuit = AutoritatePescuit.getInstance();
        Autorizatie autorizatie1 = autoritatePescuit.emiteAutorizatie("LeBron James");
        System.out.println(autorizatie1.toString());
        Autorizatie autorizatie2 = autoritatePescuit.emiteAutorizatie("LeBron James");
        System.out.println(autorizatie2);
    }
}
