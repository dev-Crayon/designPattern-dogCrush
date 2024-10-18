package observer;

public class FuelObserver implements DataSensorObserver{

    private final CarDataSensor sensor;
    private float fuel;

    public FuelObserver(CarDataSensor sensor) {
        this.sensor = sensor;
    }

    @Override
    public void update() {
        this.fuel = sensor.getFuel();
        displayFuel();
    }

    public void displayFuel() {
        if (this.fuel < 0 || this.fuel > 100) {
            System.out.println("측정값에 오류가 발생했습니다.");
        } else {
            String message = (this.fuel <= 20) ? "연료의 양이 20% 미만입니다. 현재 연료: " : "현재 연료: ";
            System.out.println(message + this.fuel + "%");
        }
    }
}
