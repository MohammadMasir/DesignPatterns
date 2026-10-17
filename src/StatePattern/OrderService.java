package StatePattern;

public class OrderService {

    public Order newOrder(String name){
        Order order = new Order(name);
        order.setState(new PlacedState());

        System.out.println("Current order Status : "+order.getOrderState());
        return order;
    }

    public void payOrder(Order order){
        order.pay();
        System.out.println("Current Order Status : "+order.getOrderState());
    }

    public void shipOrder(Order order){
        order.ship();
        System.out.println("Current Order status : "+order.getOrderState());
    }

    public void deliverOrder(Order order){
        order.deliver();
        System.out.println("Current Order Status : "+order.getOrderState());
    }

    public void cancelOrder(Order order){
        order.cancel();
        System.out.println("Current order Status : "+order.getOrderState());
    }

}
