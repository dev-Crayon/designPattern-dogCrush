package factory;

public class PizzaOrder extends Order {

    KioskIngredientFactory kioskIngredientFactory;

    public PizzaOrder(KioskIngredientFactory kioskIngredientFactory) {
        this.kioskIngredientFactory = kioskIngredientFactory;
    }

    @Override
    void prepare() {
        System.out.println("Preparing " + name);
        mainComponent = kioskIngredientFactory.createMainComponent();
        side = kioskIngredientFactory.createSide();
        drink = kioskIngredientFactory.createDrink();
    }
}
