package ObserverPattern;

import ObserverPattern.listeners.EmailEventListener;
import ObserverPattern.listeners.MobileEventListener;
import ObserverPattern.service.NotificationService;

public class Main {

    public static void main(String[] args) {
        // Subject / Observable
        NotificationService notificationService = new NotificationService();
        // ObserverPattern.Store
        Store store = new Store(notificationService);

        // Different Types of Observers
        EmailEventListener emailListener = new EmailEventListener();
        MobileEventListener mobileListener = new MobileEventListener();

        notificationService.subscribe(emailListener);

        store.restoreProducts("Samsung");

        notificationService.subscribe(mobileListener);
        store.restoreProducts("iPhone");
    }

}
