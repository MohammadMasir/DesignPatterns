package ObserverPattern;

import ObserverPattern.service.NotificationService;

public class Store {

    NotificationService notificationService;

    public Store(NotificationService notificationService){
        this.notificationService = notificationService;
    }

    public void restoreProducts(String productName){
//        String productName = "Samsung";
        notificationService.notifyAllListeners(productName);
    }

}
