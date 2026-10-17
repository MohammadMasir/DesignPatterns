package StatePattern;

public class Main {

    public static void main(String[] args) {
        OrderService orderService = new OrderService();

        // Placing a new Order
        Order placedOrder = orderService.newOrder("Order 1");

        // Trying to Ship the Order without Paying ||
        // Will throw error & Won't change the current State of the product
        orderService.shipOrder(placedOrder);

        // Now we Pay for the Order
        orderService.payOrder(placedOrder);

        // Cancelling the Order..
        orderService.cancelOrder(placedOrder);

    }

}
