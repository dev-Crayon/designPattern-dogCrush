package factorymethod;

public class Main {
    public static void main(String[] args) {
        Item item1 = new Item("timesale", 1000, 2500, "fashion");
        Item item2 = new Item("bestseller", 1000, 2500, "game");
        Item item3 = new Item("newarrival", 1000, 2500, "ticket");

        ProductGenerator productGenerator = new ProductGenerator();

        System.out.println(productGenerator.generateProduct(item1));
        System.out.println(productGenerator.generateProduct(item2));
        System.out.println(productGenerator.generateProduct(item3));
    }
}
