package factory;

public interface KioskIngredientFactory {

    MainComponent createMainComponent();
    Side createSide();
    Drink createDrink();
}
