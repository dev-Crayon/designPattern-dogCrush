package factory;

public abstract class Order {
    String name;

    MainComponent mainComponent;
    Side side;
    Drink drink;

    abstract void prepare();

    void packageOrder() {
        System.out.println("Packing order in a branded bag");
    }

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("---- ").append(name).append(" ----\n");
        if (mainComponent != null) {
            result.append(mainComponent);
            result.append("\n");
        }
        if (side != null) {
            result.append(side);
            result.append("\n");
        }
        if (drink != null) {
            result.append(drink);
            result.append("\n");
        }

        return result.toString();
    }
}
