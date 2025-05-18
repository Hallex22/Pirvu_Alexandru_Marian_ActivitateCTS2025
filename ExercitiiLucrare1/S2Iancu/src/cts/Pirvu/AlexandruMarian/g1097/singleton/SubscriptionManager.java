package cts.Pirvu.AlexandruMarian.g1097.singleton;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SubscriptionManager implements AbstractSubscriptionManager {
    private String name;
    private Set<Integer> subscriptions = new HashSet<>();
    private static SubscriptionManager instance = null;

    public synchronized static SubscriptionManager getInstance(String name){
        if (instance == null){
            instance = new SubscriptionManager(name);
        }
        return instance;
    }
    private SubscriptionManager(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SubscriptionManager{");
        sb.append("name='").append(name).append('\'');
        sb.append(", subscriptions=").append(subscriptions);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void addSubcription(int id) {
        if(!subscriptions.contains(id)){
            subscriptions.add(id);
        } else {
            System.out.println("Id:" + id + " already in list");
        }

    }
}
