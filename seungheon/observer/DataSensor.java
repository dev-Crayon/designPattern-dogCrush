package observer;

public interface DataSensor {

    void registerObserver(DataSensorObserver observer);

    void removeObserver(DataSensorObserver observer);

    void notifyObservers();
}
