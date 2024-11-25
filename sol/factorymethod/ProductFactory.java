package factorymethod;

public interface ProductFactory {
    Double createPrice(Integer price);

    String createCategory(String category);

    Double createDeliveryFee(Integer deliveryFee);
}
