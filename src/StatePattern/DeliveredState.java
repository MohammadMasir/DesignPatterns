package StatePattern;

public class DeliveredState implements OrderState{
    @Override
    public void pay(Order order) {
        System.out.println("Invalid Request, Cannot pay again for Already Delivered Order!");
    }

    @Override
    public void ship(Order order) {
        System.out.println("Invalid Request, Order has been Delivered already thus cannot be Shipped!");
    }

    @Override
    public void deliver(Order order) {
        System.out.println("Invalid request, Order has been Delivered!");
    }

    @Override
    public void cancel(Order order) {
        System.out.println("Invalid request, cannot cancel a Delivered-Order!");
    }
}
