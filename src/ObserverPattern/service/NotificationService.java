package ObserverPattern.service;

import ObserverPattern.listeners.EventListener;

import java.util.ArrayList;
import java.util.List;

public class NotificationService { // Subject

    List<EventListener> observers = new ArrayList<>();

    public void subscribe(EventListener listener){
        observers.add(listener);
    }

    public void remove(EventListener listener){
        observers.remove(listener);
    }

    public void notifyAllListeners(String productName){
        for (EventListener listener : observers){
            listener.update(productName+"is back in the ObserverPattern.Store!");
        }
    }

}
