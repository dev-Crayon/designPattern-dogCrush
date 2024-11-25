package factory;

public class Main {
    public static void main(String[] args) {

        Kiosk burgerKiosk = new Kiosk() {
            @Override
            protected Order createOrder(String item) {
                KioskIngredientFactory ingredientFactory = new BurgerIngredientFactory();
                Order order = new BurgerOrder(ingredientFactory);
                order.setName("Burger Combo");
                return order;
            }
        };

        Order order = burgerKiosk.processOrder("BurgerCombo");
        System.out.println(order);

        Kiosk chickenKiosk = new Kiosk() {
            @Override
            protected Order createOrder(String item) {
                KioskIngredientFactory ingredientFactory = new ChickenIngredientFactory();
                Order order = new ChickenOrder(ingredientFactory);
                order.setName("Chicken Combo");
                return order;
            }
        };

        Order chickenOrder = chickenKiosk.processOrder("ChickenCombo");
        System.out.println(chickenOrder);

        Kiosk pizzaKiosk = new Kiosk() {
            @Override
            protected Order createOrder(String item) {
                KioskIngredientFactory ingredientFactory = new PizzaIngredientFactory();
                Order order = new PizzaOrder(ingredientFactory);
                order.setName("Pizza Combo");
                return order;
            }
        };

        Order pizzaOrder = pizzaKiosk.processOrder("PizzaCombo");
        System.out.println(pizzaOrder);
    }
}
