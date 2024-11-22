package factorymethod;

public class BestsellerProductFactory implements ProductFactory {
    @Override
    public Double createPrice(Integer price) {
        return Double.parseDouble(String.valueOf(price));
    }

    @Override
    public String createCategory(String category) {
        return "bestseller_" + category;
    }

    @Override
    public Double createDeliveryFee(Integer deliveryFee) {
        return deliveryFee * 0.9;
    }
}
