package factory;

public class PizzaIngredientFactory implements KioskIngredientFactory {

    @Override
    public MainComponent createMainComponent() {
        return new Pizza();
    }

    @Override
    public Side createSide() {
        return new Spaghetti();
    }

    @Override
    public Drink createDrink() {
        return new Cider();
    }
}
