package cts.Pirvu.AlexandruMarian.g1097.main;

import cts.Pirvu.AlexandruMarian.g1097.builder.BuilderPublication;
import cts.Pirvu.AlexandruMarian.g1097.builder.IBuilderPublication;
import cts.Pirvu.AlexandruMarian.g1097.builder.Publication;
import cts.Pirvu.AlexandruMarian.g1097.singleton.SubscriptionManager;

public class Main {
    public static void main(String[] args) {
        // Exercitiul 1
        SubscriptionManager singleton = SubscriptionManager.getInstance("Singleton");
        singleton.addSubcription(1);
        singleton.addSubcription(2);
        singleton.addSubcription(1);
        SubscriptionManager singleton2 = SubscriptionManager.getInstance("Test");
        System.out.println(singleton2);

        // Exercitiul 2
        IBuilderPublication builder = new BuilderPublication("Libris", 100);
        Publication publication = builder.build();
        builder.setNumberOfPages(50).setHasAuthor(true);
        Publication publication1 = builder.build();
        System.out.println(publication);
        System.out.println(publication1);
    }
}