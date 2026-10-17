package ObserverPattern.listeners;

public class EmailEventListener implements EventListener{ // Email Type of Observers

    @Override
    public void update(String message){
        System.out.println("Email users : " + message);
    }

}
