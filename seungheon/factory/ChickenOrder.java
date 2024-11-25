package factory;

public class ChickenOrder extends Order {

    KioskIngredientFactory kioskIngredientFactory;

    public ChickenOrder(KioskIngredientFactory kioskIngredientFactory) {
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
