package observer;

public class FuelDashboard implements CarObserver {
    private int fuel;

    @Override
    public void update(CarState carState) {
        this.fuel = carState.fuel;
        System.out.println("fuel: " + fuel);
    }
}
