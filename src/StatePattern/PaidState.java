package StatePattern;

public class PaidState implements OrderState{

    @Override
    public void pay(Order order) {
        System.out.println("Payment Already Done for the Order : "+order.getName());
//        throw new RuntimeException("")
    }

    @Override
    public void ship(Order order) {
        System.out.println("Order Successfully Shipped now Out-For-Delivery!");
        order.setState(new ShippedState());
    }

    @Override
    public void deliver(Order order) {
        System.out.println("Cannot deliver Order before Shipping it!");
    }

    @Override
    public void cancel(Order order) {
        System.out.println("Order cancelled");
        order.setState(new CancelledState());
    }
}
