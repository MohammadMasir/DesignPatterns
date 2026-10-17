package StatePattern;

public class ShippedState implements OrderState {

    @Override
    public void pay(Order order) {
        System.out.println("Invalid Request, Cannot pay again for Already Shipped product!");
    }

    @Override
    public void ship(Order order) {
        System.out.println("Invalid Request, Order already Shipped");
    }

    @Override
    public void deliver(Order order) {
        System.out.println("Order Delivered Successfully!");
        order.setState(new DeliveredState());

    }

    @Override
    public void cancel(Order order) {
        System.out.println("Invalid Request, Cannot cancel a Shipped Order!");
    }

}
