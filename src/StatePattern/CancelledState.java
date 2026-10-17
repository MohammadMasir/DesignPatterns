package StatePattern;

public class CancelledState implements OrderState{

    @Override
    public void pay(Order order) {
        System.out.println("Invalid Request, Order has been Cancelled!");
    }

    @Override
    public void ship(Order order) {
        System.out.println("Invalid Request, Order has been Cancelled!");
    }

    @Override
    public void deliver(Order order) {
        System.out.println("Invalid Request, Order has been Cancelled!");
    }

    @Override
    public void cancel(Order order) {
        System.out.println("Invalid Request, Order has been Cancelled!");
    }
}
