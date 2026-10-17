package ObserverPattern.listeners;

public class MobileEventListener implements EventListener{

    @Override
    public void update(String message){
        System.out.println("Mobile users : " + message);
    }

}
