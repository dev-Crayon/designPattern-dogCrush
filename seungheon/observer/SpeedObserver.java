package observer;

public class SpeedObserver implements DataSensorObserver {

    private final CarDataSensor sensor;
    private float speed;

    public SpeedObserver(CarDataSensor sensor) {
        this.sensor = sensor;
    }

    @Override
    public void update() {
        this.speed = sensor.getSpeed();
        displaySpeed();
    }

    public void displaySpeed() {
        if (this.speed < 0) {
            System.out.println("측정값에 오류가 발생했습니다.");
        } else {
            String message = (this.speed >= 100) ? "100km/h 이상입니다. 현재 속도: " : "현재 속도: ";
            System.out.println(message + this.speed + "km/h");
        }
    }
}
