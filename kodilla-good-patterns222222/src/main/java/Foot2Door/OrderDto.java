package Foot2Door;

public class OrderDto {
    private Order order;
    private boolean orderCompleted;

    public OrderDto(Order order, boolean orderCompleted) {
        this.order = order;
        this.orderCompleted = orderCompleted;
    }

    public Order getOrder() {
        return order;
    }

    public boolean isOrderCompleted() {
        return orderCompleted;
    }
}
