package observer;

public class TemperatureDashboard implements CarObserver {
    private int temperature;

    @Override
    public void update(CarState carState) {
        this.temperature = carState.temperature;
        System.out.println("temperature: " + temperature);
    }
}
