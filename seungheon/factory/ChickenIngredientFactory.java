package factory;

public class ChickenIngredientFactory implements KioskIngredientFactory {

    @Override
    public MainComponent createMainComponent() {
        return new Chicken();
    }

    @Override
    public Side createSide() {
        return new OnionRings();
    }

    @Override
    public Drink createDrink() {
        return new Water();
    }
}
