package factory;

public class BurgerOrder extends Order {

    KioskIngredientFactory kioskIngredientFactory;

    public BurgerOrder(KioskIngredientFactory kioskIngredientFactory) {
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
