package factory;

public abstract class Kiosk {

    protected abstract Order createOrder(String item);

    public Order processOrder(String type) {
        Order order = createOrder(type);
        System.out.println("--- Preparing order for: " + order.getName() + " ---");
        order.prepare();
        order.packageOrder();
        return order;
    }
}
