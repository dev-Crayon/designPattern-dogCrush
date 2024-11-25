package factorymethod;

public class ProductGenerator {
    public Product generateProduct(Item item) {
        ProductFactory factory = getFactory(item.getType());

        Product product = new Product();
        product.setPrice(factory.createPrice(item.getPriceSource()));
        product.setCategory(factory.createCategory(item.getCategorySource()));
        product.setDeliveryFee(factory.createDeliveryFee(item.getDeliveryFeeSource()));
        product.setTitle(getTitle(item.getType()));
        // 이렇게 다른 product 외 다른 객체도 생성
        return product;
    }

    private ProductFactory getFactory(String type) {
        return switch (type) {
            case "timesale" -> new TimeSaleProductFactory();
            case "bestseller" -> new BestsellerProductFactory();
            case "newarrival" -> new NewArrivalProductFactory();
            default -> throw new IllegalArgumentException("Unsupported product type: " + type);
        };
    }

    private String getTitle(String type) {
        return switch (type) {
            case "timesale" -> "타임세일 상품";
            case "bestseller" -> "베스트셀러 상품";
            case "newarrival" -> "신착아이템 상품";
            default -> throw new IllegalArgumentException("Unsupported product type: " + type);
        };
    }
}

