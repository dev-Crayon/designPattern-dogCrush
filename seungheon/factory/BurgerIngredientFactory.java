package factory;

public class BurgerIngredientFactory implements KioskIngredientFactory {

    @Override
    public MainComponent createMainComponent() {
        return new Burger();
    }

    @Override
    public Side createSide() {
        return new Fries();
    }

    @Override
    public Drink createDrink() {
        return new Cola();
    }
}
