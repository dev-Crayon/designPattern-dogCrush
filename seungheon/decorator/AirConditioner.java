package decorator;

public class AirConditioner extends CarDecorator {

    public AirConditioner(Car car) {
        super(car);
    }

    @Override
    public String getDescription() {
        return decoratedCar.getDescription() + ", 옵션: 에어컨";
    }

    @Override
    public double getPrice() {
        return decoratedCar.getPrice() + 1500.0;
    }
}
