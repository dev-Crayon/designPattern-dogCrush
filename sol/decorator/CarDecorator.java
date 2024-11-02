package decorator;

public abstract class CarDecorator implements Car {
    protected Car optionedCar;

    public CarDecorator(Car optionedCar) {
        this.optionedCar = optionedCar;
    }

    public void assemble() {
        this.optionedCar.assemble();
    }
}
