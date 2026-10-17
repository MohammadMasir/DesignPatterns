package StatePattern;

public class PlacedState implements OrderState{
    @Override
    public void pay(Order order) {
        System.out.println("Order Payment is Done successfully!");
        order.setState(new PaidState());
    }

    @Override
    public void ship(Order order) {
        System.out.println("Cannot ship Unpaid Order!");
    }

    @Override
    public void deliver(Order order) {
        System.out.println("Cannot deliver Order that is not Shipped!");
    }

    @Override
    public void cancel(Order order) {
        System.out.println("Order cancelled!");
        order.setState(new CancelledState());
    }
}
