package factorymethod;

public class Item {
    String type;
    Integer priceSource;
    Integer deliveryFeeSource;
    String categorySource;

    public Item(String type, Integer priceSource, Integer deliveryFeeSource, String categorySource) {
        this.type = type;
        this.priceSource = priceSource;
        this.deliveryFeeSource = deliveryFeeSource;
        this.categorySource = categorySource;
    }

    public String getType() {
        return type;
    }

    public Integer getPriceSource() {
        return priceSource;
    }

    public Integer getDeliveryFeeSource() {
        return deliveryFeeSource;
    }

    public String getCategorySource() {
        return categorySource;
    }
}
