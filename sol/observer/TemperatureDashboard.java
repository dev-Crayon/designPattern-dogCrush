package observer;

public class TemperatureDashboard implements CarObserver {
    private int temperature;
    private MyBentz car;

    public TemperatureDashboard(MyBentz car) {
        this.car = car;
        car.registerObserver(this);
    }
//    @Override
//    public void update(CarState carState) {
//        this.temperature = carState.temperature;
//        System.out.println("temperature: " + temperature);
//    }

    @Override
    public void update() {
        this.temperature = car.getCarState().temperature;
        System.out.println("temperature: " + temperature);
    }
}
