package decorator;

public class LeatherSeats extends CarDecorator {

    public LeatherSeats(Car car) {
        super(car);
    }

    @Override
    public String getDescription() {
        return decoratedCar.getDescription() + ", 옵션: 가죽 시트";
    }

    @Override
    public double getPrice() {
        return decoratedCar.getPrice() + 2500.0;
    }
}
