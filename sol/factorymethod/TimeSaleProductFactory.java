package factorymethod;

public class TimeSaleProductFactory implements ProductFactory {
    @Override
    public Double createPrice(Integer price) {
        return price * 0.9;
    }

    @Override
    public String createCategory(String category) {
        return "timesale_" + category;
    }

    @Override
    public Double createDeliveryFee(Integer deliveryFee) {
        return deliveryFee * 0.8;
    }
}
