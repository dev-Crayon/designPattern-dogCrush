package observer;

import java.util.Observer;

// Subject : Car
public interface Car {
    public void registerObserver(CarObserver observer);

    public void removeObserver(CarObserver observer);

    public void notifyObservers();
}
