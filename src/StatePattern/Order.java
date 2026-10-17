package StatePattern;

public class Order {
    private OrderState orderStatus = new PlacedState();

    private final String name;

    public Order(String name){
        this.name = name;
    }

    void setState(OrderState orderState){
        this.orderStatus = orderState;
    }

    String getOrderState(){
        return orderStatus.getClass().getSimpleName();
    }

    String getName(){
        return name;
    }

    void pay(){
        orderStatus.pay(this);
    }

    void ship(){
        orderStatus.ship(this);
    }

    void deliver(){
        orderStatus.deliver(this);
    }

    void cancel(){
        orderStatus.cancel(this);
    }

}
