package observer;

import java.util.ArrayList;
import java.util.List;

public class CarDataSensor implements DataSensor {

    private List<DataSensorObserver> observers;
    private float speed;
    private float fuel;

    public CarDataSensor() {
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(DataSensorObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(DataSensorObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (DataSensorObserver observer : observers) {
            observer.update();
        }
    }

    public void measurementsChanged() {
        notifyObservers();
    }

    public void setMeasurements(float speed, float fuel) {
        this.speed = speed;
        this.fuel = fuel;
        measurementsChanged();
    }

    public float getSpeed() {
        return this.speed;
    }

    public float getFuel() {
        return this.fuel;
    }
}
