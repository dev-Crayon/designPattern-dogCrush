package observer;

public class Main {
    public static void main(String[] args) {

        CarDataSensor carDataSensor = new CarDataSensor();
        SpeedObserver speedObserver = new SpeedObserver(carDataSensor);
        FuelObserver fuelObserver = new FuelObserver(carDataSensor);

        carDataSensor.registerObserver(speedObserver);
        carDataSensor.registerObserver(fuelObserver);

        carDataSensor.setMeasurements(120, 30);

        System.out.println("----------------------------");

        carDataSensor.setMeasurements(80, 10);

        System.out.println("----------------------------");

        carDataSensor.removeObserver(speedObserver);
        carDataSensor.setMeasurements(100, 100);
    }
}
