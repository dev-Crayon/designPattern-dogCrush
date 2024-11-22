package factorymethod;

public class NewArrivalProductFactory implements ProductFactory {
    @Override
    public Double createPrice(Integer price) {
        return price * 1.0;
    }

    @Override
    public String createCategory(String category) {
        return "newArrival_" + category;
    }

    @Override
    public Double createDeliveryFee(Integer deliveryFee) {
        return Double.parseDouble(String.valueOf(deliveryFee));
    }
}
