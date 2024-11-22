package factorymethod;

public class Product {
    String category;
    Double price;
    Double deliveryFee;
    String title;

    void setTitle(String title) {
        this.title = title;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setDeliveryFee(Double deliveryFee) {
        this.deliveryFee = deliveryFee;
    }

    @Override
    public String toString() {
        return "Product{" +
                "category='" + category + '\'' +
                ", price=" + price +
                ", deliveryFee=" + deliveryFee +
                ", title='" + title + '\'' +
                '}';
    }
}
